import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, String librettoText, Person musicAuthor, Person choreographer) {
        super(title, duration, director, listOfActors, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }


}
