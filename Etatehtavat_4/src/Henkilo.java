import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Henkilo {
	
	private String nimi;
	private String osoite;
	private double pituus;
	private double paino;
	
	public Henkilo(String nimi, String osoite, double pituus, double paino) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.pituus = pituus;
		this.paino = paino;
	}

	public double getPituus() {
		return pituus;
	}

	public void setPituus(double pituus) {
		this.pituus = pituus;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	public double getPainoindeksi(Henkilo henkilo) {
		return henkilo.paino / Math.pow(henkilo.pituus, 2);
	}

	public Henkilo() {
		// TODO Auto-generated constructor stub
	}

	public Henkilo(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", pituus=" + pituus + ", paino=" + paino + "]";
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	
}
