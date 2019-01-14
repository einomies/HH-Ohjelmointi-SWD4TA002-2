package model;
/*
mysql> desc asiakkaat;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| asiakas_id | int(11)      | NO   | PRI | NULL    | auto_increment |
| etunimi    | varchar(50)  | NO   |     | NULL    |                |
| sukunimi   | varchar(50)  | NO   |     | NULL    |                |
| puhelin    | varchar(20)  | NO   |     | NULL    |                |
| sposti     | varchar(100) | NO   |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)
 */

public class Asiakas {
	int asiakasId;
	String etunimi, sukunimi, puhelin, sposti;

	public Asiakas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asiakas(int asiakasId, String etunimi, String sukunimi, String puhelin, String sposti) {
		super();
		this.asiakasId = asiakasId;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.puhelin = puhelin;
		this.sposti = sposti;
	}
	
	public int getAsiakasId() {
		return asiakasId;
	}
	public void setAsiakasId(int asiakasId) {
		this.asiakasId = asiakasId;
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getSukunimi() {
		return sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	public String getSposti() {
		return sposti;
	}
	public void setSposti(String sposti) {
		this.sposti = sposti;
	}
	
	@Override
	public String toString() {
		return "Asiakas [asiakasId=" + asiakasId + ", etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", puhelin="
				+ puhelin + ", sposti=" + sposti + "]";
	}

}
