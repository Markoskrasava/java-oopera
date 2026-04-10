import java.util.ArrayList;

public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;


    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, String librettoText, Person musicAuthor) {
        super(title, duration, director, listOfActors);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }


}
