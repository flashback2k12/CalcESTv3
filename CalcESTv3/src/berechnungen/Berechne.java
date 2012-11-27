package berechnungen;


public class Berechne {

	
	public static double JahresWert (double monatsWert, double arbeitsMonate) {
		
		double jahresWert = monatsWert * arbeitsMonate;
		
		return Math.round(jahresWert*100.00)/100.00; 
	}
	
	public static double WerbungsKosten (double EntfernungWA, double ArbeitsTage, double ArbeitsMittel, double TelefonKosten) {
		
		double KMPAUSCHALE = 0.3;
		int KONTOFUEHRUNG = 16;

		/*
		 * Vergleichabfrage fuer pauschale Arbeitsmittel --> nicht Anerkennung von Finanzamt moeglich
		 */
		if(ArbeitsMittel <= 110)
		{
			ArbeitsMittel = 110.0;
		}
		else
		{
			ArbeitsMittel = Math.round(ArbeitsMittel*100.00)/100.00; 
		}
		
		/*
		 * Vergleichabfrage fuer pauschale Telefonkosten --> nicht Anerkennung von Finanzamt moeglich
		 */
		if(TelefonKosten <= 240)
		{
			TelefonKosten = 240.0;
		}
		else
		{
			TelefonKosten = Math.round(TelefonKosten*100.00)/100.00; 
		}				
		
		/*
		 * Berechnung WerbungsKosten
		 */
		double WerbungsKosten = ((EntfernungWA * ArbeitsTage * KMPAUSCHALE) + KONTOFUEHRUNG + ArbeitsMittel + TelefonKosten);
				
		/*
		 * Vergleich Pauschale <-> tatsaechliche WK
		 */
		if (WerbungsKosten <= 1000) 
		{
			return WerbungsKosten = 1000; 
		}
		else 
		{
			return Math.round(WerbungsKosten*100.00)/100.00;
		}
		
	
	}

	public static double SummeEinkunft (double JahresBruttoLohn, double WerbungsKosten) {
		
		double SummeEinkunft = JahresBruttoLohn - WerbungsKosten;
		
		return Math.round(SummeEinkunft*100.00)/100.00;
		
	}
	
	
	
}
