package userInterFace;

import globalVar.DataWK;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StartBildschirmV2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	/*
	 * Initialisierung RadioButtons mit Default 0 = NOcheck
	 */
	
	int BUTTONGEHALTSSCHEIN = 0;
	int BUTTONKILOMETERARBEIT = 0;
	int BUTTONARBEITSTAGE = 0;
	int BUTTONSPENDEN = 0;
	int BUTTONKRANKHEITSKOSTEN = 0;
	int BUTTONWERBUNGSKOSTEN = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartBildschirmV2 frame = new StartBildschirmV2();
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
	public StartBildschirmV2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBerechnungDerEinkommensteuer = new JLabel("Berechnung der Einkommensteuer");
		lblBerechnungDerEinkommensteuer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBerechnungDerEinkommensteuer.setHorizontalAlignment(SwingConstants.CENTER);
		lblBerechnungDerEinkommensteuer.setBounds(100, 32, 272, 18);
		contentPane.add(lblBerechnungDerEinkommensteuer);
		
		JRadioButton rdbtnGehaltsschein = new JRadioButton("Gehaltsschein");
		rdbtnGehaltsschein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					BUTTONGEHALTSSCHEIN = 1; 		
					
			}
		});
		rdbtnGehaltsschein.setBounds(6, 100, 160, 23);
		contentPane.add(rdbtnGehaltsschein);
		
		JRadioButton rdbtnKilometerZurArbeit = new JRadioButton("Kilometer zur Arbeit");
		rdbtnKilometerZurArbeit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BUTTONKILOMETERARBEIT = 1;
				
			}
		});
		rdbtnKilometerZurArbeit.setBounds(6, 130, 272, 23);
		contentPane.add(rdbtnKilometerZurArbeit);
		
		JRadioButton rdbtnArbeitsTage = new JRadioButton("Arbeitstage");
		rdbtnArbeitsTage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BUTTONARBEITSTAGE = 1; 
				
			}
		});
		rdbtnArbeitsTage.setBounds(6, 160, 272, 23);
		contentPane.add(rdbtnArbeitsTage);
		
		JLabel lblBentigteUnterlagen = new JLabel("ben\u00F6tigte Unterlagen / Angaben: ");
		lblBentigteUnterlagen.setFont(lblBentigteUnterlagen.getFont().deriveFont(lblBentigteUnterlagen.getFont().getStyle() | Font.BOLD));
		lblBentigteUnterlagen.setBounds(10, 80, 281, 14);
		contentPane.add(lblBentigteUnterlagen);
		
		JLabel lblOptinal = new JLabel("optinal:");
		lblOptinal.setFont(lblOptinal.getFont().deriveFont(lblOptinal.getFont().getStyle() | Font.BOLD));
		lblOptinal.setBounds(10, 200, 156, 14);
		contentPane.add(lblOptinal);
		
		JRadioButton rdbtnSpenden = new JRadioButton("Spenden");
		rdbtnSpenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BUTTONSPENDEN = 1;
				DataWK.dataWK.setClickSpenden(BUTTONSPENDEN); 
				
			}
		});
		rdbtnSpenden.setBounds(10, 220, 156, 23);
		contentPane.add(rdbtnSpenden);
		
		JRadioButton rdbtnKrankheitsKosten = new JRadioButton("Krankheitskosten");
		rdbtnKrankheitsKosten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BUTTONKRANKHEITSKOSTEN = 1;
				DataWK.dataWK.setClickKrankheitsKosten(BUTTONKRANKHEITSKOSTEN);
				
			}
		});
		rdbtnKrankheitsKosten.setBounds(10, 250, 272, 23);
		contentPane.add(rdbtnKrankheitsKosten);
		
		JRadioButton rdbtnWerbungskosten = new JRadioButton("Werbungskosten");
		rdbtnWerbungskosten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BUTTONWERBUNGSKOSTEN = 1;
				DataWK.dataWK.setClickWerbungsKosten(BUTTONWERBUNGSKOSTEN); 
				
			}
		});
		rdbtnWerbungskosten.setBounds(10, 280, 149, 23);
		contentPane.add(rdbtnWerbungskosten);
		
			
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((BUTTONGEHALTSSCHEIN == 1) & (BUTTONKILOMETERARBEIT == 1) & (BUTTONARBEITSTAGE == 1) & (BUTTONSPENDEN == 1) & (BUTTONKRANKHEITSKOSTEN == 1) & (BUTTONWERBUNGSKOSTEN == 1)) 
				{
					AdressBildschirm ab = new AdressBildschirm();
					ab.setVisible(true);
				}
				else if ((BUTTONGEHALTSSCHEIN == 1) & (BUTTONKILOMETERARBEIT == 1) & (BUTTONARBEITSTAGE == 1))
				{
					AdressBildschirm ab = new AdressBildschirm();
					ab.setVisible(true);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "eine / mehrere Angabe(n) fehlen", "Information", JOptionPane.INFORMATION_MESSAGE); 
				}
				
			}
		});
		btnWeiter.setBounds(10, 328, 89, 23);
		contentPane.add(btnWeiter);
		
		
	}
}
