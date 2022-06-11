public class SinglyCircularLinkedList {
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

    public SinglyCircularLinkedList() {
        this.head = null;
        this.nodeCount = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getCount() {
        return nodeCount;
    }

    public void display() {
        if (isEmpty())
            System.out.println("List is Empty...!!!");
        else {
            Node trav = head;
            System.out.print("Element ==> ");

            while (trav != null) {
                System.out.printf("%4d", trav.data);
            }

            System.out.print("%4null");
        }
    }

    public void displayListInReverseOrder() {
        System.out.print("Element elements of list ==> ");
        reverseOrder(head);
        System.out.println();
    }

    public void reverseOrder(Node trav) {
        if (trav == null)
            return;

        reverseOrder(trav.next);
        System.out.printf("%4d", trav.data);
    }

    public void addNodeAtFirstPosition(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
            nodeCount++;
        } else {
            Node trav = head;

            while (trav.next != head) {
                trav = trav.next;
            }

            newNode.next = head;
            head = newNode;
            trav.next = newNode;
            nodeCount++;
        }
    }

    public void addNodeAtLastPosition(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
            nodeCount++;
        } else {
            Node trav = head;

            while (trav.next != head) {
                trav = trav.next;
            }

            newNode.next = trav.next;
            trav.next = newNode;
            nodeCount++;
        }
    }

    public void addNodeAtSpecificPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            addNodeAtFirstPosition(data);
        } else if (pos == getCount() - 1) {
            addNodeAtLastPosition(data);
        } else {
            Node trav = head;
            int i = 1;

            while (i < pos - 1) {
                i++;
                trav = trav.next;
            }

            newNode.next = trav.next;
            trav.next = newNode;
            nodeCount++;
        }
    }

    public void deleteNodeAtFirstPosition() {

        if (isEmpty()) {
            System.out.println("List is Empty...!!!");
        } else {
            Node trav = head;

            while (trav.next != head) {
                trav = trav.next;
            }

            trav.next = head.next;
            head = head.next;
            nodeCount--;
        }
    }

    public void deleteNodeAtLastPosition() {

        if (isEmpty()) {
            System.out.println("List is Empty...!!!");
        } else {
            Node trav = head;

            while (trav.next.next != head) {
                trav = trav.next;
            }

            trav.next = head;
            nodeCount--;
        }
    }

    public void deleteNodeAtSpecificPosition(int pos) {

        if (pos == 1) {
            deleteNodeAtFirstPosition();
        } else if (pos == getCount()) {
            deleteNodeAtLastPosition();
        } else {
            Node trav = head;
            int i = 1;

            while (i < pos - 1) {
                i++;
                trav = trav.next;
            }

            trav.next = trav.next.next;
            nodeCount--;
        }
    }

    public void reverseList() {
        Node t1 = head;
        Node t2 = t1.next;

        while (t2 != head) {
            Node t3 = t2.next;
            t2.next = t1;
            t1 = t2;
            t2 = t3;
        }

        head.next = t1;
        head = t1;
    }
}
