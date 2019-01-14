package etatehtavat_4_open_ratkaisut;

public class TyontekijaOhjelma {

	public static void main(String[] args) {
		Lukija lukija = new Lukija();
		Tyontekija ttek = new Tyontekija();
		ttek.setNimi(lukija.lueTeksti("Anna nimi: "));
		ttek.setOsoite(lukija.lueTeksti("Anna osoite: "));
		ttek.setTuntiPalkka(lukija.lueDesimaaliluku("Anna tuntipalkka: "));
		System.out.println("Nimi: " + ttek.getNimi());
		System.out.println("Osoite: " + ttek.getOsoite());
		System.out.println("Tuntipalkka: " + ttek.getTuntiPalkka());
	}
}
