package test2;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JApplet.*;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class first extends JApplet {

	/**
	 * Create the applet.
	 */
	
	public void init(){
		
	}
	
	
	public void stop(){
		
	}
	public first() {
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblHhhh = new JLabel("hhhh");
		java.awt.Image img= new ImageIcon(this.getClass().getResource("/j.jpg")).getImage();
		lblHhhh.setIcon(new ImageIcon(img));
		lblHhhh.setBounds(82, 59, 248, 178);
		getContentPane().add(lblHhhh);
		
		JButton btnNewButton = new JButton("Join Us");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second sec = new second();
				sec.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 228, 225));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.setBounds(138, 243, 125, 35);
		getContentPane().add(btnNewButton);
		
		JLabel lblBeBraveOnline = new JLabel("BE BRAVE ONLINE");
		lblBeBraveOnline.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblBeBraveOnline.setBounds(106, 11, 236, 37);
		getContentPane().add(lblBeBraveOnline);

	}
}
