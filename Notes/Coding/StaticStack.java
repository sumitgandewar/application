import java.util.*;

public class StaticStack {

    public static void main(String[] args) {
        Stack s = new Stack();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.println("----------------------------------");
            System.out.println("1.push 2.pop 3.peek 4.exit");
            System.out.println("Enter your choice :");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("enter data :");
                    s.push(sc.nextInt());
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peekElement();
                    break;

                case 4:
                    flag = false;
                    sc.close();
                    break;

            }
        }
    }
}

class Stack {
    private int[] arr;
    private int top;

    public Stack() {
        this.arr = new int[5];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int data) {
        if (isFull())
            System.out.println("Stack overflow...!!!");
        else {
            arr[++top] = data;
        }
    }

    public void pop() {
        if (isEmpty())
            System.out.println("Stack underflow...!!!");
        else {
            System.out.println("pop element :" + arr[top]);
            top--;
        }
    }

    public void peekElement() {
        if (isEmpty()) {
            System.out.println("Stack overflow...!!!");
        } else {
            System.out.println("peek element :" + arr[top]);
        }
    }
}
