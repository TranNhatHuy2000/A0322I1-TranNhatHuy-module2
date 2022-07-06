package ss10_Stack_Queue.thuchanh.thuchanh3_StackQueue;

public class MyQueue {
    int capacity ;
    int [] queueArr;
    int head =0;
    int tail =-1;
    int currentSize;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }

    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("overflow! unable to addd element: "+item);
        }else {
            tail ++;
            if (tail == capacity -1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue");
        }else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
