package classes.binarysearchtree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(5);

        myBST.insert(18);
        myBST.insert(7);

        myBST.insert(1654);
        myBST.insert(479879);
        System.out.println(myBST.contains(4879));
    }

}
