package study_SWING02.Layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {
	
	public D_CardLayout() {
		
		super("CardLayout");
		
		this.setBounds(300, 200, 800, 500);
		
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		card1.setBackground(Color.white);
		card2.setBackground(Color.black);
		card3.setBackground(new Color(30,30,30));
		
		card1.add(new JLabel("card1"), "1");
		card2.add(new JLabel("card2"), "2");
		card3.add(new JLabel("card3"), "3");
		
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		card1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card1.getParent());
				} 
				if(e.getButton() == 3) {
					card.previous(card1.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card2.getParent());
				} 
				if(e.getButton() == 3) {
					card.previous(card2.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card3.getParent());
				} 
				if(e.getButton() == 3) {
					card.previous(card3.getParent());
				}
				super.mouseClicked(e);
			}
		});
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
