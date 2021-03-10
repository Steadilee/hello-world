package study_IO.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application4 {

	public static void main(String[] args) {
		
		Application4VO[] outputMembers = {
				new Application4VO(4,"채치수","센터",194.2,3),
				new Application4VO(11,"서태웅","포워드",188.8,1),				
				new Application4VO(7,"송태섭","가드",174,2),				
		};
		
		ObjectOutputStream objOut = null;
		
		try {
//			objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/study_IO/filterstream/objectOutputStream.txt",true)));
			if(new File("src/study_IO/filterstream/objectOutputStream.txt").exists()) {
				objOut = new Application4OutputStream(new BufferedOutputStream(new FileOutputStream("src/study_IO/filterstream/objectOutputStream.txt",true)));
			} else {
				objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/study_IO/filterstream/objectOutputStream.txt",true)));
			}
			
			for(int i = 0; i < outputMembers.length; i++) {
				
				objOut.writeObject(outputMembers[i]);
			}
			objOut.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		ObjectInputStream objIn = null;
		
		Application4VO[] inputMembers = new Application4VO[3];
		try {
			objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/study_IO/filterstream/objectOutputStream.txt")));
			
			while(true) {
				
					System.out.println((Application4VO)objIn.readObject());
			}
		} catch(EOFException e) {
			System.out.println("없음");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
				
	}
}
