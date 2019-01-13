package etatehtavat_2_open_ratkaisut;

import java.util.Scanner;

public class Sananlasku {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int merkkeja=0, lkm=0;
		String sArvo="";
		boolean jatkuu=true;
		do{
			System.out.print("Anna sananlasku: ");
			sArvo=input.nextLine().trim();
			if(sArvo.equals("LOPPU")){
				jatkuu=false;
			}else{
				lkm++;
				merkkeja+=sArvo.length();
			}
		}while(jatkuu); //jatkuu==true
		System.out.println("Sananlaskuja oli "+lkm+" kappaletta.");
		System.out.println("Sananlaskuissa oli merkkejä yhteensä "+merkkeja);
		input.close();
	}
}
