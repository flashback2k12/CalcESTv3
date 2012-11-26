package outputFrame;

import globalVar.JahresWerte;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Berechnung extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -642114584279898368L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Berechnung() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblBruttolohn = new JLabel("Bruttolohn: ");
		lblBruttolohn.setBounds(40, 20, 220, 14);
		contentPane.add(lblBruttolohn);
		
		final JLabel lblWerbungskosten = new JLabel("Werbungskosten:");
		lblWerbungskosten.setBounds(40, 45, 220, 14);
		contentPane.add(lblWerbungskosten);
		
		final JLabel lblSummeDerEinkuenfte = new JLabel("Summe der Einkuenfte:");
		lblSummeDerEinkuenfte.setBounds(40, 70, 220, 14);
		contentPane.add(lblSummeDerEinkuenfte);
		
		JButton btnShowMeThe = new JButton("show me the magic");
		btnShowMeThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Daten holen
				 */
				double BruttoJahresLohn = JahresWerte.jahresWerte.getJahresBruttoLohn();
				double WerbungsKosten = JahresWerte.jahresWerte.getWerbungsKosten();
				double SummeEnkunft = JahresWerte.jahresWerte.getSummeEinkunft();
				
				/*
				 * Daten auf GUI ausgeben
				 */
				lblBruttolohn.setText("Bruttolohn: " + BruttoJahresLohn); 
				lblWerbungskosten.setText("Werbungskosten: " + WerbungsKosten);
				lblSummeDerEinkuenfte.setText("Summe der Einkuenfte: " + SummeEnkunft);				
				
			}
		});
		btnShowMeThe.setBounds(10, 228, 184, 23);
		contentPane.add(btnShowMeThe);
		
		JLabel label = new JLabel("./.");
		label.setBounds(10, 45, 26, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("=");
		label_1.setBounds(10, 70, 26, 14);
		contentPane.add(label_1);
	}

}
