package itsjava.first.lesson_1.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node {
    private Object value;
    private Node next;
}
