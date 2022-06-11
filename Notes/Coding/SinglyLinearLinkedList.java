public class SinglyLinearLinkedList {
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

    public SinglyLinearLinkedList() {
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

            while (trav != null) {
                System.out.print(trav.data + "==>");
                trav = trav.next;
            }

            System.out.println("null");
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
            nodeCount++;
        } else {
            newNode.next = head;
            head = newNode;
            nodeCount++;
        }
    }

    public void addNodeAtLastPosition(int data) {
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

    public void addNodeAtSpecificPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            addNodeAtFirstPosition(data);
        } else if (pos == getCount() + 1) {
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
        if (isEmpty())
            System.out.println("List is Empty...!!!");
        else {
            head = head.next;
            nodeCount--;
        }
    }

    public void deleteNodeAtLastPosition() {
        if (isEmpty())
            System.out.println("List is Empty...!!!");
        else {
            Node trav = head;

            while (trav.next.next != null) {
                trav = trav.next;
            }

            trav.next = null;
            nodeCount--;
        }
    }

    public void deleteNodeAtSpecificPosition(int pos) {
        if (pos == 1)
            deleteNodeAtFirstPosition();
        else if (pos == getCount()) {
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
        Node t2 = head.next;
        t1.next = null;

        while (t2 != null) {
            Node t3 = t2.next;
            t2.next = t1;
            t1 = t2;
            t2 = t3;
        }
        head = t1;
    }

}
