import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkkalaskuri {

/*
3) Tee ohjelma Palkkalaskuri, jolla k‰ytt‰j‰ voi laskea annetun ajan bruttopalkan.
Ohjelma kysyy tuntipalkan ja kuinka monen p‰iv‰n tunnit k‰ytt‰j‰ antaa.
Ohjelma kysyy tuntim‰‰r‰n kunakin p‰iv‰n‰.
Lopuksi ohjelma tulostaa yhteistuntim‰‰r‰n, bruttopalkan ja annetut tunnit.

Esimerkki ohjelmasta
Anna tuntipalkkasi: 10,5
Monenko p‰iv‰n tuntim‰‰r‰t annat: 4
Anna tuntien m‰‰r‰ p‰iv‰ss‰: 7
Anna tuntien m‰‰r‰ p‰iv‰ss‰: 8
Anna tuntien m‰‰r‰ p‰iv‰ss‰: 4
Anna tuntien m‰‰r‰ p‰iv‰ss‰: 8
Tunteja yhteens‰: 27
Bruttopalkkasi: 283,50
Annoit tunnit: 7 8 4 8
 */
	
	public static void main(String[] args) {
		
		double tuntipalkka = 0;
		double palkkaYht = 0;
		int paivienLkm = 0;
		int tunnitYht = 0;
		int paivanTunnit = 0;
		
		int tunnit[] = null;

		Scanner input = new Scanner(System.in);

		System.out.print("Anna tuntipalkkasi: ");
		tuntipalkka = input.nextDouble();
		System.out.print("Monenko p‰iv‰n tuntim‰‰r‰t annat: ");
		paivienLkm = input.nextInt();

		tunnit = new int[paivienLkm];

		System.out.println();
		for (int i=1; i<=paivienLkm; i++) {
			System.out.print(i +". p‰iv‰, anna tuntien m‰‰r‰: ");
			paivanTunnit = input.nextInt();
			tunnit[i-1] = paivanTunnit;
			tunnitYht = tunnitYht + paivanTunnit;
			palkkaYht = paivanTunnit*tuntipalkka+palkkaYht;
		}

		input.close();

		System.out.println();
		System.out.println("Tunteja yhteens‰: " +tunnitYht);
		System.out.println("Bruttopalkkasi: " +palkkaYht);
		System.out.print("Annoit tunnit: ");
		for (int i=0; i<tunnit.length; i++) {
			System.out.print(tunnit[i] +" ");
		}
	}

}
