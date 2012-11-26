package berechnungen;

public class Berechne {

	
	public static double JahresWert (double monatsWert, double arbeitsMonate) {
		
		double jahresWert = monatsWert * arbeitsMonate;
		
		return Math.round(jahresWert*100.00)/100.00; 
	}
	
	public static double WerbungsKosten (double EntfernungWA, double ArbeitsTage, double ArbeitsMittel, double TelefonKosten) {
		
		double KMPAUSCHALE = 0.3;
		int KONTOFUEHRUNG = 16;
//		int ARBEITSMITTEL = 110;
//		int TELEFON = 240;
		
		double Werbungskosten = ((EntfernungWA * ArbeitsTage * KMPAUSCHALE) + KONTOFUEHRUNG + ArbeitsMittel + TelefonKosten);
		
		return Math.round(Werbungskosten*100.00)/100.00;
	
	}

	public static double SummeEinkunft (double JahresBruttoLohn, double WerbungsKosten) {
		
		double SummeEinkunft = JahresBruttoLohn - WerbungsKosten;
		
		return Math.round(SummeEinkunft*100.00)/100.00;
		
	}
	
	
	
}
