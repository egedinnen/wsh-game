package turkey_hack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class post extends JFrame {

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
					post frame = new post();
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
	public post() {
		setBackground(new Color(255, 228, 225));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		java.awt.Image img2 = new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(61, 68, 109, 111);
		contentPane.add(lblNewLabel);
		
		JLabel lblYouChoosedA = new JLabel("You choosed a new post ");
		lblYouChoosedA.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblYouChoosedA.setForeground(new Color(255, 228, 225));
		lblYouChoosedA.setBounds(32, 203, 188, 14);
		contentPane.add(lblYouChoosedA);
		
		JButton btnJoinOther = new JButton("Join other Now");
		btnJoinOther.setBackground(new Color(255, 228, 225));
		btnJoinOther.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnJoinOther.setBounds(183, 263, 149, 38);
		btnJoinOther.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				secondf sec= new secondf();
				sec.setVisible(true);
				
			}
		});
		contentPane.add(btnJoinOther);
	}

}
