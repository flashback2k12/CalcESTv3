package userInterFace;

import globalVar.DataGehalt;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class GehaltsScheinBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4426663069390240749L;
	private JPanel contentPane;
	private JTextField txtBruttoLohnMonat;
	private JTextField txtLohnSteuerMonat;
	private JTextField txtSolZMonat;
	private JTextField txtKvMonat;
	private JTextField txtPvMonat;
	private JTextField txtAvMonat;
	private JTextField txtRvMonat;
	private JTextField txtArbeitsMonate;
	private JTextField txtSteuerJahr;

	
	/**
	 * Create the frame.
	 */
	public GehaltsScheinBildschirm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 516, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Pruefung der TxtFields, ob richtige Werte verwendet wurden + Uebergabe der Werte in die Globale Klasse DataGehalt.java
				 */
				
				
				try {
					double BruttoLohnMonat = Double.parseDouble(txtBruttoLohnMonat.getText());
					DataGehalt.dataGehalt.setBruttoLohnMonat(BruttoLohnMonat);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "BruttoLohn ist keine Kommazahl", "Bitte Punkt verwenden", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double LohnSteuerMonat = Double.parseDouble(txtLohnSteuerMonat.getText());
					DataGehalt.dataGehalt.setLohnSteuerMonat(LohnSteuerMonat);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "LohnSteuer ist keine Kommazahl", "Bitte Punkt verwenden", JOptionPane.ERROR_MESSAGE);
				}
				 
				try {
					double SolZMonat = Double.parseDouble(txtSolZMonat.getText());
					DataGehalt.dataGehalt.setSolZMonat(SolZMonat);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "SoliZuschlag ist keine Kommazahl", "Bitte Punkt verwenden", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double KvMonat = Double.parseDouble(txtKvMonat.getText());
					DataGehalt.dataGehalt.setKvMonat(KvMonat);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "KV ist keine Kommazahl", "Bitte Punkt verwenden", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double PvMonat = Double.parseDouble(txtPvMonat.getText());
					DataGehalt.dataGehalt.setPvMonat(PvMonat);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "PV ist keine Kommazahl", "Bitte Punkt verwenden", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double AvMonat = Double.parseDouble(txtAvMonat.getText());
					DataGehalt.dataGehalt.setAvMonat(AvMonat);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "AV ist keine Kommazahl", "Bitte Punkt verwenden", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double RvMonat = Double.parseDouble(txtRvMonat.getText());
					DataGehalt.dataGehalt.setRvMonat(RvMonat);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "RV ist keine Kommazahl", "Bitte Punkt verwenden", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					int ArbeitsMonate = Integer.parseInt(txtArbeitsMonate.getText());
					DataGehalt.dataGehalt.setArbeitsMonate(ArbeitsMonate);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ArbeitsMonate ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					int SteuerJahr = Integer.parseInt(txtSteuerJahr.getText());
					DataGehalt.dataGehalt.setSteuerJahr(SteuerJahr);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "SteuerJahr ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				
				/*
				 * Oeffnung der naechsten GUI
				 */
				WerbungsKostenBildschirm wkb = new WerbungsKostenBildschirm();
				wkb.setVisible(true); 
				
				
			}
		});
		btnWeiter.setBounds(10, 328, 89, 23);
		contentPane.add(btnWeiter);
		
		JButton btnZurueck = new JButton("zurueck");
		btnZurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdressBildschirm ab = new AdressBildschirm();
				ab.setVisible(true); 
								
			}
		});
		btnZurueck.setBounds(335, 328, 90, 25);
		contentPane.add(btnZurueck);
		
		JLabel lblAngabenGehaltszettel = new JLabel("Angaben Gehaltszettel in Euro: ");
		lblAngabenGehaltszettel.setFont(lblAngabenGehaltszettel.getFont().deriveFont(lblAngabenGehaltszettel.getFont().getStyle() | Font.BOLD));
		lblAngabenGehaltszettel.setBounds(12, 12, 270, 15);
		contentPane.add(lblAngabenGehaltszettel);
		
		JLabel lblBruttolohn = new JLabel("Bruttolohn:");
		lblBruttolohn.setBounds(10, 43, 140, 15);
		contentPane.add(lblBruttolohn);
		
		JLabel lblLohnsteuer = new JLabel("Lohnsteuer:");
		lblLohnsteuer.setBounds(10, 70, 140, 15);
		contentPane.add(lblLohnsteuer);
		
		JLabel lblSolizuschlag = new JLabel("SoliZuschlag:");
		lblSolizuschlag.setBounds(10, 97, 140, 15);
		contentPane.add(lblSolizuschlag);
		
		JLabel lblKv = new JLabel("KV:");
		lblKv.setBounds(10, 124, 140, 15);
		contentPane.add(lblKv);
		
		JLabel lblPv = new JLabel("PV:");
		lblPv.setBounds(10, 151, 140, 15);
		contentPane.add(lblPv);
		
		JLabel lblAv = new JLabel("AV:");
		lblAv.setBounds(10, 178, 140, 15);
		contentPane.add(lblAv);
		
		JLabel lblRv = new JLabel("RV:");
		lblRv.setBounds(10, 205, 140, 15);
		contentPane.add(lblRv);
		
		JLabel lblArbeitsmonate = new JLabel("Arbeitsmonate:");
		lblArbeitsmonate.setBounds(10, 239, 140, 15);
		contentPane.add(lblArbeitsmonate);
		
		txtBruttoLohnMonat = new JTextField();
		txtBruttoLohnMonat.setBounds(224, 39, 201, 19);
		contentPane.add(txtBruttoLohnMonat);
		txtBruttoLohnMonat.setColumns(10);
		
		txtLohnSteuerMonat = new JTextField();
		txtLohnSteuerMonat.setColumns(10);
		txtLohnSteuerMonat.setBounds(224, 68, 201, 19);
		contentPane.add(txtLohnSteuerMonat);
		
		txtSolZMonat = new JTextField();
		txtSolZMonat.setColumns(10);
		txtSolZMonat.setBounds(224, 95, 201, 19);
		contentPane.add(txtSolZMonat);
		
		txtKvMonat = new JTextField();
		txtKvMonat.setColumns(10);
		txtKvMonat.setBounds(224, 122, 201, 19);
		contentPane.add(txtKvMonat);
		
		txtPvMonat = new JTextField();
		txtPvMonat.setColumns(10);
		txtPvMonat.setBounds(224, 149, 201, 19);
		contentPane.add(txtPvMonat);
		
		txtAvMonat = new JTextField();
		txtAvMonat.setColumns(10);
		txtAvMonat.setBounds(224, 176, 201, 19);
		contentPane.add(txtAvMonat);
		
		txtRvMonat = new JTextField();
		txtRvMonat.setColumns(10);
		txtRvMonat.setBounds(224, 203, 201, 19);
		contentPane.add(txtRvMonat);
		
		txtArbeitsMonate = new JTextField();
		txtArbeitsMonate.setColumns(10);
		txtArbeitsMonate.setBounds(224, 234, 201, 19);
		contentPane.add(txtArbeitsMonate);
		
		JLabel lblSteuerjahr = new JLabel("Steuerjahr:");
		lblSteuerjahr.setBounds(10, 271, 140, 15);
		contentPane.add(lblSteuerjahr);
		
		txtSteuerJahr = new JTextField();
		txtSteuerJahr.setColumns(10);
		txtSteuerJahr.setBounds(224, 265, 201, 19);
		contentPane.add(txtSteuerJahr);
	}

}
