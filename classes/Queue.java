package classes;

public class Queue {
    private NodeQ first ;
    private NodeQ last;
    private int length ;


    public class NodeQ {
        int value;
        NodeQ next ;
        public NodeQ (int value){
this.value = value;
        }
    }

    public Queue(int value){
        NodeQ newNode = new NodeQ(value);
        first = newNode;
        last = newNode;
        length = 1;
    }


    public void printQueue(){
        NodeQ temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    public void getHeight(){
        System.out.println("length: " + length);
    }


    public void enqueue(int value){
        NodeQ newNode = new NodeQ(value);
        
    }
}
