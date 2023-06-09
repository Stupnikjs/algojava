package classes;

// last in first out LIFO
public class Stack {

    private NodeS top;
    private int height;

    public class NodeS {
        int value ;
        NodeS next ;

        public NodeS(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        NodeS newNode = new NodeS(value);
        top = newNode;
        height = 1;
    }


    public void printStack(){
        NodeS temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }

    public void push (int value){
        NodeS newNode = new NodeS(value);
        if(height == 0) {
            top = newNode;

        } else {
            newNode.next = top;
            top = newNode;
        }
     height++;
    }

    public NodeS pop(){
        if (height == 0) return null ;
        NodeS temp = top ;
        top = top.next;
        temp.next = null;
        height--;
        return temp ;
    }
}
