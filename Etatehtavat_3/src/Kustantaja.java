import java.text.SimpleDateFormat;
import java.util.Date;

public class Kustantaja {

/*
4)

a) Tee luokka Kirja, jolla on attribuutit nimi (String), isbn (String) ja hinta (double).
Tee luokkaan parametriton ja parametrillinen konstruktori, set- ja get-metodit ja toString-metodi. 

b) Tee luokka Kustantaja, jolla on attribuutit nimi (String), osoite (String) ja puhelin (String).
Tee luokkaan parametriton ja parametrillinen konstruktori, set- ja get-metodit ja toString-metodi. 

c) Lis‰‰ Kirja-luokkaan attribuutti kustantaja. Kirja-luokan kustantaja-attribuutti kertoo kirjan yhteyssuhteen Kustantaja-luokkaan.
Lis‰‰ Kirja-luokkaan yhteyssuhdetta varten tarvittava koodi/metodit (konstruktorit, set-, get- ja toString-metodit).

Tee Kirja-luokalle p‰‰ohjelma KirjaKustantajaOhjelma, jolla luodaan Kustantaja-luokan olio ja Kirja-luokan oliot parametrillisilla
konstruktoreilla. N‰yt‰ tiedot Kirja-luokan get-metodeilla.

Teht‰v‰ vastaa kahta teht‰v‰‰.
Esimerkki ohjelmasta
Kirjan nimi: Javaa helposti
Kirjan isbn: 1234567-1 
Kirjan hinta: 12,90
Kustantajan nimi: HH kustannus
Kustantajan osoite: Helsinki
Kustantajan puhelin: 050-1234567
Kirjan Javaa helposti kustantaja on HH kustannus 
*/
	
	private String nimi;
	private String osoite;
	private String puhelin;
	
	public Kustantaja() {
//		System.out.println("T‰m‰ on " +this.getClass().getName() +"-luokan oletusrakentajametodi");
//		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Kustantaja [nimi=" + nimi + ", osoite=" + osoite + ", puhelin=" + puhelin + "]";
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

	public String getPuhelin() {
		return puhelin;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	public Kustantaja(String nimi, String osoite, String puhelin) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.puhelin = puhelin;
	}
	
}
