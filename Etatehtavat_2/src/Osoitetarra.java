import java.text.DecimalFormat;
import java.util.Scanner;

public class Osoitetarra {

/*
2) Tee ohjelma Osoitetarra, joka kysyy k�ytt�j�lt� seuraavat tiedot:
- etunimi
- sukunimi
- katuosoite
- postinumero
- postitoimipaikka

Ohjelma n�ytt�� kyseiset tiedot kolmelle riville samaan tapaan kuin osoitetarroissa.
N�yt� k�ytt�j�n antamat tiedot siten, ettei tekstien alussa ja lopussa ole turhia v�lily�ntej�.
Etu- ja sukunimi sek� katuosoite alkavat suurella kirjaimella, muut merkit ovat pieni�.
Postitoimipaikka n�ytet��n suurilla kirjaimilla.

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
//		Jos sukunimest� l�ytyy viiva, muunnetaan viivan j�lkeinen merkki isoksi kirjaimeksi
//		T�m� toimii oikein vain, jos sukunimess� on vain yksi viiva.
//		Hiukan ehk� turhaa kikkailua, mutta tulipahan tehty� :) / Eino K 26.8.2017
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
