//Yksinkertaisin mahdollinen esimerkki tietokantayhteydest‰ mariaDB -tietokantaan.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EsimerkkiYhteysMariaDB {	
	public static void main(String[] args) {
    	Connection con = null; 
    	ResultSet rs = null;
    	String JDBCAjuri = "org.mariadb.jdbc.Driver";
    	String url = "jdbc:mariadb://localhost:15001/christian_brade";  //portti 3306 tai 15001   	
    	try {
	         Class.forName(JDBCAjuri); // ajurin m‰‰ritys	        	    	 
	         // otetaan yhteys tietokantaan
	         con = DriverManager.getConnection(url,"christian.brade", "miTIjn35w");	 
	         Statement stmt = con.createStatement();
	         String SqlStr="SELECT * FROM Veneet";
	         // ajetaan tietokantakysely
	         rs = stmt.executeQuery(SqlStr);
	         // k‰yd‰‰n kyselyn tulokset l‰pi rivi rivilt‰
	         while(rs.next()){
	        	 System.out.print(rs.getString(1)+"\t");        
	        	 System.out.print(rs.getString(2)+"\t");     
	        	 System.out.print(rs.getString(3)+"\t");      
	        	 System.out.print(rs.getString(4)+"\t");   
	        	 System.out.print(rs.getString(5)+"\t"); 
	        	 System.out.print(rs.getString(6)+"\t"); 
	        	 System.out.println();
	         }  	          
	     }catch (Exception e){
	        e.printStackTrace();	        	         
	     }	    
	}	
}