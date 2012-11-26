package globalVar;

public class DataWK {

	public static DataWK dataWK = new DataWK();
	
	private int ClickSpenden;
	private int ClickKrankheitsKosten;
	private int ClickWerbungsKosten;
	
	
	private double EntfernungWA;
	private int Arbeitstage;
	private double SpendenGezahlt;
	private double KrankheitsKosten;
	private double ArbeitsMittel;
	private double TelefonKosten;
	

	public double getEntfernungWA() {
		return EntfernungWA;
	}

	public void setEntfernungWA(double entfernungWA) {
		EntfernungWA = entfernungWA;
	}

	public int getClickSpenden() {
		return ClickSpenden;
	}

	public void setClickSpenden(int clickSpenden) {
		ClickSpenden = clickSpenden;
	}

	public int getClickKrankheitsKosten() {
		return ClickKrankheitsKosten;
	}

	public void setClickKrankheitsKosten(int clickKrankheitsKosten) {
		ClickKrankheitsKosten = clickKrankheitsKosten;
	}

	public int getClickWerbungsKosten() {
		return ClickWerbungsKosten;
	}

	public void setClickWerbungsKosten(int clickWerbungsKosten) {
		ClickWerbungsKosten = clickWerbungsKosten;
	}

	public int getArbeitstage() {
		return Arbeitstage;
	}

	public void setArbeitstage(int arbeitstage) {
		Arbeitstage = arbeitstage;
	}

	public double getSpendenGezahlt() {
		return SpendenGezahlt;
	}

	public void setSpendenGezahlt(double spendenGezahlt) {
		SpendenGezahlt = spendenGezahlt;
	}

	public double getKrankheitsKosten() {
		return KrankheitsKosten;
	}

	public void setKrankheitsKosten(double krankheitsKosten) {
		KrankheitsKosten = krankheitsKosten;
	}

	public double getArbeitsMittel() {
		return ArbeitsMittel;
	}

	public void setArbeitsMittel(double arbeitsMittel) {
		ArbeitsMittel = arbeitsMittel;
	}

	public double getTelefonKosten() {
		return TelefonKosten;
	}

	public void setTelefonKosten(double telefonKosten) {
		TelefonKosten = telefonKosten;
	}

		
}
