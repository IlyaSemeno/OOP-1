import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020,03,20), new Illness("Лишай"));
        System.out.println(cat.getName());
        Animal animal = new Animal();
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        Animal dog = new Dog("Шарик", LocalDate.of(2021, 04,15), new Illness("Лишай"));
        System.out.println(dog.getType());
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Яша", LocalDate.of(2020,07,10), new Illness("Лишай"), 2));
        System.out.println(list);
        dog.lifeCycle();
        System.out.println("Домашнее задание: ");
        Animal goldfish = new Goldfish("Грек", LocalDate.of(2022,01,10), new Illness("аэромоноз"));
        Animal bird = new Bird("Гриша", LocalDate.of(2021,06,11), new Illness("Лишай"), 2);
        goldfish.fishActions();
        bird.beardActions();
        dog.overlandActions();
        goldfish.overlandActions();




    }
}
