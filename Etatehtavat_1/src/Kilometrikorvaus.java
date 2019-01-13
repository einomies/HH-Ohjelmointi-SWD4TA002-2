import java.text.DecimalFormat;
import java.util.Scanner;

/*
3)	Tee ohjelma Kilometrikorvaus, joka laskee omalla autolla ajojen kilometrikorvaukset.

Ohjelma kysyy ajokilometrej‰, kunnes k‰ytt‰j‰ antaa nollan.
T‰m‰n j‰lkeen ohjelma n‰ytt‰‰ ajetut kilometrit sek‰ ajoista maksettavan korvauksen.
Korvaus on 0.43 euroa per kilometri.
 
Esimerkki ohjelmasta
Anna ajetut kilometrit (0 lopettaa): 12
Anna ajetut kilometrit (0 lopettaa): 13
Anna ajetut kilometrit (0 lopettaa): 10 
Anna ajetut kilometrit (0 lopettaa): 5
Anna ajetut kilometrit (0 lopettaa): 0
Yhteens‰ 40 kilometri‰
Korvaus on 17,20 euroa
 */

public class Kilometrikorvaus {

	public static void main(String[] args) {
		
		final double korvausPerKm = 0.43;
		
		int kmKerta=0, kmYht=0, kmTemp=0;
		double korvaus = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			kmKerta = input.nextInt();
			kmTemp = kmYht + kmKerta;
			kmYht = kmTemp;
		} while (kmKerta != 0);

		input.close();
		
		System.out.println("Yhteens‰ " +kmYht +" kilometri‰");
		
		korvaus = korvausPerKm * kmYht;
		DecimalFormat des2 = new DecimalFormat("0.00");
		System.out.println("Korvaus on " +des2.format(korvaus) +" euroa");
	}

}
