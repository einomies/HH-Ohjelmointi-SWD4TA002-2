package etatehtavat_3_open_ratkaisut;

import java.util.Scanner;

public class Veriryhma {
	private Scanner input = new Scanner(System.in);
	private String [] veriRyhmat = {"AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-"};
	private int [] lkm = new int[veriRyhmat.length];
	
	public Veriryhma(){
		int luovutuksia = kysyVeriryhmat();
		System.out.println("Luovutuksia oli yhteens‰ " + luovutuksia);
		System.out.print("Mink‰ veriryhm‰n luovutusten m‰‰r‰n haluat tiet‰‰:");
		String sArvo = input.next();
		int lkmIndex=onkoVeriryhma(sArvo);
		if(lkmIndex==-1){
			System.out.println("Antamasi arvo ei ole veriryhm‰!");
		}else{
			System.out.println("Veriryhm‰n "+sArvo+" luovutuksia oli " + lkm[lkmIndex]);
		}		
	}
	
	private int kysyVeriryhmat(){
		boolean jatkuu=true;
		String sArvo="";
		int maara=0;
		do {
			System.out.print("Anna veriryhm‰ (- lopettaa): ");
			sArvo=input.next();
			if(sArvo.equals("-")){
				jatkuu=false;
			}else{
				sArvo=sArvo.trim();
				sArvo=sArvo.toUpperCase();
				int lkmIndex=onkoVeriryhma(sArvo);
				if(lkmIndex!=-1){
					lkm[lkmIndex]++;
					maara++;
				}else{
					System.out.println("Antamasi arvo ei ole veriryhm‰!");
				}
			}
		} while (jatkuu);
		return maara;
	}
	
	private int onkoVeriryhma(String sArvo){
		int paluu=-1;
		for(int i=0;i<veriRyhmat.length;i++){
			if(veriRyhmat[i].equals(sArvo)){
				paluu=i;
				break;
			}
		}		
		return paluu;
	}
	
	public static void main(String[] args) {
		new Veriryhma();
	}

}
