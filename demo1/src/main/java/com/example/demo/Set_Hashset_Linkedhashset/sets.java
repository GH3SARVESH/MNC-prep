package Set_Hashset_Linkedhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sets {
    public static void main(String[] args) {

        // no insertion  order
        //allows only one null
        // No duplicates because hashset uses hashcode and equals method

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Java");
        set.add("Null");


//        System.out.println(set);
//
//      with for loop
//        for (String s : set){
//            System.out.println(s);
//
//        }
        Iterator<String> iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // hasset stucture
//        set.add(10);
//        set.add(20);
//        set.add(30);
        //Bucket 1 → 20
        //Bucket 2 → 10
        //Bucket 3 → 30

//      | Operation  | Complexity |
//                | ---------- | ---------- |
//                | add()      | O(1)       |
//                | remove()   | O(1)       |
//                | contains() | O(1)       |

    }
}
