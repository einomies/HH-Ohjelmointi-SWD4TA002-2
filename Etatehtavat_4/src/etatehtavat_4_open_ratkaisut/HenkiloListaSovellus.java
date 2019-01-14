package etatehtavat_4_open_ratkaisut;

import java.util.ArrayList;

public class HenkiloListaSovellus {
	Lukija lukija = new Lukija();
	ArrayList<Henkilo> hlot = new ArrayList<Henkilo>();
	
	public HenkiloListaSovellus(){
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
			System.out.println("Väärä valinta!");
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
		hlot.add(hlo);		
	}

	private void naytaHlo() {
		int idx = etsiIndex("Anna näytettävän henkilön nimi: ");
		if(idx==-1){
			System.out.println("Henkilöä ei ole");
		}else{			
			System.out.println("Nimi: " + hlot.get(idx).getNimi());
			System.out.println("Osoite: " + hlot.get(idx).getOsoite());
			System.out.println("Pituus: " + hlot.get(idx).getKoko().getPituus());
			System.out.println("Painoindeksi: " + hlot.get(idx).getKoko().getPainoindeksi());
		}		
	}

	private void muutaHlo() {
		int idx = etsiIndex("Anna perustietoja muutettavan henkilön nimi: ");
		if(idx==-1){
			System.out.println("Henkilöä ei ole");
		}else{			
			hlot.get(idx).setNimi(lukija.lueTeksti("Anna nimi: "));
			hlot.get(idx).setOsoite(lukija.lueTeksti("Anna osoite: "));
		}			
	}

	private void muutaKoko() {
		int idx = etsiIndex("Anna kokoa muutettavan henkilön nimi: ");
		if(idx==-1){
			System.out.println("Henkilöä ei ole");
		}else{			
			hlot.get(idx).getKoko().setPituus(lukija.lueDesimaaliluku("Anna pituus: "));
			hlot.get(idx).getKoko().setPaino(lukija.lueKokonaisluku("Anna paino: "));
		}			
	}

	private void naytaKaikki() {		
		for(int i=0; i<hlot.size();i++){			
			System.out.println("Nimi: " + hlot.get(i).getNimi());
			System.out.println("Osoite: " + hlot.get(i).getOsoite());
			System.out.println("Pituus: " + hlot.get(i).getKoko().getPituus());
			System.out.println("Painoindeksi: " + hlot.get(i).getKoko().getPainoindeksi());
		}		
	}
	
	private int etsiIndex(String ilmo){
		int paluu=-1;
		String nimi = lukija.lueTeksti(ilmo);
		for(int i=0; i<hlot.size();i++){
			if(hlot.get(i).getNimi().equalsIgnoreCase(nimi)){
				paluu=i;
				break;
			}
		}
		return paluu;
	}

	public static void main(String[] args) {
		new HenkiloListaSovellus();
	}
}
