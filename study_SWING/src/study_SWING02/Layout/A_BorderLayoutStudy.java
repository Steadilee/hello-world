package study_SWING02.Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayoutStudy extends JFrame{

	public A_BorderLayoutStudy() {
		
		super("BorederLayout");
		
		this.setBounds(300,200,800,500);
		
		this.setLayout(new BorderLayout());
		
		System.out.println(this.getLayout());
		
		JButton north = new JButton("북");
		
		this.add(north,"North");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


}
