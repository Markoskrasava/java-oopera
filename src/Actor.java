import java.util.Objects;

public class Actor extends Person {
    private double height;


    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.gender = gender;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Double.compare(height, actor.height) == 0 && name.equals(actor.name) && surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
