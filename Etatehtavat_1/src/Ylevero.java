import java.text.DecimalFormat;
import java.util.Scanner;

/*
2)	Tee ohjelma Ylevero, joka kysyy käyttäjän vuositulot sekä iän ja laskee yleveron.

Ylevero on 0,68 % vuosituloista kuitenkin maksimissaan 140 euroa.
Yleveroa ei mene, jos vuositulot jäävät alle 7353 euron.
Alle 18-vuotias ei maksa yleveroa.
Muotoile vastaus kahdella desimaalilla.

Esimerkki ohjelmasta
Anna vuositulosi ja ikäsi: 12000,0 23
Ylevero on 81,60
Toinen esimerkki ohjelmasta
Anna vuositulosi ja ikäsi: 12000,0 17
Ylevero on 0,00
 */

public class Ylevero {

	public static void main(String[] args) {
		
		double vuositulot;
		int ika;
		
		final double veropros = 0.68;
		final double YleveroMax = 140;
		final int alaikaraja = 18;
		final double vuosituloMin = 7353;
		
		double YleveroMaara = 0;
		double YleveroTemp = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Anna vuositulosi ja ikäsi (esim. 30000,0 33): ");
		vuositulot = input.nextDouble();
		ika = input.nextInt();

//		System.out.println("vuositulot: " +vuositulot);
//		System.out.println("ika: " +ika);

		input.close();
		
		DecimalFormat des2 = new DecimalFormat("0.00");
		
		if (ika >= alaikaraja && vuositulot >= vuosituloMin) {
			YleveroTemp = veropros / 100 * vuositulot;
			if (YleveroTemp > YleveroMax) {
				YleveroMaara = YleveroMax;
			} else {
				YleveroMaara = YleveroTemp;
			}
		} else {
			YleveroMaara = 0;
		}

		System.out.println("Ylevero on " +des2.format(YleveroMaara));

	}

}
