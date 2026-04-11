import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor ivanov = new Actor("Иван", "Иванов", Gender.MALE, 188.5);
        Actor petrov = new Actor("Пётр", "Петров", Gender.MALE, 205);
        Actor sidorov = new Actor("Сидр", "Сидоров", Gender.MALE, 157);

        Director kotova = new Director("Валерия", "Котова", Gender.FEMALE, 52);
        Director sobakova = new Director("Екатерина", "Собакова", Gender.FEMALE, 6);

        Person musicAuthor = new Person("Валентин", "Иванов", Gender.MALE);
        Person choreographer = new Person("Григорий", "Григорьев", Gender.MALE);

        ArrayList<Actor> musicalShowActors = new ArrayList<>();
        MusicalShow musicalShow = new MusicalShow("Название спектакля", 100, kotova, musicalShowActors, "Какой-то текст для спектакля", musicAuthor);

        ArrayList<Actor> operaActors = new ArrayList<>();
        Opera opera = new Opera("Какая-то опера", 180, sobakova, operaActors, "Какой-то текст для оперы", musicAuthor, 10);

        ArrayList<Actor> balletActors = new ArrayList<>();
        Ballet ballet = new Ballet("Какой-то балет", 49, kotova, balletActors, "Какой-то текст для балета",musicAuthor, choreographer);

        musicalShow.setListOfActors(ivanov);
        musicalShow.setListOfActors(sidorov);

        opera.setListOfActors(ivanov);
        opera.setListOfActors(petrov);

        ballet.setListOfActors(ivanov);
        ballet.setListOfActors(petrov);
        ballet.setListOfActors(sidorov);

        musicalShow.getListOfActors();
        opera.getListOfActors();
        ballet.getListOfActors();

        musicalShow.replaceActor(petrov, "Иванов");
        musicalShow.getListOfActors();

        opera.replaceActor(sidorov, "Сидоров");

        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());

    }
}
