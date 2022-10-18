public class Stack {
    
    private Node refInputStack; // reference node

    public Stack(){
        this.refInputStack = null;
    }

    public boolean isEmpty() {
        if(refInputStack == null){
            return true;
        } 
        return false;
    }

    public void push(Node newNode){
        Node refAux = refInputStack;
        refInputStack = newNode;
        refInputStack.setRefNode(refAux);
    }

    public Node pop(){
        if(!isEmpty()){
            Node popped = refInputStack;
            refInputStack = refInputStack.getRefNode();
            return popped;
        }
        return null;
    }

    public Node top(){
        return refInputStack;

    }
}
