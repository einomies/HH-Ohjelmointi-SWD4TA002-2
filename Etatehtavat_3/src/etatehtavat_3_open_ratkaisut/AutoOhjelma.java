package etatehtavat_3_open_ratkaisut;

import java.util.Scanner;

public class AutoOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputLine = new Scanner(System.in);
		Auto auto = new Auto();
		System.out.print("Anna merkki:");		
		auto.setMerkki(inputLine.nextLine());
		System.out.print("Anna malli:");
		auto.setMalli(inputLine.nextLine());
		System.out.print("Anna rekisterinumero:");
		auto.setRekisterinumero(input.next());
		System.out.print("Anna vuosimalli:");
		auto.setVuosimalli(input.nextInt());		
		System.out.println("Merkki ja malli: " + auto.getMerkki() + " " + auto.getMalli());
		System.out.println("Rekisterinumero: " + auto.getRekisterinumero());
		System.out.println("Vuosimalli: " + auto.getVuosimalli());
		System.out.println("Autosi ikä on "+auto.getIka()+" vuotta.");
		input.close();
		inputLine.close();
	}
}
