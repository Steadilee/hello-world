package study_IO.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		
		DataOutputStream dous = null;
		
		try {
			dous = new DataOutputStream(new FileOutputStream("src/study_IO/filterstream/DataOutputStreamTest.txt"));
			
			dous.writeUTF("강백호");
			dous.writeInt(10);
			dous.writeChar('F');
			dous.writeUTF("채치수");
			dous.writeInt(4);
			dous.writeChar('C');
			dous.writeUTF("송태섭");
			dous.writeInt(7);
			dous.writeChar('G');
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			if(dous != null) {
				
				try {
					
					dous.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		DataInputStream din = null;
		
		try {
			din = new DataInputStream(new FileInputStream("src/study_IO/filterstream/DataOutputStreamTest.txt"));
			
			while(true) {
				
				System.out.println(din.readUTF() + ", " + din.readInt() + din.readChar());
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (EOFException e) {
			
			System.out.println("파일 읽기 끝");
		}
		catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			if(din != null) {
				
				try {
					
					din.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
}
