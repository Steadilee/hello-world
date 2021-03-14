package study_SWING02.Layout;

import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayoutstudy  {
	
	public C_GridLayoutstudy () {
		
		JFrame mf = new JFrame();
		
		mf.setTitle("그리드 레이아웃");
		
		mf.setBounds(300, 200, 800, 500);
		mf.setLayout(new GridLayout(5,5));
		
		Set set = new LinkedHashSet();
		
		while(set.size() < 25) {
			
			set.add(new Random().nextInt(25) + 1);
		}
		
		System.out.println(set);
		Object[] obj = set.toArray();
		
		for(int i = 0; i < obj.length; i++) {

			String str = new Integer((int)obj[i]).toString();
			mf.add(new JButton(str));
			
		}
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new C_GridLayoutstudy();
	}

}
