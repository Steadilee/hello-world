package study_SWING03.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButton {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("라디오버튼");
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("사이즈 선택");
		topPanel.add(label);
		
		JPanel sizePanel = new JPanel();
		
		JRadioButton small = new JRadioButton("Small size");
		JRadioButton medium = new JRadioButton("medium size");
		JRadioButton large = new JRadioButton("large size");
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		JPanel panel = new JPanel();
		JLabel text = new JLabel("크기선택 안 됨");
		panel.add(text);
		
		mf.add(topPanel);
		mf.add(sizePanel);
		mf.add(panel);
		
		small.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Small size 선택");
			}
		});
		
		medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Medium size 선택");
			}
		});

		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Large size 선택");
			}
		});
		
		mf.add(topPanel, "North");
		mf.add(sizePanel, "Center");
		mf.add(panel, "South");
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
