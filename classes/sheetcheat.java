package classes;// https://www.jetbrains.com/help/idea/mastering-keyboard-shortcuts.html


// shortcut psvm + enter => public static void main(String[] args)
//          sout + enter => System.out.println();

public class sheetcheat {

    /* O(n) == O(2n) drop constants
    *
    *  proportionnal relationship
    */
    public static void printelem(int n){
        for (int i = 0 ; i < n ; i++){
            System.out.println(i);
        }
        for (int j = 0 ; j < n ; j++){
            System.out.println(j);
        }

    }


    /* O(n^2)  less efficient than O(n)
     *
     *  proportionnal relationship
     */
    public static void printiandj(int n){
        for (int i = 0 ; i < n ; i++){

            for (int j = 0 ; j < n ; j++){
                System.out.println(i + " " + j);
            }
        }


    }

    /*
    O(n^2) + O(n) = O(n^2) => drop non dominants
     */
    public static void dropnondominant(int n){
        for (int i = 0 ; i < n ; i++){

            for (int j = 0 ; j < n ; j++){
                System.out.println(i + " " + j);
            }
        }
        for (int k = 0 ; k < n ; k++){
            System.out.println(k);
        }

    }

    /*
    O(1) = O(2) number of operation stay const  => most efficient
     */

    public static int addItems(int n){
        return n+ n + n;
    }


    /*
    * O(log(n))  2^? = numberofpossiblesolution
    * or how many time do you need to cut this number in half to get to one
     */


    /*
     * O(n*log(n))  2^? = numberofpossiblesolution
     * or how many time do you need to cut this number in half to get to one
     */

    /*
        O(n) => List.add(0, 11)
        O(n) => List.findByValue(x)
        O(1) => List.indexOf(x)
        O(1) => List.add(5)

     */





    public static void main(String[] args) {

        /*
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("michel", 12);

        System.out.println(map1);
        System.out.println(map2);

        LinkedList myLinkedList = new LinkedList(4);

         */

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getLength();
        myLinkedList.getTail();

        myLinkedList.append(2);
        myLinkedList.printList();

        myLinkedList.getHead();
        myLinkedList.getLength();
        myLinkedList.getTail();


    }

}
