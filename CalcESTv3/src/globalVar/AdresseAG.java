package globalVar;

public class AdresseAG {

	public static AdresseAG adresseAG = new AdresseAG(); 
	
	private String NameArbeit;
	private String StrasseAG;
	private String PlzAG;
	private String Arbeitsort;
	
	
	public String getNameArbeit() {
		return NameArbeit;
	}
	public void setNameArbeit(String nameArbeit) {
		NameArbeit = nameArbeit;
	}
	
	public String getStrasseAG() {
		return StrasseAG;
	}
	public void setStrasseAG(String strasseAG) {
		StrasseAG = strasseAG;
	}
	
	public String getPlzAG() {
		return PlzAG;
	}
	public void setPlzAG(String plzAG) {
		PlzAG = plzAG;
	}
	
	public String getArbeitsort() {
		return Arbeitsort;
	}
	public void setArbeitsort(String arbeitsort) {
		Arbeitsort = arbeitsort;
	}
	
	
	
}