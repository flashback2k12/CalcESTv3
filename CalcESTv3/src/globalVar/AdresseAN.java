package globalVar;

public class AdresseAN {

	public static AdresseAN adresseAN = new AdresseAN(); 
	
	private String Vorname; 
	private String Nachname;
	private String Strasse;
	private String Plz;
	private String Wohnort;
	
	
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	
	public String getStrasse() {
		return Strasse;
	}
	public void setStrasse(String strasse) {
		Strasse = strasse;
	}
	
	public String getPlz() {
		return Plz;
	}
	public void setPlz(String plz) {
		Plz = plz;
	}
	
	public String getWohnort() {
		return Wohnort;
	}
	public void setWohnort(String wohnort) {
		Wohnort = wohnort;
	}
		
}
