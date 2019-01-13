import java.text.SimpleDateFormat;
import java.util.Date;

public class Auto {

/*
3) Tee luokka Auto ja sille p‰‰ohjelma AutoOhjelma.
Auto-luokalla on attribuutit malli, merkki, rekisterinumero ja vuosimalli.
Tee luokkaan set-, get- ja toString -metodit, parametriton konstruktori ja  parametrillinen konstruktori.
Tee luokkaan myˆs getIka-metodi, joka kertoo auton i‰n.
K‰yt‰ metodin tekemiseen Date-luokkaa, vuosimalli-attribuuttia sek‰ Integer.parseInt-metodia.
Tee p‰‰ohjelmassa Auto-luokan olio parametrittomalla konstruktorilla.
K‰yt‰ p‰‰ohjelmassa set-metodeja tietojen muuttamiseen ja get-metodeja tietojen n‰ytt‰miseen.

Esimerkki ohjelmasta
Anna merkki: Audi
Anna malli: A6
Anna rekisterinumero: ABC-123
Anna vuosimalli: 2010
Autosi merkki ja malli ovat: Audi A6
Autosi rekisterinumero on: ABC-123
Autosi ik‰ on: 6 vuotta
 */
	
	private String merkki;
	private String malli;
	private String rekisterinumero;
	private int vuosimalli;
	
	public Auto(String merkki, String malli, String rekisterinumero, int vuosimalli) {
		this.merkki = merkki;
		this.malli = malli;
		this.rekisterinumero = rekisterinumero;
		this.vuosimalli = vuosimalli;
	}

	@Override
	public String toString() {
		return "Auto [merkki=" + merkki + ", malli=" + malli + ", rekisterinumero=" + rekisterinumero + ", vuosimalli="
				+ vuosimalli + "]";
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public String getRekisterinumero() {
		return rekisterinumero;
	}

	public void setRekisterinumero(String rekisterinumero) {
		this.rekisterinumero = rekisterinumero;
	}

	public int getVuosimalli() {
		return vuosimalli;
	}

	public void setVuosimalli(int vuosimalli) {
		this.vuosimalli = vuosimalli;
	}
	
	public int getIka() {
		Date pvmNyt = new Date();
		SimpleDateFormat fdate = new SimpleDateFormat("yyyy");
		int vuosiNyt = Integer.parseInt(fdate.format(pvmNyt));
		return vuosiNyt-vuosimalli;
	}
	
	public Auto() {
//		System.out.println("T‰m‰ on " +this.getClass().getName() +"-luokan oletusrakentajametodi");
//		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
