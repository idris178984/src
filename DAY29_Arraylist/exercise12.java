package DAY29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class exercise12 {

    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6,7,8};
        ArrayList<Integer>list=new ArrayList<>();
        for (Integer each : numbers) {
            list.add(each);

        }
        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        String[] word={"ahmet","mehmet","hasan"};
        ArrayList<String>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(word));
        System.out.println(list2);

        Integer[] numbers2={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(numbers2));
        list3.remove(2);
        System.out.println(list3);
        System.out.println(Arrays.toString(numbers2));

        Collections.swap(list3,2,4);
        System.out.println(list3);

        Collections.replaceAll(list3,9,10);
        System.out.println(list3);
    }
}
