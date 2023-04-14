import model.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<DANEPerson> people = new ArrayList<>();
        people.add(new DANEPerson("Andres", "Rodriguez",20,111));
        people.add(new DANEPerson("Jose", "Zapata",17,222));
        people.add(new DANEPerson("Alexandra", "Londoño",28,000));
        people.add(new DANEPerson("Veronica", "Andrade",40,444));

        Collections.sort(people);
        people.forEach(person -> {
            System.out.println(person.getName()+" "+person.getLastname());
        });
    }

}