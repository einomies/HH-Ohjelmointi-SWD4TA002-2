package etatehtavat_1_open_ratkaisut;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Saastolaskuri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double tavoite=0.0, kuukausiSaasto=0.0, saastoSumma=0.0;
		int kuukaudet=0;
		System.out.print("Anna säästötavoite: ");
		tavoite = input.nextDouble();
		System.out.print("Anna kuukausien lukumäärä: ");
		kuukaudet = input.nextInt();
		kuukausiSaasto = tavoite/kuukaudet;
		for(int i=0;i<kuukaudet;i++){
			saastoSumma+=kuukausiSaasto;
			System.out.println((i+1)+". kuukausi "+des.format(kuukausiSaasto)
					+" euroa, säästösumma "+des.format(saastoSumma)+" euroa");
		}
		input.close();
	}

}
