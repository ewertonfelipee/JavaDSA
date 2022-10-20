public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(new Node(0));
        myStack.push(new Node(1));
        myStack.push(new Node(2));
        myStack.push(new Node(3));
        myStack.push(new Node(4));
        myStack.push(new Node(5));

        System.out.println(myStack.toString());

        myStack.pop();
        myStack.pop();


        System.out.println(myStack.toString());

        System.out.println(myStack.top());        
    }
}
