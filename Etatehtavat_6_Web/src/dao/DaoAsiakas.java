package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Asiakas;

public class DaoAsiakas {
	private Connection con=null;
	private ResultSet rs = null;
	private PreparedStatement stmtPrep=null;
	private String sql;

	private Connection yhdista(){
    	Connection con = null;
    	String JDBCAjuri = "org.mariadb.jdbc.Driver";
//    	String url = "jdbc:mariadb://localhost:15001/christian_brade";
    	String url = "jdbc:mariadb://localhost:15001/a1505210";
    	try {
	         Class.forName(JDBCAjuri);
//	         con = DriverManager.getConnection(url,"christian.brade", "miTIjn35w");
	         con = DriverManager.getConnection(url,"a1505210", "jaZIjt83v");
	     }catch (Exception e){
	        e.printStackTrace();
	     }
	     return con;
	}

	public boolean lisaaAsiakas(Asiakas asiakas){
		boolean paluuArvo=true;
		sql="INSERT INTO asiakkaat VALUES(?,?,?,?,?)";
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql);
			stmtPrep.setInt(1, asiakas.getAsiakasId());
			stmtPrep.setString(2, asiakas.getEtunimi());
			stmtPrep.setString(3, asiakas.getSukunimi());
			stmtPrep.setString(4, asiakas.getPuhelin());
			stmtPrep.setString(5, asiakas.getSposti());
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			paluuArvo=false;
		}
		return paluuArvo;
	}

	public ArrayList<Asiakas> listaaKaikki(){
		ArrayList<Asiakas> asiakkaat = new ArrayList<Asiakas>();
		sql = "SELECT * FROM asiakkaat";
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);
        		rs = stmtPrep.executeQuery();
				if(rs!=null){ //jos kysely onnistui
					con.close();
					while(rs.next()){
						Asiakas asiakas = new Asiakas();
						asiakas.setAsiakasId(rs.getInt(1));
						asiakas.setEtunimi(rs.getString(2));
						asiakas.setSukunimi(rs.getString(3));
						asiakas.setPuhelin(rs.getString(4));
						asiakas.setSposti(rs.getString(5));
						asiakkaat.add(asiakas);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asiakkaat;
	}

	public Asiakas loytyykoAsiakas(int asiakasId){
		Asiakas asiakas = null;
		sql = "SELECT * FROM asiakkaat WHERE asiakas_id=?";
		try {
			con=yhdista();
			if(con!=null){
				stmtPrep = con.prepareStatement(sql);
				stmtPrep.setInt(1, asiakasId);
        		rs = stmtPrep.executeQuery();
        		if(rs.isBeforeFirst()){ //jos kysely tuotti dataa, eli asiakas_id on k�yt�ss�
        			rs.next();
        			asiakas = new Asiakas();
					asiakas.setAsiakasId(rs.getInt(1));
					asiakas.setEtunimi(rs.getString(2));
					asiakas.setSukunimi(rs.getString(3));
					asiakas.setPuhelin(rs.getString(4));
					asiakas.setSposti(rs.getString(5));
        			con.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asiakas;
	}

	public boolean muutaAsiakas(Asiakas asiakas, int asiakasId){
		boolean paluuArvo=true;
		sql="UPDATE asiakkaat SET etunimi=?, sukunimi=?, puhelin=?, sposti=? WHERE asiakas_id=?";
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql);
			stmtPrep.setString(1, asiakas.getEtunimi());
			stmtPrep.setString(2, asiakas.getSukunimi());
			stmtPrep.setString(3, asiakas.getPuhelin());
			stmtPrep.setString(4, asiakas.getSposti());
			stmtPrep.setInt(5, asiakas.getAsiakasId());
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			paluuArvo=false;
		}
		return paluuArvo;
	}

	public boolean poistaAsiakas(int asiakasId){
		boolean paluuArvo=true;
		sql="DELETE FROM asiakkaat WHERE asiakas_id=?";
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql);
			stmtPrep.setInt(1, asiakasId);
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			paluuArvo=false;
		}
		return paluuArvo;
	}
}
