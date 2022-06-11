public class CircularQueue {

}

class Queue {
    private int[] arr;
    private int rear;
    private int front;

    public Queue() {
        this.arr = new int[5];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 || front == rear;
    }

    public boolean isFull() {
        return front == (rear + 1) % arr.length;
    }

    public void enqueue(int data) {
        if (isFull())
            System.out.println("Queue is full");
        else {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;

            if (front == -1)
                front++;
        }
    }

    public void dequeue() {
        if (isEmpty())
            System.out.println("Queue is empty");
        else {
            if (rear == front)
                front = rear = -1;
            else {
                front = (front + 1) % arr.length;
            }
        }
    }
}