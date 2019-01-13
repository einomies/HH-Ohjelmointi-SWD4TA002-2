import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

/*
5) Tee ohjelma Lampotilat, joka kysyy käyttäjältä lämpötiloja maksimissaan 100 kappaletta.
Käyttäjä lopettaa lämpötilojen syöttämisen luvulla -999.
Tämän jälkeen ohjelma näyttää annetut lämpötilat pienimmästä suurimpaan.

Esimerkki ohjelmasta
Anna lämpötila: 17
Anna lämpötila: 12
Anna lämpötila: 19
Anna lämpötila: -999
Annoit lämpötilat: 12 17 19
 */
	
	public static void main(String[] args) {

		final int lampotilaLkmMax = 10;
		int lampotilaLkm = 0;
		int[] lampotilat;
		int lampotila = 0;
		final int lopetusLoitsu = -999;

		Scanner input = new Scanner(System.in);

		lampotilat = new int[lampotilaLkmMax];

		do {
			System.out.print("Anna lämpötila: ");
			lampotila = input.nextInt();
			if (lampotila != lopetusLoitsu) {
				lampotilaLkm++;
				if (lampotilaLkm >= lampotilaLkmMax) {
					lampotilat[lampotilaLkm-1] = lampotila;
					lampotila = lopetusLoitsu;
				} else {
					lampotilat[lampotilaLkm-1] = lampotila;
				}
			}
		} while (lampotila != lopetusLoitsu);

		input.close();

		Arrays.sort(lampotilat, 0, lampotilaLkm);

		System.out.println();
		System.out.println("Antamasi lämpötilat pienimmästä suurimpaan:");

		for (int i=0; i<lampotilat.length && i<lampotilaLkm; i++) {
			System.out.print(lampotilat[i] +" ");
		}
	}

}
