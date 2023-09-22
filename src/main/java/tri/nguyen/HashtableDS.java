package tri.nguyen;

import java.util.Hashtable;

public class HashtableDS {

    /*
    Hashtable:              A data structure that stores "unique keys" to values ex. <Integer, String>
                            Each key/value pair is known as an Entry
                            Fast insertion, look up, deletion of key/value pairs
                            Not ideal for small data sets, great with large data sets

    hashing:                Take a key and compute an integer (formula will vary based on key & data type)
                            In as Hashtable, we use the "hash % capacity" to calculate an index number

                            key.hasCode() % capacity = index

    bucket:                 an indexed storage location for one or more Entries
                            can store multiple Entries in case of a collision (linked similarly a LinkedList

    collision:              hash function generates the same index for more than one key
                            less collision = more efficiency

    Runtime Complexity:     Best Case O(1)
                            Worst Case O(n)
    */


    public static void main(String[] args) {
        // Hashtable with integer key
        Hashtable <Integer, String> tableN = new Hashtable<>(10, 0.5f);

        tableN.put(100, "Apple");
        tableN.put(123, "Pineapple");
        tableN.put(321, "Banana");
        tableN.put(555, "Orange");
        tableN.put(777, "Mango");

//        table.remove(777); // remove key 777

        // display all keys
        for (Integer key: tableN.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + tableN.get(key));
        }

        // Hashtable with string key
        // increase the initial capacity to 21 (default is 11) to avoid collision
        // 'collision' = same key for 2 or more elements --> search linearly as a linkedList for the collision
        Hashtable <String, String> tableS = new Hashtable<>(21);


        tableS.put("100", "Apple");
        tableS.put("123", "Pineapple");
        tableS.put("321", "Banana");
        tableS.put("555", "Orange");
        tableS.put("777", "Mango");

//        table.remove(777); // remove key 777

        System.out.println();

        // display all keys
        // key.hasCode() --> Returns a hash code for this string. The hash code for a String object is computed as
        //  s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        for (String key: tableS.keySet()){
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + tableS.get(key));
        }
    }

}
