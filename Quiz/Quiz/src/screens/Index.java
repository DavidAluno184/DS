package screens;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import auxClasses.ButtonDone;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;

	public Index() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);

		
		// Components
		
		JLabel lblQuiz = new JLabel("QUIZ");
		lblQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuiz.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		lblQuiz.setForeground(Color.WHITE);
		lblQuiz.setBounds(0, 11, 304, 66);
		contentPane.add(lblQuiz);

		JLabel lblSeries = new JLabel("Series");
		lblSeries.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeries.setForeground(new Color(255, 204, 0));
		lblSeries.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblSeries.setBounds(0, 43, 304, 66);
		contentPane.add(lblSeries);
		
		JLabel lblByEtecDe = new JLabel("By Etec de Guaiacity");
		lblByEtecDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblByEtecDe.setForeground(new Color(255, 204, 0));
		lblByEtecDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblByEtecDe.setBounds(0, 266, 304, 44);
		contentPane.add(lblByEtecDe);
		
		JButton btnStart = new JButton("START");
		btnStart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Questions questions = new Questions();
				questions.setVisible(true);
			}
		});
		btnStart.setBounds(90, 120, 124, 33);
		ButtonDone.onButton(btnStart);
		contentPane.add(btnStart);
		
		JButton btnHowToPlay = new JButton("HOW TO PLAY");
		btnHowToPlay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HowToPlay howToPlay = new HowToPlay();
				howToPlay.setVisible(true);
			}
		});
		btnHowToPlay.setBounds(90, 164, 124, 33);
		ButtonDone.onButton(btnHowToPlay);
		contentPane.add(btnHowToPlay);
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About about = new About();
				about.setVisible(true);
			}
		});
		btnAbout.setBounds(90, 208, 124, 33);
		ButtonDone.onButton(btnAbout);
		contentPane.add(btnAbout);
		
		JLabel background = new JLabel("");
		background.setBounds(-23, 0, 375, 482);
		background.setIcon(new ImageIcon(Index.class.getResource("/imgs/os-melhores-wallpaper-de-heisenbrg-e-pink-7.jpg")));
		contentPane.add(background);
		

	}
	
}