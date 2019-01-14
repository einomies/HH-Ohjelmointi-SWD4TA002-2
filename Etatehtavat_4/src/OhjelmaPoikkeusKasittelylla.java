import java.util.Scanner;

public class OhjelmaPoikkeusKasittelylla {

	/**
	 * Esimerkki poikkeusk�sittelyn k�yt�st�. pyydaKokonaisluku()-metodi heitt��
	 * tarvittaessa poikkeuksen kutsuvalle metodille
	 */
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int ika;
		boolean okSyote = false;
		do {
			try {
				ika = pyydaKokonaisluku();
				okSyote = true;

			} catch (NumberFormatException e) {
				System.out.println("Sy�t� kokonaisluku numeroina!");
			}
		} while (okSyote != true);
		// ... ohjelma jatkuu
		System.out.println("Kiitos ohjelman k�yt�st�!");

	}

	private static int pyydaKokonaisluku() throws NumberFormatException {
		String syote;
		int luku;
		System.out.println("Anna kokonaisluku: ");
		try {
			syote = input.nextLine();
			luku = Integer.parseInt(syote); // voi heitt�� NumberFormatEx...
		} catch (NumberFormatException e) {
			throw e; // throw-lause lopettaa my�s. metodin suorituksen
		}
		return luku;
	}

}
