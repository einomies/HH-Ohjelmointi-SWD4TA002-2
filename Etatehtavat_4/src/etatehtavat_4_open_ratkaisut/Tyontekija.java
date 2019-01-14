package etatehtavat_4_open_ratkaisut;

public class Tyontekija extends Henkilo {
	private double tuntiPalkka;

	public Tyontekija() {
		super();		
	}

	public Tyontekija(String nimi, String osoite, double tuntiPalkka) {
		super(nimi, osoite);	
		this.tuntiPalkka = tuntiPalkka;
	}

	public double getTuntiPalkka() {
		return tuntiPalkka;
	}

	public void setTuntiPalkka(double tuntiPalkka) {
		this.tuntiPalkka = tuntiPalkka;
	}

	@Override
	public String toString() {
		return "Tyontekija [tuntiPalkka=" + tuntiPalkka + ", toString()="
				+ super.toString() + "]";
	} 	
	
}
