package Practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human(65,"Joseph", "Gleason", LocalDate.of(2002, 9,10),50));
        list.add(new Human(55,"Mattew", "Zenchennko", LocalDate.of(2055, 8,11),51));
        list.add(new Human(5,"Helen", "Zenchennko", LocalDate.of(1994, 7,12),52));
        list.add(new Human(13,"Vladimir", "Zenchennko", LocalDate.of(2000, 6,13),53));
        list.add(new Human(44,"Andrew", "Kazancev", LocalDate.of(1980, 5,14),54));
        list.add(new Human(6,"Kimberly", "Kazancev", LocalDate.of(1950, 4,15),55));
        list.add(new Human(23,"Kate", "Johnson", LocalDate.of(1980, 3,16),56));
        list.add(new Human(15,"Ann", "Johnson", LocalDate.of(2008, 2,17),57));

        list.stream().filter(human -> human.age < 20).sorted((a,b) -> {
            char c1 = a.firstName.charAt(a.firstName.length()-1), c2 = b.firstName.charAt(b.firstName.length()-1);
            return Character.compare(c1, c2);
        }).forEach((a)->{
            a.setAge(a.getAge()+3);
            System.out.println(a);
        });

        System.out.println(list.stream().mapToInt(Human::getAge).average());

    }
}
