import java.util.Stack;

public class StackApplication {
    public static boolean isOpearnd(char ch) {
        return (ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
    }

    public static int priority(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return 0;
    }

    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postFix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char currEle = infix.charAt(i);

            if (isOpearnd(currEle))
                postFix.append(currEle);
            else {
                if (!stack.empty() && (priority(stack.peek()) >= priority(currEle))) {
                    postFix.append(stack.pop());
                }

                stack.push(currEle);
            }
        }

        while (!stack.empty()) {
            postFix.append(stack.pop());
        }

        return postFix.toString();

    }

    public static String infixToPrefix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder prefix = new StringBuilder();

        for (int i = infix.length() - 1; i >= 0; i--) {
            char currEle = infix.charAt(i);

            if (isOpearnd(currEle))
                prefix.append(currEle);
            else {
                while (!stack.empty() && priority(stack.peek()) > priority(currEle)) {
                    prefix.append(stack.pop());
                }

                stack.push(currEle);
            }
        }

        while (!stack.empty())
            prefix.append(stack.pop());

        return prefix.reverse().toString();
    }

    public static int postFixEvalution(String postFix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postFix.length(); i++) {
            char currEle = postFix.charAt(i);

            if (isOpearnd(currEle))
                stack.push(currEle - 48);
            else {
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push(calculate(op1, op2, currEle));
            }
        }

        return stack.pop();
    }

    public static int calculate(int op1, int op2, char opr) {
        switch (opr) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            case '%':
                return op1 % op2;
        }

        return 0;
    }

    public static int multiDigitPostFixEvalution(String postFix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postFix.length(); i++) {
            char currEle = postFix.charAt(i);

            if (Character.isDigit(currEle)) {
                int n = 0;

                while (Character.isDigit(currEle)) {
                    n = n * 10 + (int) (currEle - 48);
                    i++;
                    currEle = postFix.charAt(i);
                }

                i--;
                stack.push(n);
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push(calculate(op1, op2, currEle));
            }
        }

        return stack.pop();
    }
}
