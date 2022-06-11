import java.util.Stack;

public class BSTWithoutRec {

    class BST {
        class Node {
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

        public boolean isEmpty() {
            return root == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                root = newNode;
            } else {
                Node trav = root;

                while (true) {
                    if (data < trav.data) {
                        if (trav.left == null) {
                            trav.left = newNode;
                            break;
                        } else
                            trav = trav.left;
                    } else {
                        if (trav.right == null) {
                            trav.right = newNode;
                            break;
                        } else
                            trav = trav.right;
                    }
                }
            }
        }

        public void preOrder() {
            if (isEmpty())
                System.out.println("tree is empty");
            else {
                Node trav = root;
                Stack<Node> s = new Stack<>();

                while (trav != null || !s.empty()) {
                    while (trav != null) {
                        System.out.println(trav.data);

                        if (trav.right != null)
                            s.push(trav.right);

                        trav = trav.left;
                    }

                    if (!s.empty())
                        trav = s.pop();
                }
            }
        }

        public void inorder() {
            if (isEmpty())
                System.out.println("tree is empty");
            else {
                Node trav = root;
                Stack<Node> s = new Stack<>();

                while (trav != null || !s.empty()) {
                    while (trav != null) {
                        s.push(trav);
                        trav = trav.left;
                    }

                    if (!s.empty()) {
                        trav = s.pop();
                        System.out.println(trav.data);
                        trav = trav.right;
                    }
                }
            }
        }

        public void postorder() {
            if (isEmpty())
                System.out.println("tree is empty");
            else {
                Stack<Node> s = new Stack<>();
                Stack<Integer> num = new Stack<>();
                s.push(root);

                while (!s.empty()) {
                    Node curr = s.pop();
                    num.push(curr.data);

                    if (curr.left != null)
                        s.push(curr.left);

                    if (curr.right != null)
                        s.push(curr.right);
                }

                while (!num.empty()) {
                    System.out.println(num.pop());
                }

            }
        }
    }
}
