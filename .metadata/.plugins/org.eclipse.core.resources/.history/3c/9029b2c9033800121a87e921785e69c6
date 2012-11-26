package userInterFace;

import globalVar.DataWK;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import outputFrame.AuswertungsBildschirm;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class WerbungsKostenBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4154928514180445194L;
	private JPanel contentPane;
	private JTextField txtArbeitsTage;
	private JTextField txtSpendenGezahlt;
	private JTextField txtKrankheitsKosten;

	
	/**
	 * Create the frame.
	 */
	public WerbungsKostenBildschirm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngabenZuWerbungskosten = new JLabel("Angaben zu Werbungskosten:");
		lblAngabenZuWerbungskosten.setFont(lblAngabenZuWerbungskosten.getFont().deriveFont(lblAngabenZuWerbungskosten.getFont().getStyle() | Font.BOLD));
		lblAngabenZuWerbungskosten.setBounds(12, 22, 249, 15);
		contentPane.add(lblAngabenZuWerbungskosten);
		
		final JLabel lblEntfernungskilometer = new JLabel("Entfernungskilometer: ");
		lblEntfernungskilometer.setBounds(12, 49, 279, 15);
		contentPane.add(lblEntfernungskilometer);
		
		
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Uebergabe Daten für Werbungskosten in Global Klasse DataWK.java
				 */
				DataWK.dataWK.setArbeitstage(Integer.parseInt(txtArbeitsTage.getText()));
				DataWK.dataWK.setSpendenGezahlt(Double.parseDouble(txtSpendenGezahlt.getText()));
				DataWK.dataWK.setKrankheitsKosten(Double.parseDouble(txtKrankheitsKosten.getText()));
								
				/*
				 * Oeffnung der AuswertungsGUI
				 */
				AuswertungsBildschirm awb = new AuswertungsBildschirm();
				awb.setVisible(true); 
				
			}
		});
		btnWeiter.setBounds(12, 376, 117, 25);
		contentPane.add(btnWeiter);
		
		JButton btnZurueck = new JButton("zurueck");
		btnZurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * zurueck zur vorherigen GUI
				 */
				GehaltsScheinBildschirm gsb = new GehaltsScheinBildschirm(); 
				gsb.setVisible(true); 				
				
			}
		});
		btnZurueck.setBounds(317, 376, 117, 25);
		contentPane.add(btnZurueck);
		
		JButton btnClickMe = new JButton("Click");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * EntfernungsKilometer aus DataWK.java holen
				 */
				lblEntfernungskilometer.setText("Entfernungskilometer: " + DataWK.dataWK.getEntfernungWA());
				
			}
		});
		btnClickMe.setBounds(359, 44, 75, 25);
		contentPane.add(btnClickMe);
		
		JLabel lblArbeitstage = new JLabel("Arbeitstage:");
		lblArbeitstage.setBounds(12, 103, 167, 15);
		contentPane.add(lblArbeitstage);
		
		JLabel lblSpenden = new JLabel("Spenden:");
		lblSpenden.setBounds(12, 132, 167, 15);
		contentPane.add(lblSpenden);
		
		JLabel lblKrankheitskosten = new JLabel("Krankheitskosten:");
		lblKrankheitskosten.setBounds(12, 159, 167, 15);
		contentPane.add(lblKrankheitskosten);
		
		txtArbeitsTage = new JTextField();
		txtArbeitsTage.setBounds(197, 101, 177, 19);
		contentPane.add(txtArbeitsTage);
		txtArbeitsTage.setColumns(10);
		
		txtSpendenGezahlt = new JTextField();
		txtSpendenGezahlt.setColumns(10);
		txtSpendenGezahlt.setBounds(197, 130, 177, 19);
		contentPane.add(txtSpendenGezahlt);
		
		txtKrankheitsKosten = new JTextField();
		txtKrankheitsKosten.setColumns(10);
		txtKrankheitsKosten.setBounds(197, 157, 177, 19);
		contentPane.add(txtKrankheitsKosten);
		
		
		
		
	}
}
