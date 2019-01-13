import java.text.DecimalFormat;
import java.util.Scanner;

/*
1)	Tee ohjelma Bensa, joka laskee, paljonko maksaa kilometrin ajaminen.
K‰ytt‰j‰lt‰ pyydet‰‰n tankattu m‰‰r‰ litroina (double), ajetut kilometrit (int) sek‰ bensan litrahinta (double).
Ohjelma laskee ja n‰ytt‰‰ kilometrihinnan. Muotoile vastaus kahdella desimaalilla.

Esimerkki ohjelmasta
Anna tankattu m‰‰r‰: 54,0
Anna ajetut kilometrit: 790 
Anna litrahinta: 1,690
Ajo per kilometri maksaa 0,12
 */

public class Bensa {

	public static void main(String[] args) {
		
		double tankattu, litrahinta, ajoPerKmHinta;
		int ajetutKilometrit;

		Scanner input = new Scanner(System.in);

		System.out.print("Anna tankattu m‰‰r‰: ");
		tankattu = input.nextDouble();

		System.out.println("Anna ajetut kilometrit: ");
		ajetutKilometrit = input.nextInt();
		
		System.out.println("Anna litrahinta: ");
		litrahinta = input.nextDouble();
		
		input.close();

		DecimalFormat des2 = new DecimalFormat("0.00");

		ajoPerKmHinta = tankattu * litrahinta / ajetutKilometrit;
		
		System.out.println("Ajo per kilometri maksaa " +des2.format(ajoPerKmHinta));

	}

}
