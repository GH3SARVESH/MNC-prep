package Array_ArrayList_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {
    public static void main(String[] args) {
        List<String> sar= new LinkedList<>();
        sar.add("sarvesh");
        sar.add("adharsh");
        sar.add("praveen");
        sar.add("samantha");
        System.out.println(sar);

        sar.addLast("Oracle");
        System.out.println(sar);
        sar.removeFirst();
        System.out.println(sar);
        sar.removeLast();
        System.out.println(sar);




        sar.addFirst("Angular");
        System.out.println(sar);

    }
}
