package Queue;

public class Queue {
    
    private Node refInputQueue;

    // instanciar a fila vazia
    public Queue() {
        this.refInputQueue = null;
    }

    public void enqueue(Node newNode){
        newNode.setRefNode(refInputQueue);
        refInputQueue = newNode;
    }

    public Node first(){
        if(!isEmpty()){
            Node firstNode = refInputQueue;
            while(true){ // getRefNode() referencia pro proxino no
                if(firstNode.getRefNode() != null){
                    firstNode = firstNode.getRefNode();
                }
                else{
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Node dequeue(){
        if(!isEmpty()){
            Node firstNode = refInputQueue;
            Node auxNode = refInputQueue;
            while(true){
                if(firstNode.getRefNode() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                }
                else{
                    auxNode.setRefNode(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public boolean isEmpty(){
        if(refInputQueue == null){
            return true;
        }
        return false;
    }

    @Override

    public String toString(){
        String stringReturn = "";
        Node auxNode = refInputQueue;

        if(refInputQueue != null){
            while(true){
                stringReturn += "[Node{object=" + auxNode.getItem() + "}] --> ";
                if(auxNode.getRefNode() != null){
                    auxNode = auxNode.getRefNode();
                }else{ 
                    stringReturn += "null"; 
                    break;
                }
            }
        }else{ stringReturn = "null";}

        return stringReturn;
    }
}
