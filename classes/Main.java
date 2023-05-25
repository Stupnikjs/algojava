package classes;



class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(8);

        System.out.println("---------------");

        myDLL.prepend(5);
        myDLL.prepend(153);
        myDLL.prepend(8);
        myDLL.printList();
        System.out.println("---------------");
        myDLL.removev2(2);

        myDLL.printList();



        System.out.println("---------------");
        myDLL.remove(1);

        myDLL.printList();



    }
}