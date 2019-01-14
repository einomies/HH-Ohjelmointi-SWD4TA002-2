import java.util.Scanner;

public class TyontekijaOhjelma {
	
	Scanner input = new Scanner(System.in);

	public TyontekijaOhjelma() {
		Tyontekija tyontekija = luoTyontekija();
		System.out.println();
		tulostaTyontekija(tyontekija);
	}

	private void tulostaTyontekija(Tyontekija tyontekija) {
		System.out.println("Nimi: " +tyontekija.getNimi());
		System.out.println("Osoite: " +tyontekija.getOsoite());
		System.out.println("Tuntipalkka: " +tyontekija.getTuntipalkka());
	}

	private Tyontekija luoTyontekija() {
		System.out.println("Anna nimi: ");
//		String nimi = input.nextLine();
		System.out.println("Anna osoite: ");
//		String osoite = input.nextLine();
		System.out.println("Anna tuntipalkka: ");
//		double tuntipalkka = input.nextDouble();
		String nimi = "Duunari A";
		String osoite = "Duunikuja 1 A";
		double tuntipalkka = 15;
		
//		Henkilo henkilo = new Henkilo();
		Tyontekija tyontekija = new Tyontekija();
		tyontekija.setNimi(nimi);
		tyontekija.setOsoite(osoite);
		tyontekija.setTuntipalkka(tuntipalkka);
//		System.out.println(tyontekija.toString());
		
		return tyontekija;
	}

	public static void main(String[] args) {
		new TyontekijaOhjelma();
	}

}
