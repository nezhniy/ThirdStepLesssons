package itsjava.first.lesson_2.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man javov = new Man("Javov");

        men.put(ivanov, "T-shirt");
        men.put(sidorov, "sweatshirt");
        men.put(javov, "sweater");

        for (Map.Entry<Man, String> pair: men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();
        for (Man keyMan: men.keySet()) {
            System.out.println(keyMan + ": " + men.get(keyMan));
        }

        men.remove(ivanov);

        System.out.println("after delete ivanov");
        for (Man keyMan: men.keySet()) {
            System.out.println(keyMan + ": " + men.get(keyMan));
        }

        System.out.println("men.size() = " + men.size());
        System.out.println("men.isEmpty() = " + men.isEmpty());

        men.replace(javov, "sweater", "pants");
        System.out.println("men.get(javov) = " + men.get(javov));

        men.clear();
        System.out.println("men.size() = " + men.size());

        //HW

        Fruit apple = new  Fruit("Apple", 100);
        Fruit banana = new Fruit("Banana", 80);
        Fruit peach = new  Fruit("Peach", 120);
        Fruit apricot = new Fruit("Apricot", 610);
        Fruit kiwi = new Fruit("Kiwi", 610);
        Fruit melon = new Fruit("Melon", 610);

        Client andrew = new Client("Andrew");
        Client misha = new Client("Misha");
        Client borya = new Client("Borya");
        Client tolya = new Client("Tolya");
        Client kolya = new Client("Kolya");
        Client alexander = new Client("Alexander");

        Map<Client, Fruit> market1 = new HashMap<>();

        market1.put(andrew, apple);
        market1.put(misha, banana);
        market1.put(borya, peach);
        market1.put(tolya, apricot);
        market1.put(kolya, apple);
        market1.put(alexander, kiwi);

        Map<Client, Fruit> market = new HashMap<>();

        market.putAll(market1);

        System.out.println("market.get(andrew).getName() = " + market.get(andrew).getName());

//        market.remove(tolya);
//        System.out.println(market.toString());

        System.out.println(market.containsValue(banana));
        System.out.println(market.containsValue(melon));

        for (Client keyClient: market.keySet()) {
            System.out.println(keyClient);
        }

        for (Client keyClient: market.keySet()) {
            System.out.println(market.get(keyClient).getName());
        }

        for (Map.Entry<Client, Fruit> prod: market.entrySet()) {
            System.out.println(prod.getKey() + ": " + prod.getValue());
        }

        //HW 2.5
        //6
        int count = 0;
        for (Client keyClient: market.keySet()) {
            if (keyClient.getName().length() > 5){
                count++;
            }
        }
        System.out.println("name length more then 5: " + count);

        count = 0;
        for (Fruit valueFruit: market.values()) {
            if (valueFruit.equals(banana)){
                count++;
            }
        }
        System.out.println("has banana: " + count);

        //7
        count = 0;
        for (Map.Entry<Client, Fruit> pair: market.entrySet()) {
            if (pair.getValue().getName().equals("Apple") && count != 2){
                count++;
                continue;
            }
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();
        count = 0;
        for (Map.Entry<Client, Fruit> pair: market.entrySet()) {
            if (pair.getKey().getName().startsWith("A") && count != 2){
                count++;
                continue;
            }
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        //8
        System.out.println();
        for (Map.Entry<Client, Fruit> pair: market.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("apple")){
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }

        //9
        System.out.println();
        Map<Client, Fruit> market2 = new HashMap<>();
        for (Map.Entry<Client, Fruit> pair: market.entrySet()) {
            if (pair.getValue().getName().equals("Apple") || pair.getValue().getName().equals("Apricot")){
                market2.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println(market2.toString());

        //10
        count = 0;
        int sum = 0;
        for (Map.Entry<Client, Fruit> pair: market.entrySet()) {
            count++;
            int weightOfFruit = pair.getValue().getWeight();
            sum = sum + weightOfFruit;
        }
        System.out.println(sum/count);
    }
}
