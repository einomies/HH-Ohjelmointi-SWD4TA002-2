import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

/*
5) Tee ohjelma Lampotilat, joka kysyy k�ytt�j�lt� l�mp�tiloja maksimissaan 100 kappaletta.
K�ytt�j� lopettaa l�mp�tilojen sy�tt�misen luvulla -999.
T�m�n j�lkeen ohjelma n�ytt�� annetut l�mp�tilat pienimm�st� suurimpaan.

Esimerkki ohjelmasta
Anna l�mp�tila: 17
Anna l�mp�tila: 12
Anna l�mp�tila: 19
Anna l�mp�tila: -999
Annoit l�mp�tilat: 12 17 19
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
			System.out.print("Anna l�mp�tila: ");
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
		System.out.println("Antamasi l�mp�tilat pienimm�st� suurimpaan:");

		for (int i=0; i<lampotilat.length && i<lampotilaLkm; i++) {
			System.out.print(lampotilat[i] +" ");
		}
	}

}
