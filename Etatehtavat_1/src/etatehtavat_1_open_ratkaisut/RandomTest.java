package etatehtavat_1_open_ratkaisut;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int noppa=0, lkm=0;
		for(int i=0;i<10000;i++){
			noppa = r.nextInt(6) + 1;  //noppa saa arvon 1-6
			if(noppa==6){
				lkm++;
			}
		}
		System.out.println("Numero 6 tuli "+lkm+" kertaa.");
		if(lkm<1500||lkm>1833){
			System.out.println("Satunnaislukugeneraattori ei toimi oletetusti.");
		}else{
			System.out.println("Satunnaislukugeneraattori toimii oletetusti.");
		}

	}

}
