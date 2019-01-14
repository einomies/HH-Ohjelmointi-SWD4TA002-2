
// Pohjana k�ytet��n viikoilla 9 ja 10 tehty� luokkaa 

public class Tili {

	private static double korkoprosentti = 0.2;

	private String numero;
	private double saldo;

	public Tili() {
		numero = "";
		saldo = 0.0;
	}

	public Tili(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double uusiSaldo) {
		saldo = uusiSaldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void pano(double maara) {
		saldo = saldo + maara;
	}

	public boolean otto(double maara) {
		if (saldo >= maara) {
			saldo = saldo - maara;
			return true;
		} else {
			return false;
		}
	}

	public static double getKorkoprosentti() {
		return korkoprosentti;
	}

	public static void setKorkoprosentti(double korkoprosentti) {
		Tili.korkoprosentti = korkoprosentti;
	}

	public String toString() {
		return "numero=" + numero + ", saldo=" + saldo + ", korkoprosentti="
				+ korkoprosentti;
	}

}
