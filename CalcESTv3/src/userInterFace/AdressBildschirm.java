package userInterFace;

import globalVar.AdresseAG;
import globalVar.AdresseAN;
import globalVar.DataWK;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdressBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2301422759488713761L;
	private JPanel contentPane;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtStrasseAN;
	private JTextField txtPlzAN;
	private JTextField txtWohnort;
	private JTextField txtNameArbeit;
	private JTextField txtStrasseAG;
	private JTextField txtPlzAG;
	private JTextField txtArbeitsort;
	private JTextField txtEntfernungWA;

	/**
	 * Create the frame.
	 */
	public AdressBildschirm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngabenZurPerson = new JLabel("Angaben zur Person:");
		lblAngabenZurPerson.setFont(lblAngabenZurPerson.getFont().deriveFont(lblAngabenZurPerson.getFont().getStyle() | Font.BOLD));
		lblAngabenZurPerson.setBounds(10, 10, 195, 14);
		contentPane.add(lblAngabenZurPerson);
		
		JLabel lblVorname = new JLabel("Vorname:");
		lblVorname.setBounds(10, 35, 90, 14);
		contentPane.add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname:");
		lblNachname.setBounds(10, 60, 90, 14);
		contentPane.add(lblNachname);
		
		txtVorname = new JTextField();
		txtVorname.setBounds(132, 29, 239, 20);
		contentPane.add(txtVorname);
		txtVorname.setColumns(10);
		
		txtNachname = new JTextField();
		txtNachname.setBounds(132, 55, 239, 20);
		contentPane.add(txtNachname);
		txtNachname.setColumns(10);
		
		JLabel lblStrasse = new JLabel("Strasse:");
		lblStrasse.setBounds(10, 85, 90, 14);
		contentPane.add(lblStrasse);
		
		JLabel lblPlz = new JLabel("PLZ:");
		lblPlz.setBounds(10, 110, 90, 14);
		contentPane.add(lblPlz);
		
		JLabel lblWohnort = new JLabel("Wohnort:");
		lblWohnort.setBounds(10, 135, 90, 14);
		contentPane.add(lblWohnort);
		
		txtStrasseAN = new JTextField();
		txtStrasseAN.setColumns(10);
		txtStrasseAN.setBounds(132, 82, 239, 20);
		contentPane.add(txtStrasseAN);
		
		txtPlzAN = new JTextField();
		txtPlzAN.setColumns(10);
		txtPlzAN.setBounds(132, 107, 239, 20);
		contentPane.add(txtPlzAN);
		
		txtWohnort = new JTextField();
		txtWohnort.setColumns(10);
		txtWohnort.setBounds(132, 132, 239, 20);
		contentPane.add(txtWohnort);
		
		JLabel lblAngabenZumArbeitgeber = new JLabel("Angaben zum Arbeitgeber:");
		lblAngabenZumArbeitgeber.setFont(lblAngabenZumArbeitgeber.getFont().deriveFont(lblAngabenZumArbeitgeber.getFont().getStyle() | Font.BOLD));
		lblAngabenZumArbeitgeber.setBounds(10, 180, 195, 14);
		contentPane.add(lblAngabenZumArbeitgeber);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 205, 90, 14);
		contentPane.add(lblName);
		
		JLabel lblStrasse_1 = new JLabel("Strasse:");
		lblStrasse_1.setBounds(10, 230, 90, 14);
		contentPane.add(lblStrasse_1);
		
		JLabel lblPlz_1 = new JLabel("PLZ:");
		lblPlz_1.setBounds(10, 255, 90, 14);
		contentPane.add(lblPlz_1);
		
		JLabel lblArbeitsort = new JLabel("Arbeitsort:");
		lblArbeitsort.setBounds(10, 280, 90, 14);
		contentPane.add(lblArbeitsort);
		
		txtNameArbeit = new JTextField();
		txtNameArbeit.setColumns(10);
		txtNameArbeit.setBounds(132, 202, 239, 20);
		contentPane.add(txtNameArbeit);
		
		txtStrasseAG = new JTextField();
		txtStrasseAG.setColumns(10);
		txtStrasseAG.setBounds(132, 227, 239, 20);
		contentPane.add(txtStrasseAG);
		
		txtPlzAG = new JTextField();
		txtPlzAG.setColumns(10);
		txtPlzAG.setBounds(132, 252, 239, 20);
		contentPane.add(txtPlzAG);
		
		txtArbeitsort = new JTextField();
		txtArbeitsort.setColumns(10);
		txtArbeitsort.setBounds(132, 277, 239, 20);
		contentPane.add(txtArbeitsort);
		
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Uebergabe der AdressDaten fuer Arbeitnehmer in die Globale Klasse AdresseAN.java
				 */
				try {
					String Vorname = txtVorname.getText();
					AdresseAN.adresseAN.setVorname(Vorname); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Vorname muss aus Buchstaben bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					String Nachname = txtNachname.getText();
					AdresseAN.adresseAN.setNachname(Nachname); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Nachname muss aus Buchstaben bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					String StrasseAN = txtStrasseAN.getText();
					AdresseAN.adresseAN.setStrasse(StrasseAN); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "StrasseAN muss aus Buchstaben bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					String PlzAN = txtPlzAN.getText();
					AdresseAN.adresseAN.setPlz(PlzAN); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "PlzAN muss aus Zahlen bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					String Wohnort = txtWohnort.getText();
					AdresseAN.adresseAN.setWohnort(Wohnort); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Wohnort muss aus Buchstaben bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				/*
				 * Uebergabe der AdressDaten fuer Arbeitgeber in die Globale Klasse AdresseAG.java
				 */
				try {
					String NameArbeit = txtNameArbeit.getText();
					AdresseAG.adresseAG.setNameArbeit(NameArbeit); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ArbeitgeberName muss aus Buchstaben bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					String StrasseAG = txtStrasseAG.getText();
					AdresseAG.adresseAG.setStrasseAG(StrasseAG); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "StrasseAG muss aus Buchstaben bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					String PlzAG = txtPlzAG.getText();
					AdresseAG.adresseAG.setPlzAG(PlzAG); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "PlzAG muss aus Zahlen bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					String Arbeitsort = txtArbeitsort.getText();
					AdresseAG.adresseAG.setArbeitsort(Arbeitsort); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Arbeitsort muss aus Buchstaben bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				/*
				 * Uebergabe der Entfernung Wohnung / Arbeit in die Globale Klasse BerechnungWK.java
				 */
				try {
					double EntfernungWA = Double.parseDouble(txtEntfernungWA.getText());
					DataWK.dataWK.setEntfernungWA(EntfernungWA);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "EntfernungWA muss aus Zahlen bestehen", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				
				/*
				 * Oeffnung des naechsten userInterfaces
				 */
				GehaltsScheinBildschirm gsb = new GehaltsScheinBildschirm();
				gsb.setVisible(true); 
				
			}
		});
		btnWeiter.setBounds(10, 362, 90, 23);
		contentPane.add(btnWeiter);
		
		JButton btnTest = new JButton("Entfernung berechnen");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Oeffnung der Google Maps Web Page durch Button click zur Berechnung der Entfernungskilometer
				 */
				openURL("http://maps.google.de/maps?hl=de&tab=wl");
			}
		});
		btnTest.setBounds(132, 362, 239, 23);
		contentPane.add(btnTest);
		
		JLabel lblEntfernung = new JLabel("Entfernung:");
		lblEntfernung.setBounds(10, 311, 103, 15);
		contentPane.add(lblEntfernung);
		
		txtEntfernungWA = new JTextField();
		txtEntfernungWA.setColumns(10);
		txtEntfernungWA.setBounds(132, 309, 239, 20);
		contentPane.add(txtEntfernungWA);
	}


	/*
	 * thanks to http://www.roseindia.net/answers/viewqa/Java-Beginners/9039-Open-website-on-Button-Click.html
	 * 
	 * Methode zur Oeffnung des Browsers 
	 */
		public void openURL(String url) {
		String osName = System.getProperty("os.name");
		
		try 
		{
			if (osName.startsWith("Windows"))
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			else 
			{
				String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
				String browser = null;
				
				for (int count = 0; count < browsers.length && browser == null; count++)
					if (Runtime.getRuntime().exec(new String[] {"which", browsers[count]}).waitFor() == 0)
						browser = browsers[count];
						Runtime.getRuntime().exec(new String[] {browser, url});
			}
		}
		catch (Exception e) 
		{
		JOptionPane.showMessageDialog(null, "Error in opening browser" + ":\n" + e.getLocalizedMessage());
		}
	}
}
