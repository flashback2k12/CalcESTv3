package outputFrame;

import globalVar.AdresseAN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPerson = new JLabel("Angaben zur Person:");
		lblPerson.setFont(lblPerson.getFont().deriveFont(lblPerson.getFont().getStyle() | Font.BOLD));
		lblPerson.setBounds(10, 21, 280, 14);
		contentPane.add(lblPerson);
		
		final JLabel lblVorname = new JLabel("");
		lblVorname.setBounds(10, 46, 280, 14);
		contentPane.add(lblVorname);
		
		final JLabel lblNachname = new JLabel("");
		lblNachname.setBounds(10, 70, 280, 14);
		contentPane.add(lblNachname);
		
		JButton btnAuswertung = new JButton("Auswertung");
		btnAuswertung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Uebergabe der AdressDaten des Arbeitnehmers in das AuswertungsBlatt
				 */
				
				lblVorname.setText("Vorname: " + AdresseAN.adresseAN.getVorname());
				lblNachname.setText("Nachname: " + AdresseAN.adresseAN.getNachname()); 
				
				
			}
		});
		btnAuswertung.setBounds(10, 366, 146, 23);
		contentPane.add(btnAuswertung);
	}

}
