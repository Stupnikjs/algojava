package classes;

public class DoublyLinkedList {

    private NodeD head;
    private NodeD tail ;
    private int length;

    public class NodeD {
         int value ;
         NodeD next;
         NodeD prev;
         public NodeD (int value){
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        NodeD newNode = new NodeD(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList(){
        NodeD temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }
    public void getLength(){
        System.out.println("Length: " + length);
    }


    public void append(int value){
        NodeD newNode = new NodeD(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail ;
            tail = newNode;

        }
        length++;

    }


    public NodeD removeLast(){
        if (length == 0)
            return null;
        if (length == 1) {
            tail = null;
            length --;
            return head = null;
        }

        NodeD temp = tail;
        tail = tail.prev;
        tail.next = null ;
        temp.prev = null;
        length--;
        return temp;

    }

    public void prepend(int value){
        NodeD newNode = new NodeD(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public NodeD removeFirst(){
        if (length == 0 ) return null;
        NodeD newNode = head;
        if (length == 1){
            head = null;
            tail = null ;

        } else {

            head = head.next;
            newNode.next = null;
            head.prev = null;


        }
        length --;
        return newNode;

    }

    public NodeD get(int index){
        if (index < 0 || index >= length) return null ;
        NodeD temp = head;
        if (index < length / 2 ) {

            for( int i = 0 ; i < index; i++ ){
                temp = temp.next;
            }

        } else {
            temp = tail ;
            for( int i = length - 1 ; i > index; i-- ){
                temp = temp.prev;
            }

        }
        return temp;
    }

    public boolean set(int index, int value){
        NodeD tochange = get(index);
        if (tochange != null){
            tochange.value = value;
            return true;
        }
        return false;
    }


    public boolean insert (int index, int value){
        if (index == 0 ){
            prepend(value);
            return true;
        }
        if (index == length -1 ) {
            append(value);
            return true;
        }
            NodeD newNode = new NodeD(value);
            NodeD before = get(index - 1);
            NodeD after = before.next;
            newNode.prev =  before;
            newNode.next = after;
            before.next = newNode;
            after.prev = newNode;
            length++;
            return true;

    }

    public NodeD remove (int index){
        if ( index < 0 || index >= length) return null;
        if (length == 1) {
            NodeD temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        }

        NodeD before = get(index - 1);
        NodeD temp = before.next;
        NodeD after = temp.next;
        after.prev = before;
        before.next = after;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;



    }

    public NodeD removev2(int index) {
        if (index < 0 || index >= length) return null;
        if (length == 0) {
            removeFirst();
        }
        if (index == length - 1) removeLast();

        NodeD temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;

    }

}
