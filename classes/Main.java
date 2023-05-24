package classes;



class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(8);

        System.out.println("---------------");
        myDLL.getHead();
        myDLL.getLength();
        myDLL.getTail();
        myDLL.printList();


        System.out.println("---------------");


        myDLL.append(5);
        myDLL.append(6);

        myDLL.printList();

        myDLL.removeLast();

        myDLL.printList();


    }
}