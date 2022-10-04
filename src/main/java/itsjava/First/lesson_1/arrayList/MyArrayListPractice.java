package itsjava.First.lesson_1.arrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add("privet");
        list.add("poka");
        System.out.println(list.size());
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        list.add("poka");
        System.out.println(list.size());

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains("poka"));
        list.clear();
        System.out.println(list);
    }
}
