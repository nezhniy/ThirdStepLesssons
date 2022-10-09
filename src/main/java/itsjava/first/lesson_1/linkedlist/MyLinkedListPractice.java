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

        list.add(null);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list.contains("String 1"));
    }
}
