public class DoublyCircularLinkedList {
    static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private int nodeCount;

    public DoublyCircularLinkedList() {
        this.head = null;
        this.nodeCount = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getCount() {
        return this.nodeCount;
    }

    public void display() {
        if (isEmpty())
            System.out.println("List is Empty...!!!");
        else {
            Node trav = head;

            System.out.print("Element ==> ");

            do {
                System.out.print(trav.data + "==>");
                trav = trav.next;
            } while (trav != head);

            System.out.println("null");
        }
    }

    public void displayRev() {
        if (isEmpty())
            System.out.println("List is Empty...!!!");
        else {
            Node trav = head.prev;
            System.out.print("Element ==> ");

            do {
                System.out.print(trav.data + "==>");
                trav = trav.prev;
            } while (trav != head.prev);

            System.out.println("null");
        }
    }

    public void addNodeAtFirstPosition(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            nodeCount++;
        } else {
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
            nodeCount++;
        }
    }

    public void addNodeAtLastPosition(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            nodeCount++;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            nodeCount++;
        }
    }

    public void addNodeAtSpecificPosition(int data, int pos) {
        if (pos == 1)
            addNodeAtFirstPosition(data);
        else if (pos == getCount() + 1)
            addNodeAtLastPosition(data);
        else {
            Node newNode = new Node(data);
            int i = 1;
            Node trav = head;

            while (i < pos - 1) {
                i++;
                trav = trav.next;
            }

            newNode.next = trav.next;
            newNode.prev = trav;
            trav.next.prev = newNode;
            trav.next = newNode;
            nodeCount++;
        }
    }

    public void deleteNodeAtFirstPosition() {
        if (isEmpty())
            System.out.println("List is Empty...!!!");
        else {
            if (head == head.next) {
                head = null;
                nodeCount--;
            } else {
                head.next.prev = head.prev;
                head.prev.next = head.next;
                head = head.next;
                nodeCount--;
            }
        }
    }

    public void deleteNodeAtLastPosition() {
        if (isEmpty())
            System.out.println("List is Empty...!!!");
        else {
            if (head == head.next) {
                head = null;
                nodeCount--;
            } else {
                head.prev.prev.next = head;
                head.prev = head.prev.prev;
                nodeCount--;
            }
        }
    }

    public void deleteNodeAtSpecificPosition(int pos) {
        if (pos == 1)
            deleteNodeAtFirstPosition();
        else if (pos == getCount())
            deleteNodeAtLastPosition();
        else {
            int i = 1;
            Node trav = head;

            while (i < pos - 1) {
                i++;
                trav = trav.next;
            }

            trav.next.next.prev = trav;
            trav.next = trav.next.next;
            nodeCount--;
        }
    }
}
