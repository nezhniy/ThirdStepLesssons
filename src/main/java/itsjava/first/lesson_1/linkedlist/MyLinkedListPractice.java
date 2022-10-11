package itsjava.first.lesson_1.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("String 1");
        System.out.println(list);
        list.add("String 2");
        System.out.println(list);
        list.add("String 3");
        System.out.println(list);
        list.add("String 4");
        System.out.println(list);
        list.add("String 3");
        System.out.println(list);
        list.add("String 5");
        System.out.println(list);

//        list.add(null);
//        System.out.println(list);

//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
        System.out.println(list.contains("String 5"));

//        list.remove(2);
//        System.out.println(list);
        list.clear();
        System.out.println("After clear " + list);

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

//        list.set(0, "String 0");
//        list.set(1, "String 10");
//        list.set(2, "String 20");
//        System.out.println(list);

//        System.out.println(list.remove("String 1"));
//        System.out.println(list);

//        System.out.println("indexOf String 3 = " + list.indexOf("String 3"));
//        System.out.println(list.lastIndexOf("String 3"));

    }
}
