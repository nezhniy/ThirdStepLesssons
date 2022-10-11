package itsjava.first.lesson_2.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Man andrey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man viktor = new Man("Viktor");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, viktor));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));
        System.out.println(manSet);

        Man andrey2 = new Man("Andrey");

        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));
        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));

        //HW

        Fruit apple = new Fruit("Apple", 100);
        Fruit banana = new Fruit("Banana", 80);
        Fruit peach = new Fruit("Peach", 120);
        Fruit apricot = new Fruit("Apricot", 610);

        Set<Fruit> fruits = new HashSet<>(Arrays.asList(apple, banana, peach));

        fruits.add(apricot);
        fruits.add(apricot);
        fruits.remove(apricot);
        System.out.println("fruits = " + fruits);
    }
}
