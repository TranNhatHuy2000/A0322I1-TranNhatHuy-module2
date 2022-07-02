package ss09_ArrayList_LinkedList.baitap.bt1_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private void ensureCape(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int index, E element){
        if(size == elements.length){
            ensureCape();
        }
        for(int i =elements.length-1; i> index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }

    public void remove (int index){
        if( index<0  || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        for(int i = index;i < elements.length-1;i++){
            elements[i] = elements[i+1];
        }
        elements[elements.length-1] = null;
        size--;
    }

    public int size(){
        return this.size;
    }

    public Object clone(){
        return this;
    }


    public boolean contains(E o){
        boolean flag = false;
        for(int i =0;i < elements.length;i++){
            if(elements[i] == o){
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        return flag;
    }

    public int indexOf(E o){
        int index = -1 ;
        for(int i =0;i < size; i++){
            if(elements[i].equals(o)){
                index = i;
                break;
            }
        }
        return  index;
    }

    public void add(E element){
        if (size == elements.length){
            ensureCape();
        }
        elements[size++] = element ;
    }

    public void ensureCapacity (int minCapaciy){
        elements = Arrays.copyOf(elements,minCapaciy);

    }

    public void clear(){
        for (int i = 0; i < elements.length;i++){
            elements[i] = null;
        }
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
