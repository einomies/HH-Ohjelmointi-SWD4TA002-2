package etatehtavat_3_open_ratkaisut;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {
	private Scanner input = new Scanner(System.in);
	
	public Kulutus(){
		int km=kysyKilometrit();		
		int litrat=kysyTankkaus();		
		double kulutus = laskeKulutus(km,litrat);
		naytaKulutus(kulutus);
	}
	
	private int kysyKilometrit(){
		System.out.print("Anna ajetut kilometrit: ");
		return input.nextInt();
	}
	
	private int kysyTankkaus(){
		System.out.print("Anna kulunut polttoainem‰‰r‰: ");
		return input.nextInt();
	}
	
	private double laskeKulutus(int kilometrit, int litrat){
		return  (double)litrat / kilometrit * 100;
	}
	
	private void naytaKulutus(double kulutus){
		DecimalFormat des = new DecimalFormat("0.00");		
		System.out.println("Kulutus/100km on "+des.format(kulutus)+" litraa");
	}
	
	public static void main(String[] args) {
		new Kulutus();
	}

}
