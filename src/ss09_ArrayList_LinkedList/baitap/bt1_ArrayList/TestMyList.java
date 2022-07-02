package ss09_ArrayList_LinkedList.baitap.bt1_ArrayList;

public class TestMyList {
    public static void main(String[] args) {
       MyList<Integer> ml = new MyList<Integer>();
       ml.add(2,2);
       ml.add(1);
       ml.add(1);
       ml.add(3);
       ml.add(4);
       ml.remove(3);
       ml.remove(0);
       int size = ml.size();
       System.out.println(size);
       System.out.println(ml);
       System.out.println(ml.get(1));
        System.out.println(ml.indexOf(4));
       //ml.clear();
       System.out.println(ml);
       ml.ensureCapacity(5);
        System.out.println(ml);

      Object nl = ml.clone();
      System.out.println("newlist :"+nl);


    }
}
