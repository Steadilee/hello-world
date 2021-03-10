package study_IO.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {		// File에 기록
			fos = new FileOutputStream("src/study_IO/stream/FileOutputStream.txt");
			
			//fos.write(1);
			byte[] barr = new byte[] {98,99,100,101};
			//fos.write(barr);
			fos.write(barr, 1, 2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		FileInputStream fis = null;
		try {		//File값 불러오기
			fis = new FileInputStream("src/study_IO/stream/FileOutputStream.txt");
			
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println(value);
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
