package study_IO.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/study_IO/filterstream/FilterStreamTest.txt"));
			
			bw.write("Hello");
			bw.write("world");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("src/study_IO/filterstream/FilterStreamTest.txt"));
			
			int value = 0;
			
			while((value = br.read()) != -1) {
				
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
