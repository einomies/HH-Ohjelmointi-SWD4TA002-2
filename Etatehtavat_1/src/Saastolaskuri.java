import java.text.DecimalFormat;
import java.util.Scanner;

/*
4)	Tee ohjelma Saastolaskuri, joka kysyy säästötavoitteen ja kuukausien lukumäärän.
Ohjelma tulostaa kunkin kuukauden säästömäärän ja kokonaissäästösumman.

Esimerkki ohjelmasta
Anna säästötavoite: 1000,0
Anna kuukausien lukumäärä: 4
1. kuukausi 250,00 euroa, säästösumma 250,00 euroa
2. kuukausi 250,00 euroa, säästösumma 500,00 euroa
3. kuukausi 250,00 euroa, säästösumma 750,00 euroa
4. kuukausi 250,00 euroa, säästösumma 1000,00 euroa
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
		
		System.out.println("Anna säästötavoite: ");
		saastoTavoite = input.nextDouble();
		
		System.out.println("Anna kuukausien lukumäärä: ");
		kkLkm = input.nextInt();
		
		saastoPerKk = saastoTavoite / kkLkm;
		
		DecimalFormat des2 = new DecimalFormat("0.00");
		
		for (int i=1; i<=kkLkm; i++) {
			saastoYhtTemp = saastoYht + saastoPerKk;
			saastoYht = saastoYhtTemp;
			System.out.println(i +". kuukausi " +des2.format(saastoPerKk) +" euroa, säästösumma " +des2.format(saastoYhtTemp) +" euroa");
		}

		input.close();
	}

}
