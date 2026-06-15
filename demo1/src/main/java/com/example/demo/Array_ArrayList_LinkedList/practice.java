package Array_ArrayList_LinkedList;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        List<Integer>sar = new ArrayList<>();
                sar.add(1);
                sar.add(2);
                sar.add(2);
                sar.add(3);
        System.out.println(sar.size());

        Set<Integer>sarv = new LinkedHashSet<>(sar);
        System.out.println(sarv);


        Collections.reverse(sar);
        System.out.println(sar);


        System.out.println(Collections.max(sar));

        System.out.println( Collections.min(sar));

        Collections.sort(sar);
        System.out.println(sar);

        Collections.sort(sar,Collections.reverseOrder());
        System.out.println(sar);

        //Second largest
// onre way another we can use stream als
        Collections.sort(sar);
        System.out.println(sar.get(sar.size()-2));

        //frequncy for a particular number

        System.out.println(Collections.frequency(sar,1));
 // convert array to arrayList
        String[] srt = {"satrveh","adharsh"};
        List<String>sart= Arrays.asList(srt);
        System.out.println(sart);



    }
}
