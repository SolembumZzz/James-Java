import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E item) {
        if (this.size == elements.length)
            ensureCapacity();
        elements[size++] = item;
        return true;
    }

    public void add(int index, E item) {
        if (this.size == elements.length)
            ensureCapacity();
        if (index >= this.size) {
            add(item);
            return;
        }
        Object[] tempArray = Arrays.copyOf(elements, elements.length);
        tempArray[index] = item;
        for (int i = index + 1; i < elements.length; i++) {
            tempArray[i] = elements[i-1];
        }
        elements = Arrays.copyOf(tempArray,elements.length);
        size++;
    }

    public E remove(int index) {
        Object[] tempArray = Arrays.copyOf(elements,elements.length);
        E popStuff = (E) elements[index];
        System.arraycopy(tempArray, index+1 , elements, index, elements.length - (index + 1));
        size--;
        return popStuff;
    }

    public int getSize() {
        return size;
    }

//    public Object[] clone(){
//        Object[] tempArray = Arrays.copyOf(elements,elements.length);
//        return tempArray;
//    }

    public boolean contains(E element){
        boolean flag = false;
        for (Object e : elements) {
            if (e == element) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int indexOf(E element) {
        int j = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element)
                j = i;
        }
        return j;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null)
                elements[i] = null;
        }
        this.size = 0;
    }

    public MyList<E> clone() {
        MyList<E>  tempArr = new MyList<>();
        for (Object element : elements) {
            tempArr.add((E) element);
        }
        return tempArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
