package itsjava.first.lesson_1.arrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {
//        MyArrayList list = new MyArrayList();
//        System.out.println(list.size());
//        list.add("privet");
//        list.add("poka");
//        System.out.println(list.size());
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        System.out.println(list.size());
//
//        System.out.println(list);
//        System.out.println(list.isEmpty());
//        System.out.println(list.contains("poka"));
////        list.clear();
////        System.out.println(list);
//        list.remove("privet");
//        System.out.println(list);
//
//        list.add("bye");
//        System.out.println(list);
//        list.remove(10);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");
        list.add("elem4");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");

//        list.remove(1);
//        System.out.println(list);
//
        list.remove(0);
        System.out.println(list);
//        list.remove("elem1");
//        list.remove("elem3");
//        System.out.println(list);

        System.out.println(list.indexOf("poka"));
        System.out.println(list.indexOf("ppp"));

        System.out.println(list.lastIndexOf("poka"));

        System.out.println(list.get(0));

        list.set(0, "asdf");
        System.out.println(list);

        list.add(2, "ooo");
        System.out.println(list);

        System.out.println(list.isEmpty());

        list.clear();
        System.out.println(list.size());
    }
}
