package globalVar;

public class DataGehalt {

	public static DataGehalt dataGehalt = new DataGehalt(); 
	
	private int SteuerJahr;
	private double BruttoLohnMonat;
	private double LohnSteuerMonat;
	private double SolZMonat;
	private double KvMonat;
	private double PvMonat; 
	private double AvMonat;
	private double RvMonat;
	private int ArbeitsMonate;
	
	public int getSteuerJahr() {
		return SteuerJahr;
	}
	public void setSteuerJahr(int steuerJahr) {
		SteuerJahr = steuerJahr;
	}
	
	public double getBruttoLohnMonat() {
		return BruttoLohnMonat;
	}

	public void setBruttoLohnMonat(double bruttoLohnMonat) {
		BruttoLohnMonat = bruttoLohnMonat;
	}

	public double getLohnSteuerMonat() {
		return LohnSteuerMonat;
	}

	public void setLohnSteuerMonat(double lohnSteuerMonat) {
		LohnSteuerMonat = lohnSteuerMonat;
	}

	public double getSolZMonat() {
		return SolZMonat;
	}

	public void setSolZMonat(double solZMonat) {
		SolZMonat = solZMonat;
	}

	public double getKvMonat() {
		return KvMonat;
	}

	public void setKvMonat(double kvMonat) {
		KvMonat = kvMonat;
	}

	public double getPvMonat() {
		return PvMonat;
	}

	public void setPvMonat(double pvMonat) {
		PvMonat = pvMonat;
	}

	public double getAvMonat() {
		return AvMonat;
	}

	public void setAvMonat(double avMonat) {
		AvMonat = avMonat;
	}

	public double getRvMonat() {
		return RvMonat;
	}

	public void setRvMonat(double rvMonat) {
		RvMonat = rvMonat;
	}

	public int getArbeitsMonate() {
		return ArbeitsMonate;
	}

	public void setArbeitsMonate(int arbeitsMonate) {
		ArbeitsMonate = arbeitsMonate;
	} 

	
	
}
