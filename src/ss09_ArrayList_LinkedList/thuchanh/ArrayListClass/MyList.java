package ss09_ArrayList_LinkedList.thuchanh.ArrayListClass;

import java.util.Arrays;

public class MyList<E> {
    private  int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCape(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E e){
        if (size == elements.length){
            ensureCape();
        }
        elements[size++] = e ;
    }

    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
