package study_IO.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/study_IO/stream/FileWriter.txt");
			
//			fw.write("하이루");
			fw.write(new char[] {'j','a','v','a'});
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			if(fw != null) {
				
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/study_IO/stream/FileWriter.txt");
			
			char[] charr = new char[(int)new File("src/study_IO/stream/FileWriter.txt").length()];
			
			fr.read(charr);
			for(char ch : charr) {
				System.out.print(ch + ",");
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			if(fr != null) {
				
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
}
