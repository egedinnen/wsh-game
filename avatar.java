package turkey_hack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class avatar extends JFrame {

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
					avatar frame = new avatar();
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
	public avatar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	
		java.awt.Image img= new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		
		JLabel lblChooseYoutAvatar = new JLabel("Choose yout avatar and add new post ");
		lblChooseYoutAvatar.setForeground(Color.WHITE);
		lblChooseYoutAvatar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblChooseYoutAvatar.setBackground(new Color(255, 228, 196));
		lblChooseYoutAvatar.setBounds(69, 308, 299, 63);
		contentPane.add(lblChooseYoutAvatar);
		JLabel label_1= new JLabel();
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				post po= new post();
				po.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon(img));
		label_1.setBounds(34, 47, 98, 94);
		contentPane.add(label_1);
		
		JLabel lblH = new JLabel("h");
		lblH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				post1 po= new post1();
				po.setVisible(true);
			}
		});
		java.awt.Image img1= new ImageIcon(this.getClass().getResource("/3.jpg")).getImage();
		lblH.setIcon(new ImageIcon(img1));
		lblH.setBounds(155, 47, 98, 94);
		contentPane.add(lblH);
		
		JLabel lblJ = new JLabel("j");
		lblJ.setBounds(282, 47, 86, 94);
		java.awt.Image img2= new ImageIcon(this.getClass().getResource("/4.jpg")).getImage();
		lblJ.setIcon(new ImageIcon(img2));
		contentPane.add(lblJ);
		
		JLabel lblG = new JLabel("g");
		lblG.setBounds(34, 187, 98, 87);
		java.awt.Image img3= new ImageIcon(this.getClass().getResource("/5.jpg")).getImage();
		lblG.setIcon(new ImageIcon(img3));
		contentPane.add(lblG);
		
		JLabel lblT = new JLabel("t");
		lblT.setBounds(165, 187, 88, 87);
		java.awt.Image img4= new ImageIcon(this.getClass().getResource("/6.jpg")).getImage();
		lblT.setIcon(new ImageIcon(img4));
		contentPane.add(lblT);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(282, 187, 86, 90);
		java.awt.Image img5= new ImageIcon(this.getClass().getResource("/7.jpg")).getImage();
		lblM.setIcon(new ImageIcon(img5));
		contentPane.add(lblM);
	}
}
