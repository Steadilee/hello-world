package study_SWING03.component;

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

public class A_TextTest  {
	
	public static void main(String[] args) {
		
		JFrame mf = new  JFrame();
		
		JPanel pn = new JPanel();
		pn.setLayout(new GridLayout(3,2));
		
		JTextField id = new  JTextField(30);
		pn.add(new JLabel("ID"));
		pn.add(id);
		
		JPasswordField pwd = new JPasswordField(30);
		pn.add(new JLabel("PASSWORD"));
		pn.add(pwd);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		JButton btn = new JButton("보내기");
		mf.add(pn, "North");
		mf.add(textArea, "Center");
		mf.add(btn, "South");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				
				char[] pass = pwd.getPassword();
				String passWord = ""; 
				for(char p : pass) {
					passWord += new Character(p).toString();
				}
				text += "password = " + passWord + "\n";
				textArea.append(text);
			}
		});
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
