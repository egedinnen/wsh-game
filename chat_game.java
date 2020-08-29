package turkey_hack;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chat_game extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chat_game frame = new chat_game();
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
	public chat_game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 488);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(87, 88, 226, 276);
		java.awt.Image img1 = new ImageIcon(this.getClass().getResource("/j.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		contentPane.add(lblNewLabel);
		
		JButton btnJoin = new JButton("Join Us");
		btnJoin.setBackground(new Color(255, 228, 225));
		btnJoin.setFont(new Font("Tekton Pro", Font.BOLD, 18));
		btnJoin.setBounds(90, 363, 211, 61);
		contentPane.add(btnJoin);
		
		JLabel lblBeSafeOnline = new JLabel("BE BRAVE ONLINE");
		lblBeSafeOnline.setForeground(new Color(0, 0, 0));
		lblBeSafeOnline.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 27));
		lblBeSafeOnline.setBounds(63, 37, 285, 62);
		contentPane.add(lblBeSafeOnline);
		btnJoin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
		 		avatar  insc=new avatar();
		 		insc.setVisible(true);
		 		insc.setLocationRelativeTo(null);
				
			}
		});
		
	}
}
