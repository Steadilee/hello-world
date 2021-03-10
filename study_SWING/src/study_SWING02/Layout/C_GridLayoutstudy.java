package study_SWING02.Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayoutstudy extends JFrame {
	
	
	public C_GridLayoutstudy () {
		
		super("GridLayout");
		
		this.setBounds(300,200,800,500);
		
		this.setLayout(new GridLayout(3,3));
		
		for(int i = 0; i < 9; i++) {
			this.add(new JButton(i+""));
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	

}
