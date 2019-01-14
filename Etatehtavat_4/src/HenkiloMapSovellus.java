import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HenkiloMapSovellus {

	Scanner input = new Scanner(System.in);
	
	private Map<String, Henkilo> henkilot = new HashMap<String, Henkilo>();

	public HenkiloMapSovellus() {
		lisaaEkat();
		naytaValikko();
	}

	private void lisaaEkat() {
		
		String nimi = null;

		Henkilo henkilo1 = new Henkilo();
		henkilo1.setNimi("Nimi Aaa");
		henkilo1.setOsoite("Osoite Aaa");
		henkilo1.setPituus(1.60);
		henkilo1.setPaino(60);
		nimi = henkilo1.getNimi();
		henkilot.put(nimi, henkilo1);
		
		Henkilo henkilo2 = new Henkilo();
		henkilo2.setNimi("Nimi Bbb");
		henkilo2.setOsoite("Osoite Bbb");
		henkilo2.setPituus(1.70);
		henkilo2.setPaino(70);
		nimi = henkilo2.getNimi();
		henkilot.put(nimi, henkilo2);
		
		Henkilo henkilo3 = new Henkilo();
		henkilo3.setNimi("Nimi Ccc");
		henkilo3.setOsoite("Osoite Ccc");
		henkilo3.setPituus(1.80);
		henkilo3.setPaino(80);
		nimi = henkilo3.getNimi();
		henkilot.put(nimi, henkilo3);
		
		Henkilo henkilo4 = new Henkilo();
		henkilo4.setNimi("Nimi Ddd");
		henkilo4.setOsoite("Osoite Ddd");
		henkilo4.setPituus(1.90);
		henkilo4.setPaino(90);
		nimi = henkilo4.getNimi();
		henkilot.put(nimi, henkilo4);
		
		Henkilo henkilo5 = new Henkilo();
		henkilo5.setNimi("Nimi Eee");
		henkilo5.setOsoite("Osoite Eee");
		henkilo5.setPituus(2.00);
		henkilo5.setPaino(100);
		nimi = henkilo5.getNimi();
		henkilot.put(nimi, henkilo5);

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
					naytaHenkilonTiedot();
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

		Set<String> nimet = henkilot.keySet();
		Iterator<String> i = nimet.iterator();

		System.out.println();
		
		String seurNimi = null; // seuraava nimi
		Henkilo seurHenkilo = null; // seuraava Henkilo-olio

		while (i.hasNext()) {
			seurNimi = i.next();
			seurHenkilo = henkilot.get(seurNimi);
			tulostaHenkilo(seurHenkilo);
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

		String annettuNimi = null;
		Henkilo henkilo;
		
		annettuNimi = kysyNimi();
		henkilo = henkilot.get(annettuNimi);

		if (henkilo != null) {
			if (muutosvipu.equalsIgnoreCase(muutosvipuKoko)) {
				System.out.print("Anna pituus: ");
				henkilo.setPituus(input.nextDouble());
				
				System.out.print("Anna paino: ");
				henkilo.setPaino(input.nextDouble());
			} else {
//				Koska tässä sorkitaan Mapin avainta, tällöin varmaankin pitää luoda uusi Map-objekti ja lisätä se HashMappiin
//				ja sen jälkeen poistaa vanhalla avaimella (=nimi) oleva Map-objekti HashMapista ???????????
				String vanhaNimi = henkilo.getNimi();
				String uusiNimi = null;

				System.out.print("Anna nimi: ");
				uusiNimi = input.nextLine();
				henkilo.setNimi(uusiNimi);
				
				System.out.print("Anna osoite: ");
				henkilo.setOsoite(input.nextLine());
//				Lisätään uuden avaimen mukainen Map-objekti HashMappiin 
				henkilot.put(uusiNimi, henkilo);
//				Poistetaan vanhan avaimen mukainen Map-objekti HashMapista 
				henkilot.remove(vanhaNimi);
			}
		} else {
			System.out.println("Henkilöä ei ole");
		}
	}

	private void naytaHenkilonTiedot() {

		String annettuNimi = kysyNimi();

		Henkilo henkilo = henkilot.get(annettuNimi);
		if (henkilo != null) {
			tulostaHenkilo(henkilo);
		} else {
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
		String nimi = null;
		
		henkilo.setNimi(kysyNimi());
		nimi = henkilo.getNimi();

		System.out.print("Anna osoite: ");
		henkilo.setOsoite(input.nextLine());
		System.out.print("Anna pituus: ");
		henkilo.setPituus(input.nextDouble());
		System.out.print("Anna paino: ");
		henkilo.setPaino(input.nextDouble());
		
		henkilot.put(nimi, henkilo);
	}

	public static void main(String[] args) throws Exception {
		new HenkiloMapSovellus();
	}

}
