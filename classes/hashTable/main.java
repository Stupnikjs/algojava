package classes.hashTable;


import java.util.HashMap;

public class main {

    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for(int i = 0 ; i < array1.length; i++ ){
            myHashMap.put(array1[i] , true);
        }
        for(int j = 0; j < array2.length; j++){
            if (myHashMap.get(array2[j]) != null ) return true ;
        }
        return false;
    }

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("michel", 454);
        myHashTable.set("jean", 545);

        myHashTable.set("nails", 1000);


        System.out.println(myHashTable.keys());

        int[] arr =  {1, 7,54};
        int[] arr2 = {2, 8, 87};

        System.out.println(itemInCommon(arr, arr2));
    }
}
