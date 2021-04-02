package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};    - nie mogę wypełnić asList numsami
//        int[] nums2 = new int[3];
//        Arrays.fill(nums2,45);         - tu też nie mogę wypełnić
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));   //nie da się po prostu asList(nums),   nie wchodzi też po prostu List<Integer> numbers = Arrays.asList(1,2,3,4,5); bo on zmienia liczby do typu  Seizable (?) (tak działa asList?)
        removeDivider(numbers, 2);
        for(int num : numbers){
            System.out.println(num+" ");
        }
    }

    public static void removeDivider (List<Integer> list, int divider){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int value = it.next();
            if(value % divider == 0){
                it.remove();
            }
        }
    }
}
