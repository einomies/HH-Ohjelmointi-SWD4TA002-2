package etatehtavat_1_open_ratkaisut;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double yleVeroPros=0.0068, yleVero=0.0;
		int yleMax=140, tulotMin=7353, alaIka=18;
				double tulot=0.0;
		int ika=0;
		//Pyydetään arvot
		System.out.print("Anna vuositulosi ja ikäsi:");
		tulot=input.nextDouble();
		ika=input.nextInt();
		//Lasketaan
		yleVero=tulot*yleVeroPros;
		if(yleVero>yleMax){
			yleVero=yleMax;
		}
		if(ika<alaIka||tulot<tulotMin){
			yleVero=0.0;
		}
		//Tulostetaan
		System.out.println("Ylevero on " + des.format(yleVero));
		input.close();
	}

}
