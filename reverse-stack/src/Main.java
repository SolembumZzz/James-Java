import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.add(0);
        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        myStack.add(5);
        System.out.println(myStack);

        int a = myStack.pop();
        int b = myStack.pop();
        int c = myStack.pop();
        int d = myStack.pop();
        int e = myStack.pop();
        int f = myStack.pop();

        myStack.push(a);
        myStack.push(b);
        myStack.push(c);
        myStack.push(d);
        myStack.push(e);
        myStack.push(f);
        System.out.println(myStack);

    }
}
