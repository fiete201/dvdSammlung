package fritz.jsp.dvdSammlung;
import fritz.jsp.dvdSammlung.Film;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sammlung
{
    private ArrayList<Film> filmsammlung = new ArrayList<Film>();
    private Connection cn;
    
    public Sammlung(){

    }

    public void connectToDatabase(){
		try {
		    Class.forName( "org.mariadb.jdbc.Driver" );
		    cn = DriverManager.getConnection( "jdbc:mariadb:@localhost:3306:dvd_sammlung", "java-01", "test1234" );
		}catch(SQLException e){
			System.out.println("SQLException: \n" + e);
		}catch(ClassNotFoundException e){
			System.out.println("ClassNotFoundException \n" + e);
		}
    }


    public ArrayList<Film> getAllFilms(){
	
		String query = "select * from Sammlung";
		try{
			Statement stmt = cn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String titel = rs.getString(1);
				short jahr = rs.getShort(2);
				String[] schauspieler = rs.getString(3).split(",");
				String[] genre = rs.getString(4).split(",");
				boolean isDVD = rs.getBoolean(5);
				filmsammlung.add(new Film(titel, jahr, schauspieler, genre, isDVD));
				}
				rs.close();
				stmt.close();
		} catch(SQLException e){
			System.out.println("SQLException: \n" + e);
		}
		return filmsammlung;
    }
}
