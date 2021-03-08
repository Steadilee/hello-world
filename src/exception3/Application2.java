package exception3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
	
	public static void main(String[] args) {
		
		try(BufferedReader in =  new BufferedReader(new FileReader("test.dat"))){
			
			String s;
			
			while((s=in.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
