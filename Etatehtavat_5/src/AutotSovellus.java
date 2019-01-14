import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AutotSovellus {
	private Lukija lukija = new Lukija();
	private Connection con=null;
	private ResultSet rs = null;
	private PreparedStatement stmtPrep=null;
	private String sql;

	public AutotSovellus(){
		naytaValikko();
	}

	private void naytaValikko() {
		System.out.println("1. Näytä kaikki autot");
		System.out.println("2. Lisää auto");
		System.out.println("3. Muuta auto");
		System.out.println("4. Poista auto");
		System.out.println("0. Lopeta");
		switch (lukija.lueKokonaisluku("Valintasi: ")) {
		case 1:
			listaaAutot();
			break;
		case 2:
			lisaaAuto();
			break;
		case 3:
			muutaAuto();
			break;
		case 4:
			poistaAuto();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("Väärä valinta!");
			break;
		}
		naytaValikko();
	}

	private void listaaAutot(){
		sql = "SELECT * FROM autot";
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);        
        		rs = stmtPrep.executeQuery();
				if(rs!=null){ //jos kysely onnistui
					con.close();
					System.out.println();
					while(rs.next()){
						System.out.print(rs.getString(1) +"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getString(3)+"\t");
						System.out.println();
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void lisaaAuto() {
		String rekno = lukija.lueTeksti("Anna uuden auton rekno: ");
		String merkki = lukija.lueTeksti("Anna uuden auton merkki: ");
		String malli = lukija.lueTeksti("Anna uuden auton malli: ");
		int vuosi = lukija.lueKokonaisluku("Anna uuden auton vuosi: ");
		if(merkki.length()>1 && malli.length()>1){
			sql="INSERT INTO autot VALUES(?,?,?,?)";
			try {
				con = yhdista();
				stmtPrep=con.prepareStatement(sql);
				stmtPrep.setString(1, rekno);
				stmtPrep.setString(2, merkki);
				stmtPrep.setString(3, malli);
				stmtPrep.setInt(4, vuosi);
				stmtPrep.executeUpdate();
		        con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void muutaAuto() {
		listaaAutot();
		String rekno = lukija.lueTeksti("Anna muutettavan auton rekno: ");
		sql = "SELECT * FROM autot WHERE rekno=?";
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);
				stmtPrep.setString(1, rekno);
        		rs = stmtPrep.executeQuery();
        		if(rs.isBeforeFirst()){ //jos kysely tuotti dataa, eli rekno on käytössä
        			String merkki = lukija.lueTeksti("Anna auton uusi merkki: ");
        			String malli = lukija.lueTeksti("Anna auton uusi malli: ");
        			int vuosi = lukija.lueKokonaisluku("Anna auton uusi vuosi: ");
        			if(merkki.length()>1 && malli.length()>1){
        				sql="UPDATE autot SET merkki=?, malli=?, vuosi=? WHERE rekno=?";	        
    					stmtPrep=con.prepareStatement(sql);
    					stmtPrep.setString(1, merkki);
    					stmtPrep.setString(2, malli);
    					stmtPrep.setInt(3, vuosi);
    					stmtPrep.setString(4, rekno);
    					stmtPrep.executeUpdate();
        			}
        			con.close();
        			listaaAutot();
				}else{
					System.out.println("Antamasi rekno ei ole käytössä!\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void poistaAuto() {
		listaaAutot();
		String rekno = lukija.lueTeksti("Anna poistettavan auton rekno: ");
		sql = "SELECT * FROM autot WHERE rekno=?";
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);
				stmtPrep.setString(1, rekno);
        		rs = stmtPrep.executeQuery();
        		if(rs.isBeforeFirst()){ //jos kysely tuotti dataa, eli rekno on käytössä
        			rs.next(); //siirrytään 1. tietueriville
        			if(lukija.lueTeksti("Haluatko varmasti poistaa auton "
        					+rs.getString("rekno")
        					+" " 
        					+rs.getString("merkki")
        					+" " 
        					+rs.getString("malli")
        					+" " 
        					+rs.getInt("vuosi")
        					+" (k/e): ").equalsIgnoreCase("k")){
        				sql="DELETE FROM autot WHERE rekno=?";
    					stmtPrep=con.prepareStatement(sql);
    					stmtPrep.setString(1, rekno);
    					stmtPrep.executeUpdate();
        			}
        			con.close();
        			listaaAutot();
				}else{
					System.out.println("Antamasi rekno ei ole käytössä!\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Connection yhdista(){
    	Connection tietokantayhteys = null;
    	String JDBCAjuri = "org.mariadb.jdbc.Driver";
    	String url = "jdbc:mariadb://localhost:15001/a1505210";
    	try {
	         Class.forName(JDBCAjuri);
	         tietokantayhteys = DriverManager.getConnection(url,"a1505210", "jaZIjt83v");
	     }catch (Exception e){
	    	 e.printStackTrace();
	     }
	     return tietokantayhteys;
	}

	public static void main(String[] args) {
		new AutotSovellus();
    }
}
