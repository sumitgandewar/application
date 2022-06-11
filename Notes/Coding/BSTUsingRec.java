class BST {
    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void recAdd(int data) {
        if (isEmpty())
            root = new Node(data);
        else {
            recAdd(root, data);
        }
    }

    public void recAdd(Node trav, int data) {
        if (trav == null)
            return;

        if (data < trav.data) {
            if (trav.left == null)
                trav.left = new Node(data);
            else
                recAdd(trav.left, data);
        } else {
            if (trav.right == null)
                trav.right = new Node(data);
            else
                recAdd(trav.right, data);
        }
    }

    public void preOrder() {
        if (isEmpty())
            System.out.println("tree is empty");
        else {
            preOrder(root);
        }
    }

    public void preOrder(Node trav) {
        if (trav == null)
            return;

        System.out.println(trav.data);
        preOrder(trav.left);
        preOrder(trav.right);
    }

    public void inOrder() {
        if (isEmpty())
            System.out.println("tree is empty");
        else {
            inOrder(root);
        }
    }

    public void inOrder(Node trav) {
        if (trav == null)
            return;

        inOrder(trav.left);
        System.out.println(trav.data);
        inOrder(trav.right);
    }

    public void postOrder() {
        if (isEmpty())
            System.out.println("tree is empty");
        else {
            postOrder(root);
        }
    }

    public void postOrder(Node trav) {
        if (trav == null)
            return;

        postOrder(trav.left);
        postOrder(trav.right);
        System.out.println(trav.data);
    }
}

public class BSTUsingRec {

}