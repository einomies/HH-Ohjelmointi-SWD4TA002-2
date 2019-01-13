package etatehtavat_3_open_ratkaisut;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kirjan nimi: ");
		String kNimi = input.nextLine();
		System.out.print("Kirjan isbn: ");
		String isbn = input.nextLine();
		System.out.print("Kirjan hinta: ");
		double hinta = Double.parseDouble(input.nextLine());
		System.out.print("Kustantajan nimi: ");
		String kustNimi = input.nextLine();
		System.out.print("Kustantajan osoite: ");
		String osoite = input.nextLine();
		System.out.print("Kustantajan puhelin: ");
		String puhelin = input.nextLine();
		Kustantaja kustantaja = new Kustantaja(kustNimi, osoite, puhelin);		
		Kirja kirja = new Kirja(kNimi, isbn, hinta, kustantaja);
		
		System.out.println("Kirjan "+kirja.getNimi()+" kustantaja on " 
						+ kirja.getKustantaja().getNimi());
		input.close();
	}
}














