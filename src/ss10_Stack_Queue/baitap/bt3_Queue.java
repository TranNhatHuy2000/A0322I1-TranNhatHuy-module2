package ss10_Stack_Queue.baitap;

public class bt3_Queue {
    public static class Node{
        int data;
        Node link;
    }

    public static class Queue {
        Node front;
        Node rear;
    }

    public static void enQueue(Queue q,int value){
        Node tempt = new Node();
        tempt.data = value;
        if (q.front == null){
            q.front = tempt;
        }else {
            q.rear.link =tempt;
        }
        q.rear = tempt;
        q.rear.link =q.front;
    }

    public static int deQueue(Queue q){
        if (q.front == null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear){
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q){
        Node temp = q.front;
        System.out.println("Queue:");
        while (temp.link != q.front){
            System.out.print(" "+temp.data);
            temp =temp.link;
        }
        System.out.println(" "+temp.data);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front =queue.rear=null;
        enQueue(queue,14);
        enQueue(queue,22);
        enQueue(queue,6);

        displayQueue(queue);
        System.out.println("delete value = "+deQueue(queue));
        System.out.println("delete value = "+deQueue(queue));
        enQueue(queue, 9);
        enQueue(queue, 20);
        displayQueue(queue);
    }
}
