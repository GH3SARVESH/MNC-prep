package Set_Hashset_Linkedhashset;

import java.util.Set;
import java.util.TreeSet;

public class Treesets {
    public static void main(String[] args) {
        //TreeSet internally uses:
//        Red Black Tree
//        | Operation | Complexity |
//                | --------- | ---------- |
//                | add()     | O(log n)   |
//                | remove()  | O(log n)   |
//                | search()  | O(log n)   |
        //Slower than HashSet.
        // treeset has sorted order

                Set<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);
        // set.add(null);

        System.out.println(set);
    }
}
