package itsjava.first.lesson_1.arraylist;

import itsjava.first.lesson_1.arrayList.MyArrayList;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@RequiredArgsConstructor
@DisplayName("Метод списка должен корректно")
public class MyArrayListTest {

    public static final String ZERO = "Zero";
    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final int REALSIZE = 0;

    @DisplayName("определять, пустой ли список")
    @Test
    public void shouldHaveCorrectIsEmpty(){
        MyArrayList list = new MyArrayList();

        Assertions.assertEquals(true, list.isEmpty());
    }

    @DisplayName("добавлять элемент")
    @Test
    public void shouldHaveCorrectAdd(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);

        Assertions.assertEquals(ZERO, list.get(0));
    }

    //см комментарий в классе MyArrayListPractice
//    @DisplayName("добавлять элемент по индексу")
//    @Test
//    public void shouldHaveCorrectAddByIndex(){
//        MyArrayList list = new MyArrayList();
//        list.add(1, ONE);
//
//        Assertions.assertEquals(ONE, list.get(1));
//    }

    @DisplayName("проверять наличие элемента")
    @Test
    public void shouldHaveCorrectContains(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(true, list.contains("One"));
    }

    @DisplayName("удалять элемент")
    @Test
    public void shouldHaveCorrectRemoveElement(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(true, list.remove("One"));
    }

    @DisplayName("удалять элемент по индексу")
    @Test
    public void shouldHaveCorrectRemoveElementByIndex(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(ONE, list.remove(1));
    }

    @DisplayName("очищать массив")
    @Test
    public void shouldHaveCorrectClear(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);
        list.add(TWO);

        list.clear();

        Assertions.assertEquals(REALSIZE, list.size());
    }

    @DisplayName("получать и изменять элемент массива по индексу")
    @Test
    public void shouldHaveCorrectGetSet(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(ZERO, list.get(0));

        list.set(1, TWO);

        Assertions.assertEquals(TWO, list.get(1));
    }

    @DisplayName("получать индекс")
    @Test
    public void shouldHaveCorrectIndexOf(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(1, list.indexOf("One"));
    }

    @DisplayName("получать последний индекс элемента")
    @Test
    public void shouldHaveCorrectLastIndexOf(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);
        list.add(ONE);

        Assertions.assertEquals(2, list.lastIndexOf("One"));
    }

    @DisplayName("выводить массив")
    @Test
    public void shouldHaveCorrectToString(){
        MyArrayList list = new MyArrayList();
        list.add(ZERO);
        list.add(ONE);
        list.add(TWO);

        Assertions.assertEquals("MyArrayList { Zero One Two }", list.toString());
    }
}
