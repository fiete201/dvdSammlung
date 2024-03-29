package fritz.jsp.dvdSammlung;

public class Film
{

    private String titel;
    private short jahr;
    private String[] schauspieler;
    private String[] genre;
    private boolean isDVD;

    public Film (String titel, short jahr, String[] schauspieler, String[] genre, boolean isDVD){
	this.titel = titel;
	this.jahr = jahr;
	this.schauspieler = schauspieler;
	this.genre = genre;
	this.isDVD = isDVD;
    }

    public String getTitel(){
	return this.titel;
    }

    public short getJahr(){
	return this.jahr;
    }

    public String[] getSchauspieler(){
	return this.schauspieler;
    }

    public String[] getGenre(){
	return this.genre;
    }

    public boolean getIsDVD(){
	return this.isDVD;
    }
}
