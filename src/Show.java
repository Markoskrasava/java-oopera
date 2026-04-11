import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    public void getListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void setListOfActors(Actor newActor) {
        if (!listOfActors.isEmpty()) {
        for (Actor actor : listOfActors) {
            if (newActor.equals(actor)) {
                System.out.println("Такой актёр уже существует");
                return;
            }
            if (newActor.hashCode() == actor.hashCode()) {
                System.out.println("Такой актёр уже существует");
                return;
            }
        }
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (surname.equals(listOfActors.get(i).getSurname())) {
                listOfActors.remove(listOfActors.get(i));
                listOfActors.add(newActor);
                return;
            }
        }
        System.out.println("Актёра с фамилией " + surname + " нету в списке");
    }
}

