package itsjava.first.lesson_1.linkedlist;

public class MyLinkedList {
    private Node head;
    private int realSize = 0;

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (head.getValue() == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Object o) {
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getValue().equals(o)) {
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null){
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        if (o != null) {
            realSize++;
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
