package turkey_hack;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class secondf extends JFrame {

	private JPanel contentPane;
	private JTextArea chatarea = new JTextArea();
	private JTextArea chatarea1 = new JTextArea();
	private  JTextField chatbot = new JTextField();
	private final JLabel lblLbl = new JLabel("lbl1");
	private final JLabel lblLbl_1 = new JLabel("lbl2");
	private final JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondf frame = new secondf();
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
	public secondf() {
		chatbot.setBounds(0, 370, 416, 33);
		chatbot.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		
		setContentPane(contentPane);
		
		contentPane.add(chatbot);
		java.awt.Image img1 = new ImageIcon(this.getClass().getResource("/7.jpg")).getImage();
		lblLbl_1.setBounds(415, 244, 101, 97);
		java.awt.Image img2 = new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		lblLbl_1.setIcon(new ImageIcon(img2));
		
		contentPane.add(lblLbl_1);
		lblLbl.setBounds(415, 60, 101, 103);
		lblLbl.setIcon(new ImageIcon(img1));
		
		contentPane.add(lblLbl);
		contentPane.add(chatarea);
		//txtarea
		chatarea.setSize(416, 135);
		chatarea.setLocation(0, 224);
		chatarea1.setBounds(0, 41, 416, 135);
		
		contentPane.add(chatarea1);
		
		chatbot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String gtext= chatbot.getText().toLowerCase();
				chatarea.append("YOU : " +gtext+ "\n");
				
				chatbot.setText(" ");
				
				if(gtext.contains("hi")){
					bot("Hola");
					bot(" how are you ? ");
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
				if (gtext.contains("sexy")){
					dispose();
					Be_Safe bs= new Be_Safe();
					bs.setVisible(true);
		
				}
			}
		});
	}
	
	
	private void bot (String string ){
		chatarea1.append("Bot : " + string +"\n");
	}

}
