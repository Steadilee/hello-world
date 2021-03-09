package study_IO.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("src/study_IO/stream/FileInputStreamTest");
			
//			int value;
//			while((value = fis.read()) != -1) {
//				System.out.println(value);
//				
//				System.out.println((char)value);
//			}
			
			byte[] barr = new byte[(int)new File("src/study_IO/stream/FileInputStreamTest").length()];
			
			fis.read(barr);
			
			for(byte b : barr) {
				System.out.println(b);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			if(fis != null) {
				try {
					fis.close();
					
				} catch (IOException e) {
					e.printStackTrace();
					
				}
			}
		}
	}
	
	
	
	
}
