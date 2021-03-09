package study_IO.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {
	
	FileReader fr = null;
	
	try {
		fr = new FileReader("src/study_IO/stream/FileReaderTest");
		
//		int value = 0;
//		
//		while ((value = fr.read()) != -1) {
//			
//			System.out.print((char)value);
//		}
		
		char[] charr = new char[(int)new File("src/study_IO/stream/FileReaderTest").length()];
		
		fr.read(charr);
		
		for(char ch : charr) {
			System.out.print(ch);
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
