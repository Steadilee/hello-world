package study_SWING03.component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_RadioButton {
	
	public D_RadioButton() {
		
		JFrame mf = new JFrame();
		
		mf.setTitle("라디오 버튼");
		
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("사이즈 선택");
		panel.add(label);
		
		JPanel sizePanel = new JPanel();
		JButton small = new JButton("small size");
		JButton medium = new JButton("medium size");
		JButton large = new JButton("large size");
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		JPanel resultPanel = new JPanel();
		JLabel resultText = new JLabel("선택된 것이 없음");
		resultPanel.add(resultText);
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultText.setText("small size 가 선택되었음");
			}
		});
		
		
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultText.setText("medium size 가 선택되었음");
			}
		});
		
		
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultText.setText("large size 가 선택되었음");
			}
		});
		
		mf.add(panel, "North");
		mf.add(sizePanel, "Center");
		mf.add(resultPanel, "South");
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new D_RadioButton();
	}
	

}
