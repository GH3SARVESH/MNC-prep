package Set_Hashset_Linkedhashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterviewPrepSet {
    public static void main(String[] args) {
        //Remove Duplicates
//        List<Integer> list = Arrays.asList(10,20,30,20,10);
//        Set<Integer> set = new HashSet<>(list);
//        System.out.println(set);

        //Find Unique Words
        String str = "java spring java sql";
        String[] sr = str.split(" ");
        Set<String>sar = new HashSet<>(Arrays.asList(sr));
        System.out.println(sar);
    }
}
