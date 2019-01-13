import java.text.DecimalFormat;
import java.util.Scanner;

/*
4)	Tee ohjelma Saastolaskuri, joka kysyy s��st�tavoitteen ja kuukausien lukum��r�n.
Ohjelma tulostaa kunkin kuukauden s��st�m��r�n ja kokonaiss��st�summan.

Esimerkki ohjelmasta
Anna s��st�tavoite: 1000,0
Anna kuukausien lukum��r�: 4
1. kuukausi 250,00 euroa, s��st�summa 250,00 euroa
2. kuukausi 250,00 euroa, s��st�summa 500,00 euroa
3. kuukausi 250,00 euroa, s��st�summa 750,00 euroa
4. kuukausi 250,00 euroa, s��st�summa 1000,00 euroa
 */

public class Saastolaskuri {

	public static void main(String[] args) {

		int kkLkm = 0;
		int kkNro = 0;
		double saastoPerKk = 0;
		double saastoYht = 0;
		double saastoYhtTemp = 0;
		double saastoTavoite = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Anna s��st�tavoite: ");
		saastoTavoite = input.nextDouble();
		
		System.out.println("Anna kuukausien lukum��r�: ");
		kkLkm = input.nextInt();
		
		saastoPerKk = saastoTavoite / kkLkm;
		
		DecimalFormat des2 = new DecimalFormat("0.00");
		
		for (int i=1; i<=kkLkm; i++) {
			saastoYhtTemp = saastoYht + saastoPerKk;
			saastoYht = saastoYhtTemp;
			System.out.println(i +". kuukausi " +des2.format(saastoPerKk) +" euroa, s��st�summa " +des2.format(saastoYhtTemp) +" euroa");
		}

		input.close();
	}

}
