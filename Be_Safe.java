package turkey_hack;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Be_Safe extends JFrame {

	private JTextArea chatarea = new JTextArea();
	private JTextArea chatarea1 = new JTextArea();
	private  JTextField chatbot = new JTextField();
	private final JLabel lblLbl = new JLabel("lbl1");
	private final JLabel lblLbl_1 = new JLabel("lbl2");

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Be_Safe frame = new Be_Safe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Be_Safe() {
		chatbot.setBounds(0, 354, 416, 33);
		chatbot.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		
		setContentPane(contentPane);
		
		contentPane.add(chatbot);
		java.awt.Image img1 = new ImageIcon(this.getClass().getResource("/9.jpg")).getImage();
		lblLbl_1.setBounds(415, 236, 101, 97);
		java.awt.Image img2 = new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		lblLbl_1.setIcon(new ImageIcon(img2));
		
		contentPane.add(lblLbl_1);
		lblLbl.setBounds(415, 47, 101, 103);
		lblLbl.setIcon(new ImageIcon(img1));
		
		contentPane.add(lblLbl);
		contentPane.add(chatarea);
		//txtarea
		chatarea.setSize(416, 140);
		chatarea.setLocation(0, 212);
		
		chatarea1.setBounds(0, 26, 416, 140);
		contentPane.add(chatarea1);
		
		chatbot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String gtext= chatbot.getText().toLowerCase();
				chatarea.append("YOU : " +gtext+ "\n");
				
				chatbot.setText(" ");
				
				if(gtext.contains("who are you")){
					bot("Hola");
					bot(" This BeSafe bot helps you to avoid bad profils ^_^ ");
					bot(" Be Carefull you are using unrespectfull words ...");
				}
				else{
					int rand =(int)( Math.random()*3 +1);
					if(rand==1){
					bot(" I don't understand  you !");
					}else if(rand==2){
						bot(" I don't understand  you bro !");
					}
					else if(rand==1){
						bot(" Please Come Again!");
					}
				}
			}
		});
	}

private void bot (String string ){
	chatarea1.append("Bot : " + string +"\n");
}
}
