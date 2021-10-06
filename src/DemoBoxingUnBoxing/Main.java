package DemoBoxingUnBoxing;

import Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] agrs) {
        List<String> strs = new ArrayList<>();

        strs.add("Java");
        strs.add("C++");
        strs.add("PHP");
        strs.add(1,"Python");
        System.out.println("Get value index = 3: " + strs.get(3));
        for (String str : strs){
            System.out.println(str);
        }

        String[] arr = {"Ruby","Golang","Dart","C#","F#","JavaScript"};

        strs.addAll(Arrays.asList(arr));
        System.out.println("After add list");
        for (String str : strs){
            System.out.println(str);
        }

        ListIterator<String> itr = strs.listIterator();

        System.out.println("Use hasNext():");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Use hasPrevious()");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }

    private static void passByValue(int num) {
        num++;
        System.out.println("value in process = " + num);
    }

    private static void passByReference(Integer num) {
        num++;
        System.out.println("value in process = " + num);
    }
}
