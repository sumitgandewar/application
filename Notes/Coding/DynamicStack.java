public class DynamicStack {

}

class Stack {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int nodeCount;

    public Stack() {
        this.head = null;
        this.nodeCount = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getCount() {
        return nodeCount;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            nodeCount++;
        } else {
            Node trav = head;

            while (trav.next != null) {
                trav = trav.next;
            }

            trav.next = newNode;
            nodeCount++;
        }
    }

    public void pop() {

        if (isEmpty()) {
            System.out.println("Stack underflow...!!!");
        } else {
            Node trav = head;

            while (trav.next.next != null) {
                trav = trav.next;
            }

            System.out.println("pop element :" + trav.next.data);
            trav.next = null;
            nodeCount--;
        }
    }

    public void peek() {
        Node trav = head;

        while (trav.next != null) {
            trav = trav.next;
        }

        System.out.println("peek element :" + trav.data);
    }
}
