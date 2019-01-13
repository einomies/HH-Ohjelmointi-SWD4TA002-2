package etatehtavat_2_open_ratkaisut;

import java.util.Scanner;

public class Osoitetarra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String eNimi="", sNimi="", osoite="", postiNro="", postiToimi="";
		System.out.print("Anna etunimi: ");
		eNimi=input.next();
		System.out.print("Anna sukunimi: ");
		sNimi=input.next();
		input.nextLine();
		System.out.print("Anna katuosoite: ");
		osoite = input.nextLine();
		System.out.print("Anna postinumero ja postitoimipaikka:");
		postiNro=input.next();
		postiToimi=input.next();
		eNimi = eNimi.substring(0, 1).toUpperCase()+eNimi.substring(1).toLowerCase();
		sNimi = sNimi.substring(0, 1).toUpperCase()+sNimi.substring(1).toLowerCase();
		osoite = osoite.substring(0, 1).toUpperCase()+osoite.substring(1).toLowerCase();
		postiToimi=postiToimi.toUpperCase();
		System.out.println(eNimi + " " + sNimi);
		System.out.println(osoite);
		System.out.println(postiNro + " " + postiToimi);
		input.close();
	}
}
