package Array_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_ArrayList_LinkedList {
    public static void main(String[] args) {

        // default capacity of ArrayList is 10
        List<String>name = new ArrayList<>();
        name.add("sarvesh");
        name.add("adharsh");
        name.add("praveen");
        name.add("samantha");
//        System.out.println(name.get(1));
//        System.out.println(name);
//        System.out.println(name.remove(0));
//        System.out.println(name);
//        //update
//        System.out.println(name.set(0,"samantha"));
//        System.out.println(name);
//        System.out.println(name.contains("samantha"));

//        for(int i =0; i<name.size();i++){
//            System.out.println(name.get(i));
//
//        }


//        for(String sar :name){
//            System.out.println(sar.toUpperCase().contains("SAMANTHA"));
//
//        }

        Iterator<String>sar=  name.iterator();
        while(sar.hasNext()){
            System.out.println(sar.next());
        }


    }
}
