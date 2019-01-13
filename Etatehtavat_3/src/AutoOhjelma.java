import java.sql.Date;
import java.util.Scanner;

public class AutoOhjelma {

	/*
	3) Tee luokka Auto ja sille p‰‰ohjelma AutoOhjelma.
	Auto-luokalla on attribuutit malli, merkki, rekisterinumero ja vuosimalli.
	Tee luokkaan set-, get- ja toString -metodit, parametriton konstruktori ja  parametrillinen konstruktori.
	Tee luokkaan myˆs getIka -metodi, mik‰ kertoo auton i‰n.
	K‰yt‰ metodin tekemiseen Date-luokkaa, vuosimalli-attribuuttia sek‰ Integer.parseInt-metodia.
	Tee p‰‰ohjelmassa Auto-luokan olio parametrittomalla konstruktorilla.
	K‰yt‰ p‰‰ohjelmassa set-metodeja tietojen muuttamiseen ja get-metodeja tietojen n‰ytt‰miseen.

	Esimerkki ohjelmasta
	Anna merkki: Audi
	Anna malli: A6
	Anna rekisterinumero: ABC-123
	Anna vuosimalli: 2010
	Autosi merkki ja malli ovat: Audi A6
	Autosi rekisterinumero on: ABC-123
	Autosi ik‰ on: 6 vuotta
	 */

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna merkki: ");
		auto1.setMerkki(input.nextLine());

		System.out.print("Anna malli: ");
		auto1.setMalli(input.nextLine());
		
		System.out.print("Anna rekisterinumero: ");
		auto1.setRekisterinumero(input.nextLine());
		
		System.out.print("Anna vuosimalli: ");
		auto1.setVuosimalli(input.nextInt());
		
//		System.out.println(auto1);
		
		System.out.println("Autosi merkki ja malli ovat: " +auto1.getMerkki() +" " +auto1.getMalli());
		System.out.println("Autosi rekisterinumero on: " +auto1.getRekisterinumero());
		
		int ika = auto1.getIka();
		System.out.println("Autosi ik‰ on: " +ika +" vuotta");


	}

}
