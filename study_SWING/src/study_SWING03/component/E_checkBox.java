package study_SWING03.component;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_checkBox {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame();
		
		String[] fruits = {"apple", "orange", "banana", "mango", "grape"};
		
		JCheckBox[] buttons = new JCheckBox[fruits.length];
		JPanel checkPanel = new JPanel();
		
		for(int i= 0; i < buttons.length; i++) {
			
			buttons[i] = new JCheckBox(fruits[i]);
			checkPanel.add(buttons[i]);
		}
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("선택된 과일 없음");
		resultPanel.add(text);
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					
					String result = "";
					int count = 0;
					
					for(int i = 0; i < buttons.length; i++) {
						if(buttons[i].isSelected()) {
							result += buttons[i].getText() +" ";
							count++;
						}
					}
					text.setText(result);
					
					if(count == 0) {
						text.setText("선택한 과일이 없습니다.");
					}
				}
			});
		}
		
		mf.add(checkPanel,"North");
		mf.add(resultPanel,"Center");
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
