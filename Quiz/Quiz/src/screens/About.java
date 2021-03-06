package screens;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import auxClasses.ButtonDone;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class About extends JFrame {

	private JPanel contentPane;

	public About() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 310, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Components
		
		JLabel lblTitle = new JLabel("ABOUT");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setBounds(0, 11, 304, 66);
		contentPane.add(lblTitle);
		
		JLabel lblsubTitle = new JLabel("Us");
		lblsubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblsubTitle.setForeground(new Color(255, 204, 0));
		lblsubTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblsubTitle.setBounds(0, 43, 304, 66);
		contentPane.add(lblsubTitle);
		
		JLabel About = new JLabel("<html><center>We are David and Matheus, and<br>we've developed this quiz.<br>I hope you like it :)</center></html>");
		About.setHorizontalAlignment(SwingConstants.CENTER);
		About.setForeground(Color.GRAY);
		About.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		About.setBounds(0, 104, 304, 75);
		contentPane.add(About);
		
		JLabel lblDevelopedBy = new JLabel("Developed by:");
		lblDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopedBy.setForeground(Color.GRAY);
		lblDevelopedBy.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblDevelopedBy.setBounds(26, 190, 113, 25);
		contentPane.add(lblDevelopedBy);
		
		JLabel lblName = new JLabel("David & Matheus");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblName.setBounds(143, 190, 133, 25);
		contentPane.add(lblName);
		
		JLabel lblCurrentVersion = new JLabel("Version:");
		lblCurrentVersion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurrentVersion.setForeground(Color.GRAY);
		lblCurrentVersion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblCurrentVersion.setBounds(10, 214, 138, 25);
		contentPane.add(lblCurrentVersion);
		
		JLabel lblVersion = new JLabel("1.0");
		lblVersion.setHorizontalAlignment(SwingConstants.LEFT);
		lblVersion.setForeground(Color.WHITE);
		lblVersion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblVersion.setBounds(152, 214, 113, 25);
		contentPane.add(lblVersion);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About.this.dispose();
			}
		});
		btnBack.setBounds(89, 262, 124, 33);
		ButtonDone.onButton(btnBack);
		contentPane.add(btnBack);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(About.class.getResource("/imgs/homelander.jpg")));
		background.setBounds(0, 0, 304, 339);
		contentPane.add(background);
				
	}

}