import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TiliMapSovellus {

	private Scanner input = new Scanner(System.in);

	private Map<String, Tili> tilit = new HashMap<String, Tili>(); // Map!

	private void lisaaTili() {
		String tiliNro;
		double saldo;
		Tili tili;

		System.out.print("Anna tilinnumero: ");
		tiliNro = input.nextLine();
		System.out.print("Anna alkusaldo: ");
		saldo = input.nextDouble();
		input.nextLine(); // sy�tt�puskurin tyhjennys

		tili = new Tili(tiliNro, saldo);

		tilit.put(tiliNro, tili); // Map-luokan put-metodi
	}

	private void naytaTili() {
		String tiliNro = kysyTilinumero();
		Tili tili = tilit.get(tiliNro); // Map-luokan get-metodi
		if (tili != null) {
			System.out.println("Tilinumero: " + tili.getNumero());
			System.out.println("Saldo: " + tili.getSaldo());
		} else {
			System.out.println("Tili� ei ole numerolla " + tiliNro);
		}
	}

	private void listaaTilit() {

		// Mapin tilinumero-avaimet pyydet��n keySet-metodilla Set:ksi
		Set<String> tilinrot = tilit.keySet();

		// luo Iterator-tyyppinen i-olio, jolla voidaan l�pik�yd�
		// kaikki Set-kokoelman tilinumerot
		Iterator<String> i = tilinrot.iterator();

		String seurTilinro = null; // seuraava tilinro
		Tili seurTili = null; //

		while (i.hasNext()) { // jos l�ytyy viel� seuraava tilinro
			seurTilinro = i.next();
			seurTili = tilit.get(seurTilinro);
			System.out.println("Tilinumero: " + seurTili.getNumero()
					+ ", Saldo: " + seurTili.getSaldo());
		}

		// HashMap tallentaa tilit-rakenteeseen tili-oliot satunnaisessa
		// j�rjestyksess�. T�m� n�kyy my�s tulostuksessa.

	}

	private void poistaTili() {
		String tiliNro;
		Tili poistettuTili = null;
		tiliNro = kysyTilinumero();

		poistettuTili = tilit.remove(tiliNro); // Map-luokan remove-metodi

		if (poistettuTili != null) { // jos poistettava tili l�ytyi
			System.out.println("Tileist� poistettu seuraava tili:");
			System.out.println("Tilinro: " + poistettuTili.getNumero());
			System.out.println("Saldo: " + poistettuTili.getSaldo());
		} else {
			System.out.println("Tili� " + tiliNro + " ei l�ydy tileist�.");
		}
	}

	private String kysyTilinumero() {
		System.out.print("Anna tilinumero: ");
		String numero = input.nextLine();
		return numero;
	}

	private void tulostaValikko() {
		System.out.println("\n*************");
		System.out.println("1. Lis�� tili");
		System.out.println("2. N�yt� tilin tiedot");
		System.out.println("3. N�yt� kaikki tilit");
		System.out.println("4. Poista tili");
		// System.out.println("5. Otto");
		// System.out.println("6. Pano");
		// System.out.println("7. N�yt� korko");
		// System.out.println("8. Muuta korko");
		System.out.println("0. Lopetus");
	}

	public void aja() {
		int valinta = -1; // k�ytt�j�n valitsema numero valikosta

		do {
			tulostaValikko();
			System.out.print("Anna valintasi (0-4): ");
			valinta = input.nextInt();
			input.nextLine(); // sy�tt�puskurin tyhjennys
			System.out.println("\n*************");
			switch (valinta) {
			case 1:
				lisaaTili();
				break;
			case 2:
				naytaTili();
				break;
			case 3:
				listaaTilit();
				break;
			case 4:
				poistaTili();
				break;
			case 5:
				// teeOtto();
				break;
			case 6:
				// teePano();
				break;
			case 7:
				// naytaKorko();
				break;
			case 8:
				// muutaKorko();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}

	public static void main(String[] args) {
		TiliMapSovellus sovellus = new TiliMapSovellus();
		sovellus.aja();
	}
}
