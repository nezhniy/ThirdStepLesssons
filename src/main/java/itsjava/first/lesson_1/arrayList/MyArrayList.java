package itsjava.first.lesson_1.arrayList;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize > 0){
            return false;
        }else {
            return true;
        }
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == o){
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3/2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)){
                delIndex = i;
                break;
            }
        }
        for (int i = delIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        if (delIndex == -1){
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

    public Object get(int index) {
        Object obj = array[index];
        return obj;
    }

    public Object set(int index, Object element) {
        array[index] = element;
        Object obj = array[index];
        return obj;
    }

    public void add(int index, Object element) {
        if (realSize == array.length){
            Object[] resArray = new Object[array.length + 1];
            resArray[index] = element;
            for (int i = 0; i < index; i++) {
                resArray[i] = array[i];
            }
            for (int i = index; i < array.length; i++) {
                resArray[i + 1] = array[i];
            }
            array = resArray;
        }
    }

    public Object remove(int index) {
        checkIndex(index);
        Object resElement = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        realSize--;
        return resElement;
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
            for (int i = 0; i < realSize; i++) {
                if (array[i].equals(o)) {
                    return i;
                }
            }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = realSize; i >= 0; i--) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList { ");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public Object[] getArray(){
        return array;
    }
}
