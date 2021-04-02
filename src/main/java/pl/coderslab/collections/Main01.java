package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        List<Integer> el = new ArrayList<>();
        for (int i = 10; i < 20; i++){
            el.add(i);
        }

    System.out.println("While with iterator");
     for (int i = 0; i < el.size(); i++) {
         System.out.println(el.get(i));
     }

        System.out.println("While with iterator");
        Iterator<Integer> it = el.iterator();
        while (it.hasNext()) {
            int number = it.next();
            System.out.println(number);
        }

        System.out.println("For with iterator");
        for(Iterator<Integer> iterator = el.iterator(); iterator.hasNext(); ) {
            int number = iterator.next();
            System.out.println(number);
        }


        System.out.println("For each");
        for(Integer number : el) {
            System.out.println(number);
        }

    }
}
