package ss09_ArrayList_LinkedList.baitap.bt2_LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> ml = new MyLinkedList<>();
        ml.addFirst(1);
        ml.addFirst(2);
        ml.addFirst(3);
        ml.addFirst(4);
        ml.printList();

        System.out.println();

        ml.addLast(7);
        ml.add(2,2);
        ml.printList();

        System.out.println();
        ml.remove(4);
        ml.printList();

        System.out.println();
        System.out.print(ml.getFirst());

        System.out.println();
        ml.clear();
        ml.addFirst(0);
      //  System.out.println(ml.size());
        ml.printList();
    }
}
