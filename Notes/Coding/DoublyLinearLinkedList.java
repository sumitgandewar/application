public class DoublyLinearLinkedList {
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

    public DoublyLinearLinkedList() {
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
            newNode.next = head.next;
            head.prev = newNode;
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

            newNode.prev = trav;
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
            newNode.prev = trav;
            trav.next.prev = newNode;
            trav.next = newNode;
            nodeCount++;
        }
    }

    public void deleteNodeAtFirstPosition() {

        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
                nodeCount--;
            } else {
                head.next.prev = null;
                head = head.next;
                nodeCount--;
            }
        } else
            System.out.println("List is Empty...!!!");
    }

    public void deleteNodeAtLastPosition() {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
                nodeCount--;
            } else {
                Node trav = head;

                while (trav.next.next != null) {
                    trav = trav.next;
                }

                trav.next = null;
                nodeCount--;
            }
        } else
            System.out.println("List is Empty...!!!");
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

            trav.next.next.prev = trav;
            trav.next = trav.next.next;
            nodeCount--;
        }
    }

}
