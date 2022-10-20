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

    @Override
    public String toString(){
        String returnString = "--------------\n";
        returnString += "   Stack\n";
        returnString += "--------------\n";

        Node auxNode = refInputStack;

        while(true){
            if(auxNode != null){
                returnString += "[Node{data: " + auxNode.getData() + "}]\n";
                auxNode = auxNode.getRefNode();
            }
            else{
                break;
            }
        }

        returnString += "==============\n";
        return returnString;
    }
}
