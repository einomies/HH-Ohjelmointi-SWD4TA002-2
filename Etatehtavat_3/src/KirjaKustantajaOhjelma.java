import java.sql.Date;
import java.util.Scanner;

public class KirjaKustantajaOhjelma {

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

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Kirjan nimi: ");
		String kirjaNimi = input.nextLine();
		
		System.out.print("Kirjan isbn: ");
		String kirjaIsbn = input.nextLine();
		
		System.out.print("Kirjan hinta: ");
		Double kirjaHinta = input.nextDouble();
		input.nextLine();
		
		System.out.print("Kustantajan nimi: ");
		String kustantajaNimi = input.nextLine();
		
		System.out.print("Kustantajan osoite: ");
		String kustantajaOsoite = input.nextLine();
		
		System.out.print("Kustantajan puhelin: ");
		String kustantajaPuhelin = input.nextLine();
		
		Kustantaja kustantaja = new Kustantaja(kustantajaNimi, kustantajaOsoite, kustantajaPuhelin);
		
		Kirja kirja = new Kirja(kirjaNimi, kirjaIsbn, kirjaHinta, kustantaja);
		
		System.out.println("Kirjan " +kirja.getNimi() +" kustantaja on " +kirja.getKustantaja().getNimi());
		
		input.close();
	}

}
