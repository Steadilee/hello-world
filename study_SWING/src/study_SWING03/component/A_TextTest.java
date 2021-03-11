package study_SWING03.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest {
	
	public static void main(String[] args) {
		
		JFrame mf = new JFrame();
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3,2));
		
		JTextField id = new JTextField(30);
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		JPasswordField password = new JPasswordField(30);
		panel.add(new JLabel("PASSWORD"));
		panel.add(password);
		
		JTextArea textArea = new JTextArea(10,30);
		textArea.setEditable(false);
		
		JButton btn = new JButton("보내기");
		
		mf.add(panel, BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				
				text += "password = " + password.getPassword() + "\n";
				
				char[] pass = password.getPassword();
				
				for(char p : pass) {
					System.out.print(p);
				}
				textArea.append(text);
			}
		});
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
