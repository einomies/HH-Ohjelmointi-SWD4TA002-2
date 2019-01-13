import java.util.Random;

/*
5)	Tee ohjelma RandomTest, joka heitt‰‰ arpaa 10 000 kertaa ja kertoo kuinka monta kertaa tuli numero 6.
Jos satunnaislukugeneraattori toimii oikein, tulisi luvun 6 tulla noin 1667 kertaa (10 000/6).
Hyv‰ksyt‰‰n +/- 10 % heitto, eli tuloksen tulisi olla v‰lill‰ 1500ñ1833 kertaa.
Ohjelma kertoo toimiiko satunnaislukugeneraattori +/- 10 % vaihteluv‰lill‰ oikein.

Random r = new Random();
int noppa = r.nextInt(6) + 1;  //noppa saa arvon 1-6

Esimerkki ohjelmasta
Numero 6 tuli 1713 kertaa.
Satunnaislukugeneraattori toimii oletetusti.

Numero 6 tuli 1460 kertaa.
Satunnaislukugeneraattori ei toimi oletetusti.
 */

public class RandomTest {

	public static void main(String[] args) {

		final int nopanSilmienLkm = 6;
		final int haluttuNopanTulos = 6;
		final int heittoLkmMax = 10000;
		final int tulosLkmMin = 1500;
		final int tulosLkmMax = 1833;
		
		int haluttuTulosLkm = 0;
		
		for (int i=1; i<=heittoLkmMax; i++) {
			Random r = new Random();
			int noppa = r.nextInt(nopanSilmienLkm) + 1;  //noppa saa arvon 1-6
			if (noppa == haluttuNopanTulos) {
				haluttuTulosLkm++;
			}
//			System.out.println("heittotulos " +i +": " +noppa);
		}
		
		System.out.println("Numero " +haluttuNopanTulos +" tuli " +haluttuTulosLkm +" kertaa.");
		
		if (haluttuTulosLkm >= tulosLkmMin && haluttuTulosLkm <= tulosLkmMax) {
			System.out.println("Satunnaislukugeneraattori toimii oletetusti.");
		} else {
			System.out.println("Satunnaislukugeneraattori ei toimi oletetusti.");
		}
	}

}
