package outputFrame;

import globalVar.AdresseAG;
import globalVar.AdresseAN;
import globalVar.DataGehalt;
import globalVar.DataWK;
import globalVar.JahresWerte;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import berechnungen.Berechne;

public class AuswertungsBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8116657346191254749L;
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public AuswertungsBildschirm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 646, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPerson = new JLabel("Angaben zur Person:");
		lblPerson.setFont(lblPerson.getFont().deriveFont(lblPerson.getFont().getStyle() | Font.BOLD));
		lblPerson.setBounds(10, 25, 280, 14);
		contentPane.add(lblPerson);
		
		final JLabel lblVorname = new JLabel("-");
		lblVorname.setBounds(10, 46, 280, 14);
		contentPane.add(lblVorname);
		
		final JLabel lblNachname = new JLabel("-");
		lblNachname.setBounds(10, 70, 280, 14);
		contentPane.add(lblNachname);
		
		final JLabel lblStrasse = new JLabel("-");
		lblStrasse.setBounds(10, 96, 280, 15);
		contentPane.add(lblStrasse);
		
		final JLabel lblPlz = new JLabel("-");
		lblPlz.setBounds(10, 123, 280, 15);
		contentPane.add(lblPlz);
		
		final JLabel lblWohnort = new JLabel("-");
		lblWohnort.setBounds(10, 145, 280, 15);
		contentPane.add(lblWohnort);
		
		final JLabel lblJahreswerteGehalt = new JLabel("Jahreswerte Gehalt:");
		lblJahreswerteGehalt.setBounds(10, 172, 280, 15);
		contentPane.add(lblJahreswerteGehalt);
		
		final JLabel lblJahresBruttoLohn = new JLabel("-");
		lblJahresBruttoLohn.setBounds(10, 196, 280, 15);
		contentPane.add(lblJahresBruttoLohn);
		
		final JLabel lblJahresLohnSteuer = new JLabel("-");
		lblJahresLohnSteuer.setBounds(10, 215, 280, 15);
		contentPane.add(lblJahresLohnSteuer);
		
		final JLabel lblJahresSolZ = new JLabel("-");
		lblJahresSolZ.setBounds(10, 234, 280, 15);
		contentPane.add(lblJahresSolZ);
		
		final JLabel lblJahresKv = new JLabel("-");
		lblJahresKv.setBounds(10, 251, 280, 15);
		contentPane.add(lblJahresKv);
		
		final JLabel lblJahresPv = new JLabel("-");
		lblJahresPv.setBounds(10, 270, 280, 15);
		contentPane.add(lblJahresPv);
		
		final JLabel lblJahresRv = new JLabel("-");
		lblJahresRv.setBounds(10, 289, 280, 15);
		contentPane.add(lblJahresRv);
		
		final JLabel lblJahresAv = new JLabel("-");
		lblJahresAv.setBounds(10, 308, 280, 15);
		contentPane.add(lblJahresAv);
		
		final JLabel lblSteuerJahr = new JLabel("-");
		lblSteuerJahr.setHorizontalAlignment(SwingConstants.CENTER);
		lblSteuerJahr.setBounds(141, 5, 217, 15);
		contentPane.add(lblSteuerJahr);
		
		final JLabel lblNameAG = new JLabel("-");
		lblNameAG.setBounds(302, 46, 244, 15);
		contentPane.add(lblNameAG);
		
		final JLabel lblStrasseAG = new JLabel("-");
		lblStrasseAG.setBounds(302, 70, 244, 15);
		contentPane.add(lblStrasseAG);
		
		final JLabel lblPlzAG = new JLabel("-");
		lblPlzAG.setBounds(302, 96, 244, 15);
		contentPane.add(lblPlzAG);
		
		final JLabel lblArbeitsOrt = new JLabel("-");
		lblArbeitsOrt.setBounds(302, 123, 244, 15);
		contentPane.add(lblArbeitsOrt);
		
		final JLabel lblWerbungsKosten = new JLabel("-");
		lblWerbungsKosten.setBounds(302, 196, 244, 15);
		contentPane.add(lblWerbungsKosten);
		
		final JLabel lblSpendenAbz = new JLabel("-");
		lblSpendenAbz.setBounds(302, 257, 244, 15);
		contentPane.add(lblSpendenAbz);
		
		final JLabel lblKrankheitsKosten = new JLabel("-");
		lblKrankheitsKosten.setBounds(302, 310, 244, 15);
		contentPane.add(lblKrankheitsKosten);
		
		JButton btnAuswertung = new JButton("Auswertung");
		btnAuswertung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Uebergabe des Steuerjahres
				 */
				lblSteuerJahr.setText("Steuerjahr: " + DataGehalt.dataGehalt.getSteuerJahr());
				
				/*
				 * Uebergabe der AdressDaten des Arbeitnehmers
				 */
				lblVorname.setText("Vorname: " + AdresseAN.adresseAN.getVorname());
				lblNachname.setText("Nachname: " + AdresseAN.adresseAN.getNachname()); 
				lblStrasse.setText("Strasse: " + AdresseAN.adresseAN.getStrasse());
				lblPlz.setText("PLZ: " + AdresseAN.adresseAN.getPlz());
				lblWohnort.setText("Wohnort: " + AdresseAN.adresseAN.getWohnort());
				
				/*
				 * Uebergabe der AdressDaten des Arbeitgebers
				 */
				lblNameAG.setText("Arbeitgeber: " + AdresseAG.adresseAG.getNameArbeit());
				lblStrasseAG.setText("Strasse: " + AdresseAG.adresseAG.getStrasseAG());
				lblPlzAG.setText("PLZ: " + AdresseAG.adresseAG.getPlzAG());
				lblArbeitsOrt.setText("Arbeitsort: " + AdresseAG.adresseAG.getArbeitsort());
				
				/*
				 * holen der Daten zur Berechnung aus den einzelnen Gui + global.classes
				 */
				double ArbeitsMonate = DataGehalt.dataGehalt.getArbeitsMonate();
				double BruttoLohnMonat = DataGehalt.dataGehalt.getBruttoLohnMonat();
				double LohnSteuerMonat = DataGehalt.dataGehalt.getLohnSteuerMonat();
				double SolZMonat = DataGehalt.dataGehalt.getSolZMonat();
				double KvMonat = DataGehalt.dataGehalt.getKvMonat();
				double PvMonat = DataGehalt.dataGehalt.getPvMonat();
				double AvMonat = DataGehalt.dataGehalt.getAvMonat();
				double RvMonat = DataGehalt.dataGehalt.getRvMonat();
				
				/*
				 * Jahreswerte berechnen + Uebergabe an AuswertungsGUI
				 */
				
				try {
					double JahresBruttoLohn = Berechne.JahresWert(BruttoLohnMonat, ArbeitsMonate);
					lblJahresBruttoLohn.setText("JahresBruttoLohn: " + JahresBruttoLohn);
					JahresWerte.jahresWerte.setJahresBruttoLohn(JahresBruttoLohn); 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "JahresBruttoLohn keine Double", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double JahresLohnSteuer = Berechne.JahresWert(LohnSteuerMonat, ArbeitsMonate);
					lblJahresLohnSteuer.setText("JahresLohnSteuer: " + JahresLohnSteuer);
					JahresWerte.jahresWerte.setJahresLohnSteuer(JahresLohnSteuer);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "JahresLohnSteuer keine Double", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double JahresSolZ = Berechne.JahresWert(SolZMonat, ArbeitsMonate);
					lblJahresSolZ.setText("JahresSoliZuschlag: " + JahresSolZ);
					JahresWerte.jahresWerte.setJahresSolZ(JahresSolZ);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "JahresSolZ keine Double", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double JahresKv = Berechne.JahresWert(KvMonat, ArbeitsMonate);
					lblJahresKv.setText("JahresKV: " + JahresKv);
					JahresWerte.jahresWerte.setJahresKv(JahresKv);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "JahresKv keine Double", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double JahresPv = Berechne.JahresWert(PvMonat, ArbeitsMonate);
					lblJahresPv.setText("JahresPV: " + JahresPv);
					JahresWerte.jahresWerte.setJahresPv(JahresPv);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "JahresPv keine Double", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double JahresAv = Berechne.JahresWert(AvMonat, ArbeitsMonate);
					lblJahresAv.setText("JahresAV: " + JahresAv);
					JahresWerte.jahresWerte.setJahresAv(JahresAv);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "JahresAv keine Double", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					double JahresRv = Berechne.JahresWert(RvMonat, ArbeitsMonate);
					lblJahresRv.setText("JahresRV: " + JahresRv);
					JahresWerte.jahresWerte.setJahresRv(JahresRv);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "JahresRv keine Double", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				/*
				 * holen der Daten zur Berechnung der Werbungskosten + Vergleich Pauschale <-> tatsaechliche WK
				 */
				double EntfernungWA = DataWK.dataWK.getEntfernungWA();
				double ArbeitsTage = DataWK.dataWK.getArbeitstage();
				double ArbeitsMittel = DataWK.dataWK.getArbeitsMittel();
				double TelefonKosten = DataWK.dataWK.getTelefonKosten(); 
								
				/*
				 * Berechnung Werbungskosten
				 */
				lblWerbungsKosten.setText("" + Berechne.WerbungsKosten(EntfernungWA, ArbeitsTage, ArbeitsMittel, TelefonKosten));
				
				/*
				 * Uebergabe Werbungskosten in globale Klasse
				 */
				JahresWerte.jahresWerte.setWerbungsKosten(Berechne.WerbungsKosten(EntfernungWA, ArbeitsTage, ArbeitsMittel, TelefonKosten));
					
				/*
				 * Berechnung Summe der Einkuenfte + gleichzeitige Uebergabe in globale klasse + gleichzeitige Werte uebernahme aus globaler klasse
				 */
				JahresWerte.jahresWerte.setSummeEinkunft(Berechne.SummeEinkunft(JahresWerte.jahresWerte.getJahresBruttoLohn(), JahresWerte.jahresWerte.getWerbungsKosten())); 
								
			}
		});
		btnAuswertung.setBounds(10, 366, 146, 23);
		contentPane.add(btnAuswertung);
		
		JButton btnDatenSammlung = new JButton("Daten Sammlung");
		btnDatenSammlung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Oeffnung der DatenSammlungsGUI
				 */
				DatenProtokoll dp = new DatenProtokoll();
				dp.setVisible(true);				
				
			}
		});
		btnDatenSammlung.setBounds(466, 365, 154, 25);
		contentPane.add(btnDatenSammlung);
		
		JLabel lblAngabenZumArbeitgeber = new JLabel("Angaben zum Arbeitgeber:");
		lblAngabenZumArbeitgeber.setBounds(302, 25, 244, 15);
		contentPane.add(lblAngabenZumArbeitgeber);
		
		JLabel lblWerbungskosten = new JLabel("Werbungskosten:");
		lblWerbungskosten.setBounds(302, 172, 244, 15);
		contentPane.add(lblWerbungskosten);
		
		JLabel lblSpenden = new JLabel("Spenden:");
		lblSpenden.setBounds(302, 234, 244, 15);
		contentPane.add(lblSpenden);
		
		JLabel lblKrankheitskosten = new JLabel("Krankheitskosten:");
		lblKrankheitskosten.setBounds(302, 289, 244, 15);
		contentPane.add(lblKrankheitskosten);
		
		JButton btnBerechnung = new JButton("Berechnung");
		btnBerechnung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Berechnung b = new Berechnung();
				b.setVisible(true);
				
			}
		});
		btnBerechnung.setBounds(236, 366, 146, 23);
		contentPane.add(btnBerechnung);
		
				
	}
}
