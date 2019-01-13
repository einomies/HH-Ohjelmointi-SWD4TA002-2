import java.text.DecimalFormat;
import java.util.Scanner;

public class Sananlasku {

/*
1) Tee ohjelma Sananlasku, joka kysyy k‰ytt‰j‰lt‰ sananlaskuja.
Sananlaskujen pyyt‰mist‰ jatketaan, kunnes k‰ytt‰j‰ antaa sananlaskuksi LOPPU.
Lopuksi ohjelma kertoo, montako sananlaskua annettiin ja montako merkki‰ niiss‰ yhteens‰ oli.

Esimerkki ohjelmasta
Anna sananlasku: Happamia, sanoi kettu pihlajanmarjoista.
Anna sananlasku: Helppoa ku hein‰nteko.
Anna sananlasku: Kerta kiellon p‰‰lle.
Anna sananlasku: LOPPU
Sananlaskuja oli 3 kappaletta.
Sananlaskuissa oli merkkej‰ yhteens‰ 83
 */
	
	public static void main(String[] args) {
		
		String sananlasku;
		final String lopetusLoitsu = "LOPPU";
		int sananlaskuLkm = 0;
		int sananlaskuPituus = 0;
		int merkitLkm = 0;

		System.out.println("T‰m‰ ohjelma kysyy k‰ytt‰j‰lt‰ sananlaskuja");
		System.out.println("Sananlaskujen pyyt‰mist‰ jatketaan, kunnes k‰ytt‰j‰ antaa sananlaskuksi " +lopetusLoitsu);
		System.out.println("Lopuksi ohjelma kertoo, montako sananlaskua annettiin ja montako merkki‰ niiss‰ yhteens‰ oli.");
		System.out.println("*********************************************************************************************");
		System.out.println();
		
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Anna sananlasku: ");
			sananlasku = input.nextLine();
			if (!sananlasku.equalsIgnoreCase(lopetusLoitsu)) {
				sananlaskuLkm++;
				sananlaskuPituus = sananlasku.length();
				merkitLkm = merkitLkm + sananlaskuPituus;
			}
		} while (!sananlasku.equalsIgnoreCase(lopetusLoitsu));

		input.close();
		
		System.out.println();
		System.out.println("Sananlaskuja oli " +sananlaskuLkm +" kappaletta.");
		System.out.println("Sananlaskuissa oli merkkej‰ yhteens‰ " +merkitLkm);
	}

}
