package test2;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;

public class second extends JApplet {

	/**
	 * Create the applet.
	 */
	
	public void init(){
		
	}
	
	public void stop(){
		
	}
	public second() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblH = new JLabel("");
		java.awt.Image img= new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		lblH.setIcon(new ImageIcon(img));
		getContentPane().add(lblH);
		
		JLabel lblJ = new JLabel("");
		java.awt.Image img1= new ImageIcon(this.getClass().getResource("/3.jpg")).getImage();
		lblJ.setIcon(new ImageIcon(img1));
		getContentPane().add(lblJ);
		
		JLabel lblU = new JLabel("");
		java.awt.Image img2= new ImageIcon(this.getClass().getResource("/4.png")).getImage();
		lblU.setIcon(new ImageIcon(img2));
		getContentPane().add(lblU);
		
		
		
		JLabel lblF = new JLabel("");
		java.awt.Image img3= new ImageIcon(this.getClass().getResource("/5.jpg")).getImage();
		lblF.setIcon(new ImageIcon(img3));
		getContentPane().add(lblF);
		
		JLabel lblP = new JLabel("");
		java.awt.Image img5= new ImageIcon(this.getClass().getResource("/7.jpg")).getImage();
		lblP.setIcon(new ImageIcon(img5));
		getContentPane().add(lblP);
		
		JLabel label = new JLabel("");
		java.awt.Image img4= new ImageIcon(this.getClass().getResource("/6.jpg")).getImage();
		label.setIcon(new ImageIcon(img4));
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		getContentPane().add(label_1);
		
		JLabel lblChooseYourAvatar = new JLabel("Choose your avatar and make a new post ");
		lblChooseYourAvatar.setForeground(Color.WHITE);
		lblChooseYourAvatar.setBackground(new Color(255, 228, 225));
		lblChooseYourAvatar.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
		getContentPane().add(lblChooseYourAvatar);
		

	}

}
