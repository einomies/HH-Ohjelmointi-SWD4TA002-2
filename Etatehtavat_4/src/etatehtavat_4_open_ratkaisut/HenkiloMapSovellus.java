package etatehtavat_4_open_ratkaisut;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HenkiloMapSovellus {
	Lukija lukija = new Lukija();	
	HashMap<String, Henkilo> hlot = new HashMap<String, Henkilo>();
	
	public HenkiloMapSovellus(){
		naytaValikko();
	}
	
	private void naytaValikko() {
		System.out.println("\n1. Lisää henkilö");		
		System.out.println("2. Näytä henkilön tiedot");		
		System.out.println("3. Muuta henkilön nimi ja osoite");		
		System.out.println("4. Muuta henkilön koko");		
		System.out.println("5. Näytä kaikki henkilöt");		
		System.out.println("0. Lopetus");
		switch (lukija.lueKokonaisluku("Anna valintasi (0-5): ")) {
		case 1:
			lisaaHlo();
			break;
		case 2:
			naytaHlo();
			break;
		case 3:
			muutaHlo();
			break;
		case 4:
			muutaKoko();
			break;
		case 5:
			naytaKaikki();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			break;
		};
		naytaValikko();
	}

	private void lisaaHlo() {
		Henkilo hlo = new Henkilo();
		hlo.setNimi(lukija.lueTeksti("Anna nimi: "));
		hlo.setOsoite(lukija.lueTeksti("Anna osoite: "));
		hlo.setKoko(new Koko(lukija.lueDesimaaliluku("Anna pituus: "), 
				lukija.lueKokonaisluku("Anna paino: ")));
		hlot.put(hlo.getNimi(), hlo);
	}

	private void naytaHlo() {
		String key = lukija.lueTeksti("Anna näytettävän henkilön nimi: ");
		if(!hlot.containsKey(key)){
			System.out.println("Henkilöä ei ole");
		}else{			
			System.out.println("Nimi: " + hlot.get(key).getNimi());
			System.out.println("Osoite: " + hlot.get(key).getOsoite());
			System.out.println("Pituus: " + hlot.get(key).getKoko().getPituus());
			System.out.println("Painoindeksi: " + hlot.get(key).getKoko().getPainoindeksi());
		}		
	}

	private void muutaHlo() {
		String key = lukija.lueTeksti("Anna perustietoja muutettavan henkilön nimi: ");
		if(!hlot.containsKey(key)){
			System.out.println("Henkilöä ei ole");
		}else{			
			hlot.get(key).setNimi(lukija.lueTeksti("Anna nimi: "));
			hlot.get(key).setOsoite(lukija.lueTeksti("Anna osoite: "));
			//tässä pitäisi myös vaihtaa avain, jota ei voi tehdä muuten kuin poistamalla vanha objekti ja lisäämällä uusi objekti
			//hashMap.put("New_Key", hashMap.remove("Old_Key"));			
			hlot.put(hlot.get(key).getNimi(), hlot.remove(key));
		}			
	}

	private void muutaKoko() {
		String key = lukija.lueTeksti("Anna kokoa muutettavan henkilön nimi: ");
		if(!hlot.containsKey(key)){
			System.out.println("Henkilöä ei ole");
		}else{			
			hlot.get(key).getKoko().setPituus(lukija.lueDesimaaliluku("Anna pituus: "));
			hlot.get(key).getKoko().setPaino(lukija.lueKokonaisluku("Anna paino: "));
		}			
	}

	private void naytaKaikki() {	
		Set<String> nicit= hlot.keySet();
		Iterator<String> i = nicit.iterator();
		Henkilo hlo;
		while (i.hasNext()) {
			hlo=hlot.get(i.next());
			System.out.println("\nNimi: " + hlo.getNimi());
			System.out.println("Osoite: " + hlo.getOsoite());
			System.out.println("Pituus: " + hlo.getKoko().getPituus());
			System.out.println("Painoindeksi: " + hlo.getKoko().getPainoindeksi());
		}			
	}
		
	public static void main(String[] args) {
		new HenkiloMapSovellus();
	}

}
