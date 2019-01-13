package etatehtavat_2_open_ratkaisut;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] lampoTilat = new int[100];
		int sArvo=0, lkm=0;
		for(int i=0;i<lampoTilat.length;i++){
			System.out.print("Anna lämpötila: ");
			sArvo=input.nextInt();
			if(sArvo==-999){
				break;
			}else{
				lampoTilat[i]=sArvo;
				lkm++;
			}
		}
		Arrays.sort(lampoTilat,0,lkm);
		System.out.print("Annoit lämpötilat: ");
		for(int i=0;i<lkm;i++){
			System.out.print(lampoTilat[i] + " ");
		}
		input.close();
	}
}
