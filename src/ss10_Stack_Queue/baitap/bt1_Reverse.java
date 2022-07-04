package ss10_Stack_Queue.baitap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
public class bt1_Reverse {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0;i < 10;i++){
            numbers.push(i);
        }
        System.out.println(numbers);
        List<Integer> revers = new ArrayList<Integer>();
        for ( int i =0;i <10;i++ )
            revers.add(numbers.pop());

        System.out.println(revers);
    }

}
