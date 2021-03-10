package study_SWING01.container;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFramestudy2 {

	public void makeFrame() {
		
		JFrame mainFrame = new JFrame();
		
		mainFrame.setTitle("Frame2");
		
		mainFrame.setBounds(new Rectangle(300,200,800,500));
		
		try {
			mainFrame.setIconImage(ImageIO.read(new File("images/icon.JPEG")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
