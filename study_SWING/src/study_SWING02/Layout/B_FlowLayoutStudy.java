package study_SWING02.Layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayoutStudy extends JFrame{

	public B_FlowLayoutStudy() {

		super("FlowLayout");
		
		this.setBounds(300,200,800,500);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));		//기본값
		this.setLayout(new FlowLayout(FlowLayout.LEADING));		//왼쪽
		this.setLayout(new FlowLayout(FlowLayout.TRAILING));	//오른쪽
		
		for(int i = 0; i < 15; i++) {
			this.add(new JButton(i + ""));
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
