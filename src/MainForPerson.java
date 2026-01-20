import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class MainForPerson {
    public static void main(String[]args) {
        Person[] pp = new Person[10];
        pp[0] = new Person("Naruto Uzumaki", 14);
        pp[1] = new Person("Knight Hollow", 3);

        ArrayList<Person> p1 = new ArrayList<>();
        p1.add(pp[0]);
        p1.add(pp[1]);
        p1.add(new Person("Song Silk", 1));

        System.out.println(p1.get(2));
        // koska tämä filu ja person filu on samassa kansiossa ei tarvitse käyttää importia

        Person person = new Person("Miku Hatsune", 16);
        person.getOlder();

        System.out.println(person.getName());

        System.out.println(person.toString());
    }

}
