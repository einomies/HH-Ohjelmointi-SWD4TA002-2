package etatehtavat_1_open_ratkaisut;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double korvausKm=0.43, korvausSumma=0.0;
		int km=0, kmSumma=0;
		boolean jatkuu=true;
		do{
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			km=input.nextInt();
			if(km==0){
				jatkuu=false;
			}else if(km>0){
				kmSumma+=km; //kmSumma=kmSumma+km;
			}else{
				System.out.println("Anna positiivisia kilometrejä!");
			}
		}while(jatkuu); //jatkuu==true
		System.out.println("Yhteensä "+kmSumma+" kilometriä");
		korvausSumma=kmSumma*korvausKm;
		System.out.println("Korvaus on "+des.format(korvausSumma)+" euroa");
		input.close();
	}
}
