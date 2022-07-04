package ss10_Stack_Queue.thuchanh.thuchanh2_Queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
        Node tempt = new Node(key);
        if (this.tail == null){
            this.head = this.tail = tempt;
        }else {
            this.tail.next = tempt;
            this.tail =tempt;
        }
    }

    public Node dequeue(){
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

}
