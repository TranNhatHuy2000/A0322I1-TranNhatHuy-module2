package ss09_ArrayList_LinkedList.thuchanh.ArrayListClass;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(8);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
