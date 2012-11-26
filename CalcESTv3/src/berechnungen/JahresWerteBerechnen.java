package berechnungen;

public class JahresWerteBerechnen {

	
	public static double multi (double monatsWert, double arbeitsMonate) {
		
		double jahresWert = monatsWert * arbeitsMonate;
				
		return Math.round(jahresWert*100.00)/100.00;
	}
	
	
}
