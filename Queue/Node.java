package Queue;

public class Node {

    private Object item; // content node
    private Node refNode;

    public Node() {}
    
    public Node(Object item, Node refNode) {
        this.item = item;
        this.refNode = refNode;
    }

    public Object getItem(){
        return item;
    }

    public void setItem(Object item){
        this.item = item;
    }

    public Node getRefNode(){
        return refNode;
    }

    public void setRefNode(Node refNode){
        this.refNode = refNode;
    }

    @Override
    public String toString(){
        return "Node{" + "item =" + item + "}";
    }

}
