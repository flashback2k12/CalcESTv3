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
	private JTextField txtArbeitsMittel;
	private JTextField txtTelefonKosten;

	
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
		
		
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Uebergabe Daten fuer Werbungskosten in Global Klasse DataWK.java
				 */
				DataWK.dataWK.setArbeitstage(Integer.parseInt(txtArbeitsTage.getText()));
				DataWK.dataWK.setSpendenGezahlt(Double.parseDouble(txtSpendenGezahlt.getText()));
				DataWK.dataWK.setKrankheitsKosten(Double.parseDouble(txtKrankheitsKosten.getText()));
				DataWK.dataWK.setArbeitsMittel(Double.parseDouble(txtArbeitsMittel.getText())); 
				DataWK.dataWK.setTelefonKosten(Double.parseDouble(txtTelefonKosten.getText()));
								
				/*
				 * Oeffnung der AuswertungsGUI
				 */
				AuswertungsBildschirm awb = new AuswertungsBildschirm();
				awb.setVisible(true); 
				
			}
		});
		btnWeiter.setBounds(12, 366, 117, 25);
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
		btnZurueck.setBounds(307, 366, 117, 25);
		contentPane.add(btnZurueck);
		
		JLabel lblArbeitstage = new JLabel("Arbeitstage:");
		lblArbeitstage.setBounds(12, 48, 167, 15);
		contentPane.add(lblArbeitstage);
		
		JLabel lblSpenden = new JLabel("Spenden:");
		lblSpenden.setBounds(12, 74, 167, 15);
		contentPane.add(lblSpenden);
		
		JLabel lblKrankheitskosten = new JLabel("Krankheitskosten:");
		lblKrankheitskosten.setBounds(12, 100, 167, 15);
		contentPane.add(lblKrankheitskosten);
		
		txtArbeitsTage = new JTextField();
		txtArbeitsTage.setBounds(197, 45, 177, 19);
		contentPane.add(txtArbeitsTage);
		txtArbeitsTage.setColumns(10);
		
		txtSpendenGezahlt = new JTextField();
		txtSpendenGezahlt.setColumns(10);
		txtSpendenGezahlt.setBounds(197, 71, 177, 19);
		contentPane.add(txtSpendenGezahlt);
		
		txtKrankheitsKosten = new JTextField();
		txtKrankheitsKosten.setColumns(10);
		txtKrankheitsKosten.setBounds(197, 97, 177, 19);
		contentPane.add(txtKrankheitsKosten);
		
		JLabel lblArbeitsmittel = new JLabel("Arbeitsmittel:");
		lblArbeitsmittel.setBounds(12, 126, 167, 14);
		contentPane.add(lblArbeitsmittel);
		
		txtArbeitsMittel = new JTextField();
		txtArbeitsMittel.setColumns(10);
		txtArbeitsMittel.setBounds(197, 123, 177, 19);
		contentPane.add(txtArbeitsMittel);
		
		JLabel lblTelefonkosten = new JLabel("Telefonkosten:");
		lblTelefonkosten.setBounds(12, 151, 167, 14);
		contentPane.add(lblTelefonkosten);
		
		txtTelefonKosten = new JTextField();
		txtTelefonKosten.setColumns(10);
		txtTelefonKosten.setBounds(197, 148, 177, 19);
		contentPane.add(txtTelefonKosten);
		
		
		
		
	}
}
