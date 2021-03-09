package study_IO.file;

import java.io.File;
import java.io.IOException;

public class Application1 {
	
	public static void main(String[] args) {
		
		File file = new File("src/study_IO/file/test.txt");
		try {
				
			System.out.println("생성여부 : " + file.createNewFile());	// 파일 생성 및 생성여부 반환
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(file.length());		//	파일크기
		System.out.println(file.getPath());		//	파일경로
		System.out.println(file.getParent());		//	상위경로
		System.out.println(file.getAbsolutePath());		//	절대경로
		
//		System.out.println(file.delete());		//	파일삭제
	}
	
	
	

}
