public class Node {
    private int data;
    private Node nextNode;

    
    public Node(int data) {
        this.data = data;
        nextNode = null;
    }


    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
 

    
}
