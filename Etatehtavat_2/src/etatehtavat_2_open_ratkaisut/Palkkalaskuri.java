package etatehtavat_2_open_ratkaisut;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkkalaskuri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double tuntiPalkka=0.0;
		int paivia=0, tuntiSumma=0;
		int [] tunteja;
		System.out.print("Anna tuntipalkkasi: ");
		tuntiPalkka=input.nextDouble();
		System.out.print("Monenko p‰iv‰n tuntim‰‰r‰t annat: ");
		paivia=input.nextInt();
		tunteja = new int[paivia];
		for(int i=0;i<tunteja.length;i++){
			System.out.print("Anna tuntien m‰‰r‰ p‰iv‰ss‰: ");
			tunteja[i]=input.nextInt();
			tuntiSumma+=tunteja[i];
		}
		System.out.println("Tunteja yhteens‰: " + tuntiSumma);
		System.out.println("Bruttopalkkasi: " + des.format(tuntiSumma*tuntiPalkka));
		System.out.print("Annoit tunnit: ");
		for(int i=0;i<tunteja.length;i++){
			System.out.print(tunteja[i]+ " ");
		}
		input.close();
	}
}
