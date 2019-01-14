public class Tyontekija extends Henkilo {

	double tuntipalkka;
	
	public Tyontekija(String nimi, String osoite, double tuntipalkka) {
		super(nimi, osoite);
		this.tuntipalkka = tuntipalkka;
	}

	public Tyontekija() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTuntipalkka() {
		return tuntipalkka;
	}

	public void setTuntipalkka(double tuntipalkka) {
		this.tuntipalkka = tuntipalkka;
	}

	@Override
	public String toString() {
		return "Tyontekija [tuntipalkka=" + tuntipalkka + "]";
	}

	public Tyontekija(String nimi, String osoite, double pituus, double paino) {
		super(nimi, osoite, pituus, paino);
		// TODO Auto-generated constructor stub
	}

	public Tyontekija(String nimi, String osoite) {
		super(nimi, osoite);
		// TODO Auto-generated constructor stub
	}

}
