package outputFrame;

import globalVar.AdresseAG;
import globalVar.AdresseAN;
import globalVar.DataGehalt;
import globalVar.DataWK;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class DatenProtokoll extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6424047205409388664L;
	private JPanel contentPane;
	private JTextField txtCreateFile;

	
	/**
	 * Create the frame.
	 */
	public DatenProtokoll() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 803);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblClickspenden = new JLabel("ClickSpenden");
		lblClickspenden.setBounds(12, 12, 411, 15);
		contentPane.add(lblClickspenden);
		
		final JLabel lblClickkrankheit = new JLabel("ClickKrankheit");
		lblClickkrankheit.setBounds(12, 34, 411, 15);
		contentPane.add(lblClickkrankheit);
		
		final JLabel lblClickwk = new JLabel("ClickWK");
		lblClickwk.setBounds(12, 53, 411, 15);
		contentPane.add(lblClickwk);
		
		final JLabel lblAn = new JLabel("AN1");
		lblAn.setBounds(12, 80, 411, 15);
		contentPane.add(lblAn);
		
		final JLabel lblAn_1 = new JLabel("AN2");
		lblAn_1.setBounds(12, 107, 411, 15);
		contentPane.add(lblAn_1);
		
		final JLabel lblAn_2 = new JLabel("AN3");
		lblAn_2.setBounds(12, 130, 411, 15);
		contentPane.add(lblAn_2);
		
		final JLabel lblAn_3 = new JLabel("AN4");
		lblAn_3.setBounds(12, 157, 411, 15);
		contentPane.add(lblAn_3);
		
		final JLabel lblAn_4 = new JLabel("AN5");
		lblAn_4.setBounds(12, 177, 422, 15);
		contentPane.add(lblAn_4);
		
		final JLabel lblAg = new JLabel("AG1");
		lblAg.setBounds(12, 206, 411, 15);
		contentPane.add(lblAg);
		
		final JLabel lblAg_1 = new JLabel("AG2");
		lblAg_1.setBounds(12, 233, 411, 15);
		contentPane.add(lblAg_1);
		
		final JLabel lblAg_2 = new JLabel("AG3");
		lblAg_2.setBounds(12, 257, 411, 15);
		contentPane.add(lblAg_2);
		
		final JLabel lblAg_3 = new JLabel("AG4");
		lblAg_3.setBounds(12, 283, 411, 15);
		contentPane.add(lblAg_3);
		
		final JLabel lblG = new JLabel("G1");
		lblG.setBounds(12, 310, 411, 15);
		contentPane.add(lblG);
		
		final JLabel lblG_1 = new JLabel("G2");
		lblG_1.setBounds(12, 335, 411, 15);
		contentPane.add(lblG_1);
		
		final JLabel lblG_2 = new JLabel("G3");
		lblG_2.setBounds(12, 360, 411, 15);
		contentPane.add(lblG_2);
		
		final JLabel lblG_3 = new JLabel("G4");
		lblG_3.setBounds(12, 387, 411, 15);
		contentPane.add(lblG_3);
		
		final JLabel lblG_4 = new JLabel("G5");
		lblG_4.setBounds(12, 414, 411, 15);
		contentPane.add(lblG_4);
		
		final JLabel lblG_5 = new JLabel("G6");
		lblG_5.setBounds(12, 433, 411, 15);
		contentPane.add(lblG_5);
		
		final JLabel lblG_6 = new JLabel("G7");
		lblG_6.setBounds(12, 460, 411, 15);
		contentPane.add(lblG_6);
		
		final JLabel lblG_7 = new JLabel("G8");
		lblG_7.setBounds(12, 482, 411, 15);
		contentPane.add(lblG_7);
		
		final JLabel lblG_8 = new JLabel("G9");
		lblG_8.setBounds(12, 509, 411, 15);
		contentPane.add(lblG_8);
		
		final JLabel lblW = new JLabel("W1");
		lblW.setBounds(12, 552, 411, 15);
		contentPane.add(lblW);
		
		final JLabel lblW_1 = new JLabel("W2");
		lblW_1.setBounds(12, 579, 411, 15);
		contentPane.add(lblW_1);
		
		final JLabel lblW_2 = new JLabel("W3");
		lblW_2.setBounds(12, 606, 411, 15);
		contentPane.add(lblW_2);
		
		final JLabel lblW_3 = new JLabel("W4");
		lblW_3.setBounds(12, 637, 411, 15);
		contentPane.add(lblW_3);
		
		JButton btnDatenholen = new JButton("Daten Holen");
		btnDatenholen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Hole alle Daten aus allen GUI's
				 */
				
				lblClickspenden.setText(""+DataWK.dataWK.getClickSpenden());
				lblClickkrankheit.setText(""+DataWK.dataWK.getClickKrankheitsKosten());
				lblClickwk.setText(""+DataWK.dataWK.getClickWerbungsKosten());
				
				lblAn.setText(""+AdresseAN.adresseAN.getVorname());
				lblAn_1.setText(""+AdresseAN.adresseAN.getNachname());
				lblAn_2.setText(""+AdresseAN.adresseAN.getStrasse());
				lblAn_3.setText(""+AdresseAN.adresseAN.getPlz());
				lblAn_4.setText(""+AdresseAN.adresseAN.getWohnort());
				
				lblAg.setText(""+AdresseAG.adresseAG.getNameArbeit());
				lblAg_1.setText(""+AdresseAG.adresseAG.getStrasseAG());
				lblAg_2.setText(""+AdresseAG.adresseAG.getPlzAG());
				lblAg_3.setText(""+AdresseAG.adresseAG.getArbeitsort());
				
				lblG.setText(""+DataGehalt.dataGehalt.getSteuerJahr());
				lblG_1.setText(""+DataGehalt.dataGehalt.getArbeitsMonate());
				lblG_2.setText(""+DataGehalt.dataGehalt.getBruttoLohnMonat());
				lblG_3.setText(""+DataGehalt.dataGehalt.getLohnSteuerMonat());
				lblG_4.setText(""+DataGehalt.dataGehalt.getSolZMonat());
				lblG_5.setText(""+DataGehalt.dataGehalt.getKvMonat());
				lblG_6.setText(""+DataGehalt.dataGehalt.getPvMonat());
				lblG_7.setText(""+DataGehalt.dataGehalt.getAvMonat());
				lblG_8.setText(""+DataGehalt.dataGehalt.getRvMonat());
				
				lblW.setText(""+DataWK.dataWK.getEntfernungWA());
				lblW_1.setText(""+DataWK.dataWK.getArbeitstage());
				lblW_2.setText(""+DataWK.dataWK.getSpendenGezahlt());
				lblW_3.setText(""+DataWK.dataWK.getKrankheitsKosten());
				
				
				
			}
		});
		btnDatenholen.setBounds(12, 669, 148, 25);
		contentPane.add(btnDatenholen);
		
		txtCreateFile = new JTextField();
		txtCreateFile.setBounds(174, 672, 181, 19);
		contentPane.add(txtCreateFile);
		txtCreateFile.setColumns(10);
		
		JButton btnFile = new JButton("file");
		btnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String targetFile = txtCreateFile.getText(); 
				
				String G1 = '\n' + lblClickspenden.getText();
				String G2 = '\n' + lblClickkrankheit.getText();
				String G3 = '\n' + lblClickwk.getText();
				String G4 = '\n' + lblAn.getText();
				String G5 = '\n' + lblAn_1.getText();
				String G6 = '\n' + lblAn_2.getText();
				String G7 = '\n' + lblAn_3.getText();
				String G8 = '\n' + lblAn_4.getText();
				String G9 = '\n' + lblAg.getText();
				String G10 = '\n' + lblAg_1.getText();
				String G11 = '\n' + lblAg_2.getText();
				String G12 = '\n' + lblAg_3.getText();
				String G12a = '\n' + lblG.getText();
				String G13 = '\n' + lblG_1.getText();
				String G14 = '\n' + lblG_2.getText();
				String G15 = '\n' + lblG_3.getText();
				String G16 = '\n' + lblG_4.getText();
				String G17 = '\n' + lblG_5.getText();
				String G18 = '\n' + lblG_6.getText();
				String G19 = '\n' + lblG_7.getText();
				String G20 = '\n' + lblG_8.getText();
				String G21 = '\n' + lblW.getText();
				String G22 = '\n' + lblW_1.getText();
				String G23 = '\n' + lblW_2.getText(); 
				String G24 = '\n' + lblW_3.getText();
				String Sep = '\n' + ("----------------------------------");
				
				
				File target = new File(targetFile);
				
				
				FileWriter writer = null;
				try {
					
					writer = new FileWriter(target, false);
					writer.write(Sep);
					writer.write(G1);
					writer.write(G2);
					writer.write(G3);
					writer.write(Sep);
					writer.write(G4);
					writer.write(G5);
					writer.write(G6);
					writer.write(G7);
					writer.write(G8);
					writer.write(Sep);
					writer.write(G9);
					writer.write(G10);
					writer.write(G11);
					writer.write(G12);
					writer.write(Sep);
					writer.write(G12a);
					writer.write(G13);
					writer.write(G14);
					writer.write(G15);
					writer.write(G16);
					writer.write(G17);
					writer.write(G18);
					writer.write(G19);
					writer.write(G20);
					writer.write(Sep);
					writer.write(G21);
					writer.write(G22);
					writer.write(G23);
					writer.write(G24);
					writer.write(Sep);
					
					
				} catch (IOException ex) {
					
					Logger.getLogger(DatenProtokoll.class.getName()).log(Level.SEVERE, null, ex);
					
				} finally {
					
					if (writer != null) {
						
						try {
							writer.close();
						} catch (IOException ex) {
							
							Logger.getLogger(DatenProtokoll.class.getName()).log(Level.SEVERE, null, ex);
						}
					} 
				}
				
				
			}
		});
		btnFile.setBounds(367, 669, 56, 25);
		contentPane.add(btnFile);
	}
}
