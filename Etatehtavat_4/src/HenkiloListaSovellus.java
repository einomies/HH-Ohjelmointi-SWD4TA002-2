import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkiloListaSovellus {

	Scanner input = new Scanner(System.in);
	private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
	
	public HenkiloListaSovellus() {
		lisaaEkat();
		naytaValikko();
	}

	private void lisaaEkat() {

		Henkilo henkilo1 = new Henkilo();
		henkilo1.setNimi("Nimi Aaa");
		henkilo1.setOsoite("Osoite Aaa");
		henkilo1.setPituus(1.60);
		henkilo1.setPaino(60);
		henkilot.add(henkilo1);
		
		Henkilo henkilo2 = new Henkilo();
		henkilo2.setNimi("Nimi Bbb");
		henkilo2.setOsoite("Osoite Bbb");
		henkilo2.setPituus(1.70);
		henkilo2.setPaino(70);
		henkilot.add(henkilo2);
		
		Henkilo henkilo3 = new Henkilo();
		henkilo3.setNimi("Nimi Ccc");
		henkilo3.setOsoite("Osoite Ccc");
		henkilo3.setPituus(1.80);
		henkilo3.setPaino(80);
		henkilot.add(henkilo3);
		
		Henkilo henkilo4 = new Henkilo();
		henkilo4.setNimi("Nimi Ddd");
		henkilo4.setOsoite("Osoite Ddd");
		henkilo4.setPituus(1.90);
		henkilo4.setPaino(90);
		henkilot.add(henkilo4);
		
		Henkilo henkilo5 = new Henkilo();
		henkilo5.setNimi("Nimi Eee");
		henkilo5.setOsoite("Osoite Eee");
		henkilo5.setPituus(2.00);
		henkilo5.setPaino(100);
		henkilot.add(henkilo5);
	}

	private void naytaValikko() {
		
		try {

			int valinta = 0;

			do {
				System.out.println("\n1. Lisää henkilö");
				System.out.println("2. Näytä henkilön tiedot");
				System.out.println("3. Muuta henkilön nimi ja osoite");
				System.out.println("4. Muuta henkilön koko");
				System.out.println("5. Näytä kaikki henkilöt");
				System.out.println("0. Lopetus");
				System.out.print("Anna valintasi: ");
				valinta = input.nextInt();
				input.nextLine();

				switch (valinta) {
				case 1:
					lisaaHenkilo();
					break;
				case 2:
					naytaHenkilönTiedot();
					break;
				case 3:
					muutaHenkilonTietoja("perustiedot");
					break;
				case 4:
					muutaHenkilonTietoja("koko");
					break;
				case 5:
					naytaKaikkiHenkilot();
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Väärä valinta, valitse arvot väliltä 0-5");
					break;
				}

			} while (valinta != 0);
			
			input.close();
			
		} catch (Exception ex) {
			System.out.println("Käsittely ei onnistu, koska");
			System.out.println(ex.getMessage());
		}
	}

	private void naytaKaikkiHenkilot() {

		System.out.println();
		for (int i=0; i<henkilot.size(); i++) {
			tulostaHenkilo(henkilot.get(i));
		}
	}

	private void tulostaHenkilo(Henkilo henkilo) {
		System.out.println("Nimi         : " +henkilo.getNimi());
		System.out.println("Osoite       : " +henkilo.getOsoite());
		DecimalFormat des2 = new DecimalFormat("0.00");
		System.out.println("Pituus       : " +des2.format(henkilo.getPituus()));
//		System.out.println("Paino        : " +henkilot.get(i).getPaino());
		System.out.println("Painoindeksi : " +des2.format(henkilo.getPainoindeksi(henkilo)));
		System.out.println();
		}

	private void muutaHenkilonTietoja(String muutosvipu) {
		
		final String muutosvipuPerustiedot = "perustiedot";
		final String muutosvipuKoko = "koko";

		String annettuNimi = kysyNimi();
		
		int lkm = 0;

		for (int i=0; i<henkilot.size(); i++) {
			
			if (henkilot.get(i).getNimi().equalsIgnoreCase(annettuNimi)) {
				lkm++;
				if (muutosvipu.equalsIgnoreCase(muutosvipuKoko)) {
					System.out.print("Anna pituus: ");
					henkilot.get(i).setPituus(input.nextDouble());
					System.out.print("Anna paino: ");
					henkilot.get(i).setPaino(input.nextDouble());
				} else {
					System.out.print("Anna nimi: ");
					henkilot.get(i).setNimi(input.nextLine());
					System.out.print("Anna osoite: ");
					henkilot.get(i).setOsoite(input.nextLine());
				}
			}
		}
		
		if (lkm == 0) {
			System.out.println("Henkilöä ei ole");
		}
	}

	private void naytaHenkilönTiedot() {

		String annettuNimi = kysyNimi();
		int lkm = 0;

		for (int i=0; i<henkilot.size(); i++) {
			
			if (henkilot.get(i).getNimi().equalsIgnoreCase(annettuNimi)) {
				lkm++;
				tulostaHenkilo(henkilot.get(i));
			}
		}

		if (lkm == 0) {
			System.out.println("Henkilöä ei ole");
		}
	}

	private String kysyNimi() {
		System.out.print("Anna henkilön nimi: ");
		String nimi = input.nextLine();
		return nimi;
	}

	private void lisaaHenkilo() {

		Henkilo henkilo = new Henkilo();
		
		henkilo.setNimi(kysyNimi());

		System.out.print("Anna osoite: ");
		henkilo.setOsoite(input.nextLine());
		System.out.print("Anna pituus: ");
		henkilo.setPituus(input.nextDouble());
		System.out.print("Anna paino: ");
		henkilo.setPaino(input.nextDouble());
		
		henkilot.add(henkilo);
	}

	public static void main(String[] args) throws Exception {
		new HenkiloListaSovellus();
	}

}
