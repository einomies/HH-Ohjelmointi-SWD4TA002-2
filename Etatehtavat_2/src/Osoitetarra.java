import java.text.DecimalFormat;
import java.util.Scanner;

public class Osoitetarra {

/*
2) Tee ohjelma Osoitetarra, joka kysyy käyttäjältä seuraavat tiedot:
- etunimi
- sukunimi
- katuosoite
- postinumero
- postitoimipaikka

Ohjelma näyttää kyseiset tiedot kolmelle riville samaan tapaan kuin osoitetarroissa.
Näytä käyttäjän antamat tiedot siten, ettei tekstien alussa ja lopussa ole turhia välilyöntejä.
Etu- ja sukunimi sekä katuosoite alkavat suurella kirjaimella, muut merkit ovat pieniä.
Postitoimipaikka näytetään suurilla kirjaimilla.

Alla on esimerkki, miten etunimi voidaan muuntaa haluttuun muotoon:
String etunimi= "hEiKki";
String ekaKirjain = etunimi.substring(0,1).toUpperCase();
String loppuNimi = etunimi.substring(1).toLowerCase();
etunimi = ekaKirjain + loppuNimi;

Esimerkki ohjelmasta
Anna etunimi: maTTi
Anna sukunimi: maJAVA
Anna katuosoite: kATu 11
Anna postinumero ja postitoimipaikka: 12345 maJavala

Matti Majava
Katu 11
12345 MAJAVALA
 */
	
	public static void main(String[] args) {
		
		String etunimi, sukunimi, katuosoite, postinumero, postitoimipaikka;
		String kirjain, ekaKirjain, loppuNimi;
		int viivanPaikka = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Anna etunimi: ");
		etunimi = input.nextLine();
		etunimi = etunimi.trim();
		ekaKirjain = etunimi.substring(0,1).toUpperCase();
		loppuNimi = etunimi.substring(1).toLowerCase();
		etunimi = ekaKirjain + loppuNimi;
		
		System.out.println("Anna sukunimi: ");
		sukunimi = input.nextLine();
		sukunimi = sukunimi.trim();
		ekaKirjain = sukunimi.substring(0,1).toUpperCase();
		loppuNimi = sukunimi.substring(1).toLowerCase();
//		Jos sukunimestä löytyy viiva, muunnetaan viivan jälkeinen merkki isoksi kirjaimeksi
//		Tämä toimii oikein vain, jos sukunimessä on vain yksi viiva.
//		Hiukan ehkä turhaa kikkailua, mutta tulipahan tehtyä :) / Eino K 26.8.2017
		viivanPaikka = loppuNimi.indexOf("-");
		if (viivanPaikka != -1) {
			kirjain = loppuNimi.substring(viivanPaikka+1,viivanPaikka+2).toUpperCase();
			loppuNimi = 
					loppuNimi.substring(0,viivanPaikka) + 
					"-" +
					kirjain + 
					loppuNimi.substring(viivanPaikka+2, loppuNimi.length());
		}
		sukunimi = ekaKirjain + loppuNimi;
		
		System.out.println("Anna katuosoite: ");
		katuosoite = input.nextLine();
		katuosoite = katuosoite.trim();
		ekaKirjain = katuosoite.substring(0, 1).toUpperCase();
		loppuNimi = katuosoite.substring(1).toLowerCase();
		katuosoite = ekaKirjain + loppuNimi;
		
		System.out.println("Anna postinumero ja postitoimipaikka: ");
		postinumero = input.next();
		postitoimipaikka = input.next();
		postinumero = postinumero.trim();
		postitoimipaikka = postitoimipaikka.trim().toUpperCase();

		input.close();
		
		System.out.println();
		
		System.out.println(etunimi +" " +sukunimi);
		System.out.println(katuosoite);
		System.out.println(postinumero +" " +postitoimipaikka);
	}

}
