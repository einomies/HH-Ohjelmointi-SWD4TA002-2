import java.text.DecimalFormat;
import java.util.Scanner;

public class Rekisterinumerot {

/*
4) Tee ohjelma Rekisterinumerot, joka kysyy rekisterinumeroita maksimissaan 10 kappaletta tai kunnes rekisterinumeroksi annetaan ñ.
Jos taulukko t‰yttyy, ohjelma kertoo îEi en‰‰ rekisterinumeroitaî.
Kukin rekisterinumero laitetaan taulukkoon siten, ett‰ rekisterinumeron kirjaimet on muunnettu suurella kirjoitetuiksi.
Lopuksi ohjelma n‰ytt‰‰ annetut rekisterinumerot.

Esimerkki ohjelmasta
Anna rekisterinumero (- lopettaa): aaa -111
Anna rekisterinumero (- lopettaa): abc -123
Anna rekisterinumero (- lopettaa): XxX -999
Anna rekisterinumero (- lopettaa): -
Rekisterinumerot ovat:
AAA-111
ABC-123
XXX-999
 */
	
	public static void main(String[] args) {
		
		final int rekNroLkmMax = 10;
		int rekNroLkm = 0;
		String[] rekisterinumerot;
		String rekNro = null;
		final String lopetusLoitsu = "-";
		
		Scanner input = new Scanner(System.in);
		
		rekisterinumerot = new String[rekNroLkmMax];
		
		do {
			System.out.print("Anna rekisterinumero (- lopettaa): ");
			rekNro = input.nextLine();
			if (!rekNro.equalsIgnoreCase(lopetusLoitsu)) {
				rekNroLkm++;
				if (rekNroLkm >= rekNroLkmMax) {
					rekNro = rekNro.trim().toUpperCase();
					rekisterinumerot[rekNroLkm-1] = rekNro;
					System.out.println("Ei en‰‰ rekisterinumeroita");
					rekNro = lopetusLoitsu;
				} else {
					rekNro = rekNro.trim().toUpperCase();
					rekisterinumerot[rekNroLkm-1] = rekNro;
				}
			}
		} while (!rekNro.equalsIgnoreCase(lopetusLoitsu));

		input.close();

		System.out.println();
		System.out.println("Rekisterinumerot ovat:");

		for (int i=0; i<rekisterinumerot.length && i<rekNroLkm; i++) {
			System.out.println(rekisterinumerot[i]);
		}
	}

}
