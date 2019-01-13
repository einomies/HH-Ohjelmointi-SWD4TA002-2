import java.text.SimpleDateFormat;
import java.util.Date;

public class Kirja {

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
	private String isbn;
	private double hinta;
	
	// Itse tehty luokka Kustantaja on t‰m‰n luokan yhten‰ attribuuttina
	private Kustantaja kustantaja;
	
	public Kustantaja getKustantaja() {
		return kustantaja;
	}

	public Kirja(String nimi, String isbn, double hinta, Kustantaja kustantaja) {
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.kustantaja = kustantaja;
	}

	public void setKustantaja(Kustantaja kustantaja) {
		this.kustantaja = kustantaja;
	}

	public Kirja() {
//		System.out.println("T‰m‰ on " +this.getClass().getName() +"-luokan oletusrakentajametodi");
//		System.out.println(this.toString());
	}

	public Kirja(String nimi, String isbn, double hinta) {
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
	}

	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", kustantaja=" + kustantaja + "]";
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
}
