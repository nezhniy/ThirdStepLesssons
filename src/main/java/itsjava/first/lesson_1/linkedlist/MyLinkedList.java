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
//        Node curNode = head;
//        while (curNode.getNext() != null){
//            curNode = curNode.getNext();
//        }
//        curNode.setValue(null);
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        Node resNode = head;
        if (index == 0){
            return resNode;
        } else {
            int count = 0;
            while ((resNode = resNode.getNext()) != null) {
                count++;
                if (count == index){
                    break;
                }
            }
        }
        return resNode;
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node resNode = head;
        if (index == 0){
            resNode.setValue(element);
        } else {
            int count = 0;
            while ((resNode = resNode.getNext()) != null){
                count++;
                if (count == index){
                    break;
                }
            }
            resNode.setValue(element);
        }
        return resNode;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        checkIndex(index);
        //если удаляем первый элемент
        if (index == 0){
            //кладем значение первого элемента в resValue
            Object resValue = head.getValue();
            //если следующий за первым элемент null (одно звено в списке)
            if (head.getNext() == null) {
                //присваиваем null единственному элементу (список пуст)
                head = null;
            } else {
                //иначе головному звену присваиваем значение следующего
                head = head.getNext();
            }
            //возвращаем именно тот элемент, который мы удалили, потому что такой у нас метод (со слов преподавателя),
            // как значение head попадет в resValue, если последнему ничего не присваивается после объявления, я не понял
            return resValue;
        }
        //создаем 2 переменные, чтобы потом с ними шаманить и счетчик, чтобы не выйти за индекс удаляемого звена
        Node curNode = head;
        Node prevNode = head;
        int count = 0;
        //перебор по списку, пока одно из последующих звеньев не окажется null, увеличиваем значение счетчика на 1
        while ((curNode = curNode.getNext()) != null){
            count++;
            //когда наткнулись на нужный индекс, прерываем цикл
            if (count == index){
                break;
            }
            //пока не наткнемся на нужный индекс, вторая переменная принимает значение звена, следующего за ним,
            // чтобы в момент нахождения звена по индексу и выхода из цикла, остаться на 1 звено меньше первой переменной
            prevNode = prevNode.getNext();
        }
        //создаем новую переменную, куда кладем значение первого звена, найденного выше (я понимаю, что все не просто так, но зачем
        // создавать эту самую переменную я не понимаю, почему нельзя работать с curNode?)
        Object resValue = curNode.getValue();
        //если нужный нам индекс оказался крайним с конца, заменяем на null значение следующего за той самой второй переменной звена
        if (curNode.getNext() == null) {
            prevNode.setNext(null);
        //иначе кладем в следующее за второй переменной звено значение звена, следующего за первой переменной, а затем само это звено,
        // которое следует за первой переменной, делаем null (удаляем из списка)
        } else {
            prevNode.setNext(curNode.getNext());
            curNode.setNext(null);
        }
        //ситуация с возвращением переменной повторяется, почему именно ее - неясно
        return resValue;
    }

    private void checkIndex(int index) {
        if (!isCoorectIndex(index)){
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс!");
        }
    }

    private boolean isCoorectIndex(int index){
        if ((index > -1) && (index < realSize)){
            return true;
        } else {
            return false;
        }
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
