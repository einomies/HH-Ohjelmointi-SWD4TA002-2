package etatehtavat_3_open_ratkaisut;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Auto {
	private String malli, merkki, rekisterinumero;
	private int vuosimalli;
	
	public Auto() {
		super();		
	}	
	public Auto(String malli, String merkki, String rekisterinumero, int vuosimalli) {
		super();
		this.malli = malli;
		this.merkki = merkki;
		this.rekisterinumero = rekisterinumero;
		this.vuosimalli = vuosimalli;
	}
	public String getMalli() {
		return malli;
	}
	public void setMalli(String malli) {
		this.malli = malli;
	}
	public String getMerkki() {
		return merkki;
	}
	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	public String getRekisterinumero() {
		return rekisterinumero;
	}
	public void setRekisterinumero(String rekisterinumero) {
		this.rekisterinumero = rekisterinumero;
	}
	public int getVuosimalli() {
		return vuosimalli;
	}
	public void setVuosimalli(int vuosimalli) {
		this.vuosimalli = vuosimalli;
	}
	public int getIka(){
		SimpleDateFormat fdate=new SimpleDateFormat("yyyy");
		int vuosi = Integer.parseInt(fdate.format(new Date()));
		return vuosi-this.vuosimalli;
	}
	@Override
	public String toString() {
		return "Auto [malli=" + malli + ", merkki=" + merkki
				+ ", rekisterinumero=" + rekisterinumero + ", vuosimalli="
				+ vuosimalli + "]";
	}
}
