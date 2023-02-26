public class MyList { 
    //listedeki ilk karakteri vercek
    //doubly linked list araştır (hem ileri hem geri gitmemizi sağlar)
    private Node head;
    private int size = 0;

    public void add(int veri) {
        Node node = new Node(veri);
        if(head == null) {
            head = node;
        }else {
           
        }

    }



    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
   

    



    
}
