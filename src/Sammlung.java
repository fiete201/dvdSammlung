package fritz.jsp.dvdSammlung;
import fritz.jsp.dvdSammlung.Film;
import java.util.ArrayList;

public class Sammlung
{
    public Sammlung(){

    }

    public ArrayList<Film> getAllFilms(){

	ArrayList<Film> list = new ArrayList();

	String ttitel = "StarWars Epoisode 3";
	int tjahr = 2004;
	String[] tschauspieler = {new String("Ewan McGregor"), new String("Hayden Christensen")};
	String[] tgenre = {"Action", "SciFi"};
	boolean tisDVD = true;

	list.add(new Film(ttitel, tjahr, tschauspieler, tgenre, tisDVD));

	ttitel = "Die Bourne Identität";
	tjahr = 2002;
	tschauspieler = new String[5];
	tschauspieler[0] = new String("Matt Damon");
	tschauspieler[1] = new String("Franka Potente");
	tgenre[0] = new String("Thriller");
	tgenre[1] = new String("Action");
	tisDVD = true;

	list.add(new Film(ttitel, tjahr, tschauspieler, tgenre, tisDVD));

	return list;
    }
}
