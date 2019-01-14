package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Vene;

public class Dao {
	private Connection con=null;
	private ResultSet rs = null;
	private PreparedStatement stmtPrep=null;
	private String sql;

	private Connection yhdista(){
    	Connection con = null;
    	String JDBCAjuri = "org.mariadb.jdbc.Driver";
    	String url = "jdbc:mariadb://localhost:15001/a1505210";
    	try {
	         Class.forName(JDBCAjuri);
	         con = DriverManager.getConnection(url,"a1505210", "jaZIjt83v");
	     }catch (Exception e){
	        e.printStackTrace();
	     }
	     return con;
	}

	public boolean lisaaVene(Vene vene){
		boolean paluuArvo=true;
		sql="INSERT INTO veneet (nimi, merkkimalli, pituus, leveys, hinta) VALUES (?,?,?,?,?)";
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql);
			stmtPrep.setString(1, vene.getNimi());
			stmtPrep.setString(2, vene.getMerkkimalli());
			stmtPrep.setDouble(3, vene.getPituus());
			stmtPrep.setDouble(4, vene.getLeveys());
			stmtPrep.setInt(5, vene.getHinta());
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			paluuArvo=false;
		}
		return paluuArvo;
	}

	public ArrayList<Vene> listaaKaikki(){
		ArrayList<Vene> veneet = new ArrayList<Vene>();
		sql = "SELECT * FROM veneet";
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);
        		rs = stmtPrep.executeQuery();
				if(rs!=null){ //jos kysely onnistui
					con.close();
					while(rs.next()){
						Vene vene = new Vene();
						vene.setTunnus(rs.getInt(1));
						vene.setNimi(rs.getString(2));
						vene.setMerkkimalli(rs.getString(3));
						vene.setPituus(rs.getDouble(4));
						vene.setLeveys(rs.getDouble(5));
						vene.setHinta(rs.getInt(6));
						veneet.add(vene);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return veneet;
	}

	public ArrayList<Vene> listaaKaikki(String hakusana){
		ArrayList<Vene> veneet = new ArrayList<Vene>();
		sql = "SELECT * FROM veneet WHERE nimi LIKE ? or merkkimalli LIKE ?";
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);
				stmtPrep.setString(1, "%" + hakusana + "%");
				stmtPrep.setString(2, "%" + hakusana + "%");
        		rs = stmtPrep.executeQuery();
				if(rs!=null){ //jos kysely onnistui
					con.close();
					while(rs.next()){
						Vene vene = new Vene();
						vene.setTunnus(rs.getInt(1));
						vene.setNimi(rs.getString(2));
						vene.setMerkkimalli(rs.getString(3));
						vene.setPituus(rs.getDouble(4));
						vene.setLeveys(rs.getDouble(5));
						vene.setHinta(rs.getInt(6));
						veneet.add(vene);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return veneet;
	}

	public Vene loytyykoVene(int tunnus){
		Vene vene = null;
		sql = "SELECT * FROM veneet WHERE tunnus=?";
		try {
			con=yhdista();
			if(con!=null){
				stmtPrep = con.prepareStatement(sql);
				stmtPrep.setInt(1, tunnus);
        		rs = stmtPrep.executeQuery();
        		if(rs.isBeforeFirst()){ //jos kysely tuotti dataa, eli rivi l�ytyi taulusta
        			rs.next();
        			vene = new Vene();
        			vene.setNimi(rs.getString(2));
        			vene.setMerkkimalli(rs.getString(3));
        			vene.setPituus(rs.getDouble(4));
        			vene.setLeveys(rs.getDouble(5));
        			vene.setHinta(rs.getInt(6));
        			con.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vene;
	}

	public boolean muutaVene(Vene vene){
		boolean paluuArvo=true;
		sql="UPDATE veneet SET nimi=?, merkkimalli=?, pituus=?, leveys=?, hinta=? WHERE tunnus=?";
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql);
			stmtPrep.setString(1, vene.getNimi());
			stmtPrep.setString(2, vene.getMerkkimalli());
			stmtPrep.setDouble(3, vene.getPituus());
			stmtPrep.setDouble(4, vene.getLeveys());
			stmtPrep.setInt(5, vene.getHinta());
			stmtPrep.setInt(6, vene.getTunnus());
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			paluuArvo=false;
		}
		return paluuArvo;
	}

	public boolean poistaVene(int tunnus){
		boolean paluuArvo=true;
		sql="DELETE FROM veneet WHERE tunnus=?";
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql);
			stmtPrep.setInt(1, tunnus);
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			paluuArvo=false;
		}
		return paluuArvo;
	}

	public String login(String uid, String pwd){
		String nimi=null;
		sql="SELECT Nimi FROM login WHERE uid=? AND pwd=?";
		try {
			con = yhdista();
			stmtPrep = con.prepareStatement(sql);
			stmtPrep.setString(1, uid);
			stmtPrep.setString(2, pwd);
    		rs = stmtPrep.executeQuery();
    		if(rs.isBeforeFirst()){ //jos kysely tuotti dataa, eli tunnus on k�yt�ss� ja salasana oikein
    			rs.next();
    			nimi=rs.getString("Nimi");
    			con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nimi;
	}

}
