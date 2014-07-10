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

	String ttitel = "StarWars Epoisode 3";
	short tjahr = 2004;
	String[] tschauspieler = {"Ewan McGregor", "Hayden Christensen"};
	String[] tgenre = {"Action", "SciFi"};
	boolean tisDVD = true;

	filmsammlung.add(new Film(ttitel, tjahr, tschauspieler, tgenre, tisDVD));

	String ttitel2 = "Die Bourne Identität";
	short tjahr2 = 2002;
	String[] tschauspieler2 = {"Matt Damon", "Franka Potente"};
	String tgenre2[] = {"Thriller","Action"};
	boolean tisDVD2 = true;

	filmsammlung.add(new Film(ttitel2, tjahr2, tschauspieler2, tgenre2, tisDVD2));

	return filmsammlung;
    }
}
