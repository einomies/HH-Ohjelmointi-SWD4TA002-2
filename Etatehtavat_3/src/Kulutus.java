import java.util.Scanner;
import java.text.DecimalFormat;

/*
1)	Tee ohjelma Kulutus, jolla voidaan laskea bensan kulutus sadalla kilometrill‰.
Ohjelma kysyy ajetut kilometrit ja kuluneen polttoaineen m‰‰r‰n. 

Esimerkki ohjelmasta
Anna ajetut kilometrit: 800 
Anna kulunut polttoainem‰‰r‰: 54
Kulutus/100km on 6,75 litraa

Lis‰‰ ohjelmaan nelj‰ metodia. Laita metodit tarkalleen, kuten ne on alla annettu.

public int kysyKilometrit() 
-metodi kysyy ajetut kilometrit

public int kysyLitrat() 
-metodi kysyy kuluneen polttoaine m‰‰r‰n

public double laskeKulutus(int km, int litrat)
-metodi laskee ja palauttaa kulutuksen sadalla kilometrill‰. 

public void naytaKulutus(double kulutus)
-metodi n‰ytt‰‰ kulutuksen
 */

public class Kulutus {
	
	public Kulutus() {
//		System.out.println("T‰m‰ on Kulutus-luokan oletusrakentajametodi");
//		System.out.println(this.toString());
		int ajetutKilometrit = kysyKilometrit();
		int litrat = kysyLitrat();
		double kulutus = laskeKulutus(ajetutKilometrit, litrat);
		naytaKulutus(kulutus);
	}
	
	public int kysyKilometrit() {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna ajetut kilometrit: ");
		int ajetutKilometrit = input.nextInt();
//		input.close();
		return ajetutKilometrit;
	}
	
	public int kysyLitrat() {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna kulunut polttoainem‰‰r‰: ");
		int litrat = input.nextInt();
//		input.close();
		return litrat;
	}
	
	public double laskeKulutus(int km, int litrat) {
		double kmDouble = (double)km;
		double litratDouble = (double)litrat;
		return litratDouble / kmDouble * 100;
	}

	public void naytaKulutus(double kulutus) {
		DecimalFormat des2 = new DecimalFormat("0.00");
		System.out.println("Kulutus/100km on " +des2.format(kulutus) +" litraa");
	}

	public static void main(String[] args) {
		
		new Kulutus();
	}

}
