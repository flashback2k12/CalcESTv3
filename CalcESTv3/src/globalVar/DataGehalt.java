package globalVar;

public class DataGehalt {

	public static DataGehalt dataGehalt = new DataGehalt(); 
	
	private int Steuerjahr;
	private double BruttoLohnMonat;
	private double KVMonat;
	private double PVMonat;
	private double AVMonat;
	private double RVMonat;
	private double LohnSteuerMonat;
	private double SoliMonat;
	private double ArbeitsMonate;
	
	public int getSteuerjahr() {
		return Steuerjahr;
	}
	public void setSteuerjahr(int steuerjahr) {
		Steuerjahr = steuerjahr;
	}
	
	public double getBruttoLohnMonat() {
		return BruttoLohnMonat;
	}
	public void setBruttoLohnMonat(double bruttoLohnMonat) {
		BruttoLohnMonat = bruttoLohnMonat;
	}
	
	public double getKVMonat() {
		return KVMonat;
	}
	public void setKVMonat(double kVMonat) {
		KVMonat = kVMonat;
	}
	
	public double getPVMonat() {
		return PVMonat;
	}
	public void setPVMonat(double pVMonat) {
		PVMonat = pVMonat;
	}
	
	public double getAVMonat() {
		return AVMonat;
	}
	public void setAVMonat(double aVMonat) {
		AVMonat = aVMonat;
	}
	
	public double getRVMonat() {
		return RVMonat;
	}
	public void setRVMonat(double rVMonat) {
		RVMonat = rVMonat;
	}
	
	public double getLohnSteuerMonat() {
		return LohnSteuerMonat;
	}
	public void setLohnSteuerMonat(double lohnSteuerMonat) {
		LohnSteuerMonat = lohnSteuerMonat;
	}
	
	public double getSoliMonat() {
		return SoliMonat;
	}
	public void setSoliMonat(double soliMonat) {
		SoliMonat = soliMonat;
	}
	
	public double getArbeitsMonate() {
		return ArbeitsMonate;
	}
	public void setArbeitsMonate(double arbeitsMonate) {
		ArbeitsMonate = arbeitsMonate;
	}
	
	
}
