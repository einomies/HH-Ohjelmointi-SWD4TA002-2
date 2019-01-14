//Yksinkertaisin mahdollinen esimerkki tietokantayhteydest‰ mariaDB -tietokantaan.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MariaDBYhteys_a1505210 {
	public static void main(String[] args) {
    	Connection con = null;
    	ResultSet rs = null;
    	String JDBCAjuri = "org.mariadb.jdbc.Driver";
//    	mariadb.haaga-helia.fi:15001:3306
//    	String url = "jdbc:mariadb://localhost:15001/christian_brade";  //portti 3306 tai 15001
//    	String url = "jdbc:mariadb://localhost:3306/a1505210";  //portti 3306 tai 15001
    	String url = "jdbc:mariadb://localhost:15001/a1505210";  //portti 3306 tai 15001
    	try {
	         Class.forName(JDBCAjuri); // ajurin m‰‰ritys
	         // otetaan yhteys tietokantaan
//	         con = DriverManager.getConnection(url,"christian.brade", "miTIjn35w");
	         con = DriverManager.getConnection(url,"a1505210", "jaZIjt83v");
	         Statement stmt = con.createStatement();
//	         String SqlStr="SELECT * FROM autot";
	         String SqlStr="SELECT * FROM henkilot";
	         // ajetaan tietokantakysely
	         rs = stmt.executeQuery(SqlStr);
	         // k‰yd‰‰n kyselyn tulokset l‰pi rivi rivilt‰
	         while(rs.next()){
	        	 System.out.print(rs.getString(1)+"\t");
	        	 System.out.print(rs.getString(2)+"\t");
	        	 System.out.print(rs.getString(3)+"\t");
//	        	 System.out.print(rs.getString(4)+"\t");
//	        	 System.out.print(rs.getString(5)+"\t");
//	        	 System.out.print(rs.getString(6)+"\t");
	        	 System.out.println();
	         }
	     }catch (Exception e){
	        e.printStackTrace();
	     }
	}
}