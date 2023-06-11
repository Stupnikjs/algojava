package classes.hashTable;

public class main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("michel", 454);
        myHashTable.set("jean", 545);

        myHashTable.set("nails", 1000);


        System.out.println(myHashTable.get("michel"));
        System.out.println(myHashTable.get("mi"));
        myHashTable.printTable();

        System.out.println(myHashTable.keys());
    }
}
