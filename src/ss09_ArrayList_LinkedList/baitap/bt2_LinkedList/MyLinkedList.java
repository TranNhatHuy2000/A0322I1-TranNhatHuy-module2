package ss09_ArrayList_LinkedList.baitap.bt2_LinkedList;

public class MyLinkedList<E> {

    private class Node {
        private Node next;
        private Object data;

        public Node (Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList(){}

    /*add*/
    public void add(int index,E element){
        Node tempt = head;
        Node holder;
        for (int i = 0; i < index-1 && tempt.next != null; i++){
            tempt = tempt.next;
        }
        holder = tempt.next;
        tempt.next = new Node(element);
        tempt.next.next = holder;
        numNodes++;
    }

    /*addFirst*/
    public void addFirst(E element){
        Node tempt = head;
        head = new Node(element);
        head.next = tempt;
        numNodes++;
    }

    /*addLast*/
    public void addLast(E element){
        Node tempt = head;
        while (tempt.next !=null){
            tempt = tempt.next;
        }
        tempt.next = new Node(element);
        numNodes++;
    }

    /*remove(index)*/
    public E remove(int index){
        if (index < 0 || index > numNodes ){
            throw new IndexOutOfBoundsException();
        }
        Node tempt = head;
        Object data;
        if (index == 0){
            data = tempt.data;
            head = tempt.next;
        }else {
            for (int i = 0; i < index-1 && tempt.next !=null ;i++){
                tempt = tempt.next;
            }
            data = tempt.next.data;
            tempt.next =tempt.next.next;
        }
        numNodes--;
        return (E) data;
    }

    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node tempt = head;
            while (tempt.next != null){
                if (tempt.next.data.equals(element)){
                    tempt.next = tempt.next.next;
                    numNodes--;
                    return true;
                }
                tempt = tempt.next;
            }
            return false;
        }
    }

    /*size*/
    public int size(){
        return numNodes;
    }

    /*clone*/
    public MyLinkedList<E> clone(){
        if (numNodes == 0){
            throw new NullPointerException();
        }
        MyLinkedList<E> tempt = new MyLinkedList<E>();
        Node temptNode = head;
        tempt.addFirst((E) temptNode.data);
        temptNode = temptNode.next;
        while (temptNode.next != null){
            tempt.addLast((E) temptNode.data);
            temptNode = temptNode.next;
        }
        return tempt;
    }

    /*contains*/
    public boolean contains(E element){
        Node tempt = head;
        while (tempt.next !=  null){
            if (tempt.data.equals(element)){
                return true;
            }
            tempt = tempt.next;
        }if (tempt.data.equals(element)){
            return true;
        }
        return false;
    }

    /*indexOf*/
    public int indexOf(E element){
        Node tempt = head;
        for (int i= 0; i < numNodes;i++){
            if (tempt.getData().equals(element)){
                return i;
            }
            tempt = tempt.next;
        }
        return -1;
    }

    /*ensureCapacity*/
    public void ensureCapacity(int minCapacity){
        numNodes = minCapacity;
    }

    /*get*/
    public Object get (int index){
        Node tempt = head;
        for (int i = 0; i <  index;i++){
            tempt = tempt.next;
        }
        return tempt.data;
    }

    /*getFirst*/
    public Object getFirst(){
        return head.getData();
    }

    /*getLast*/
    public Object getLast(){
        Node temp = head;
        for(int i = 0; i < numNodes; i++){
            temp = temp.next;
        }
        return temp.getData();
    }

    /*clear*/
    public void clear(){
        head = null;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }



}
