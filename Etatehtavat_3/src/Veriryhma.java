import java.util.Scanner;

/*
2)	Tee ohjelma Veriryhma, joka kysyy luovuttajien veriryhmi‰ ja kertoo kaikkien luovutusten m‰‰r‰n sek‰ tietyn veriryhm‰n luovutusten m‰‰r‰n.
Veriryhmi‰ kysyt‰‰n, kunnes veriryhm‰ksi annetaan ñ tai maksimissaan 1000 kappaletta.
T‰m‰n j‰lkeen ohjelma kysyy, mink‰ veriryhm‰n luovutusten m‰‰r‰ lasketaan.
Lopuksi ohjelma kertoo kaikkien luovutusten m‰‰r‰n sek‰ pyydetyn veriryhm‰n luovutusten m‰‰r‰n.

Esimerkki ohjelmasta
Anna veriryhm‰ (- lopettaa): A+ 
Anna veriryhm‰ (- lopettaa): A- 
Anna veriryhm‰ (- lopettaa): A+ 
Anna veriryhm‰ (- lopettaa): O- 
Anna veriryhm‰ (- lopettaa): A+ 
Anna veriryhm‰ (- lopettaa): - 
Luovutuksia oli yhteens‰ 5
Mink‰ veriryhm‰n luovutusten m‰‰r‰n haluat tiet‰‰: A+
Veriryhm‰n A+ luovutuksia oli 3

K‰yt‰ ohjelmassa kahta itse tekem‰‰si metodia.
 */

public class Veriryhma {

	private Scanner input = new Scanner(System.in);

	public Veriryhma() {
		String[] veriryhmat = new String[1000];
		int lkm = kysyVeriryhmat(veriryhmat, veriryhmat.length);
		String veriryhma = kysyLuovutus();
		int luovutusLkm = laskeLuovutus(veriryhmat, lkm, veriryhma);
		naytaLuovutus(veriryhma, luovutusLkm);
	}

	private int kysyVeriryhmat(String[] veriryhmat, final int MAX) {
		String valinta = null;
		int i = 0;

		for (i=0; i<MAX; i++) {
			System.out.print("Anna veriryhm‰ (- lopettaa): ");
			valinta = input.next();
			if (valinta.equals("-")) {
				break;
			} else {
				veriryhmat[i] = valinta;
			}
		}

		return i;
	}

	public String kysyLuovutus() {
		System.out.print("Mink‰ veriryhm‰n luovutusten m‰‰r‰n haluat tiet‰‰: ");
		String veriryhma = input.next();

		return veriryhma;
	}
	
	public int laskeLuovutus(String[] veriryhmat, int koko, String veriryhma) {
		int i = 0, lkm = 0;
		
		for (i=0; i<koko; i++) {
			if (veriryhmat[i].equals(veriryhma)) {
				lkm++;
			}
		}
		
		return lkm;
	}

	public void naytaLuovutus(String veriryhma, int lkm) {
		System.out.println("Veriryhm‰n " +veriryhma +" luovutuksia oli " +lkm);
	}

	public static void main(String[] args) {
		
		new Veriryhma();
	}

}
