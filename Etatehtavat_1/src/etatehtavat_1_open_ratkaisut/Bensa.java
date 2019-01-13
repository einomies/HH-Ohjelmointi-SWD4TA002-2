package etatehtavat_1_open_ratkaisut;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bensa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double litrat=0.0, litraHinta=0.0, hintaKm=0.0;
		int km=0;
		System.out.print("Anna tankattu m‰‰r‰: ");
		litrat=input.nextDouble();
		System.out.print("Anna ajetut kilometrit: ");
		km=input.nextInt();
		System.out.print("Anna litrahinta: ");
		litraHinta=input.nextDouble();
		hintaKm = (litrat*litraHinta)/km;
		System.out.println("Ajo per kilometri maksaa " + des.format(hintaKm));
		input.close();
	}

}
