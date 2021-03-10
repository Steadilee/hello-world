package study_SWING01.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFramestudy1 extends JFrame {
	
	public JFramestudy1() {		//	상속을 이용한 프레임 생성
		
		this.setBounds(300, 200, 800, 500);
		
		this.setTitle("Frame1");		//	이름생성
		
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.JPEG")));		//	상단 이미지 변경
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setResizable(true);		// 크기조절
		this.setVisible(true);			// 화면출력
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//x(닫기버튼)클릭시 프로세스 종료
	}
}
