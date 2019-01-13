package etatehtavat_2_open_ratkaisut;

import java.util.Scanner;

public class Rekisterinumerot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] rekNrot = new String[10];
		String sArvo="";
		int lkm=0;
		for(int i=0;i<10;i++){
			System.out.print("Anna rekisterinumero (-lopettaa):");
			sArvo=input.next();
			if(sArvo.equals("-")){
				break;  //tai i=10;
			}else{
				rekNrot[i]=sArvo;
				lkm++;
			}
		}
		if(lkm==10){
			System.out.println("Ei enää rekisterinumeroita");
		}
		System.out.println("Rekisterinumerot ovat: ");
		for(int i=0;i<lkm;i++){
			System.out.println(rekNrot[i]);
		}
		input.close();
	}
}
