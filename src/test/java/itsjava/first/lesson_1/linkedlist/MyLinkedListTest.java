package itsjava.first.lesson_1.linkedlist;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
@DisplayName("Метод списка должен корректно")
public class MyLinkedListTest {

    public static final String ZERO = "Zero";
    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final int REALSIZE = 0;

    @DisplayName("определять, пустой ли список")
    @Test
    public void shouldHaveCorrectIsEmpty() {
        MyLinkedList list = new MyLinkedList();

        Assertions.assertEquals(true, list.isEmpty());
    }

    @DisplayName("добавлять элемент")
    @Test
    public void shouldHaveCorrectAdd() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(ONE, list.getValueOfElem(1));
    }

    @DisplayName("проверять наличие элемента")
    @Test
    public void shouldHaveCorrectContains() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(true, list.contains(ONE));
    }

    @DisplayName("удалять элемент")
    @Test
    public void shouldHaveCorrectRemoveElement() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(true, list.remove("One"));
    }

    @DisplayName("удалять элемент по индексу")
    @Test
    public void shouldHaveCorrectRemoveElementByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(ONE, list.remove(1));
    }

    @DisplayName("очищать массив")
    @Test
    public void shouldHaveCorrectClear() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);
        list.add(TWO);

        list.clear();

        Assertions.assertEquals(REALSIZE, list.size());
    }

    @DisplayName("получать и изменять элемент массива по индексу")
    @Test
    public void shouldHaveCorrectGetSet() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(ZERO, list.getValueOfElem(0));

        list.set(1, TWO);

        Assertions.assertEquals(TWO, list.getValueOfElem(1));
    }

    @DisplayName("получать индекс")
    @Test
    public void shouldHaveCorrectIndexOf() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);

        Assertions.assertEquals(1, list.indexOf("One"));
    }

    @DisplayName("получать последний индекс элемента")
    @Test
    public void shouldHaveCorrectLastIndexOf() {
        MyLinkedList list = new MyLinkedList();
        list.add(ZERO);
        list.add(ONE);
        list.add(ONE);

        Assertions.assertEquals(2, list.lastIndexOf("One"));
    }
}
