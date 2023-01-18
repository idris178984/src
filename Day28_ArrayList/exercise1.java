package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);//0
        numbers.add(11);//2
        numbers.add(12);//3
        numbers.add(1,13);
        Integer number2=numbers.get(2);
        Integer number3=numbers.set(2,3);
        Integer numbers4=numbers.remove(0);
        numbers.clear();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(numbers4);
        System.out.println(numbers);
        System.out.println(numbers);

        System.out.println("********************");

       String[] countries= {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

       ArrayList<String>List=new ArrayList<>(Arrays.asList(countries));
        System.out.println(List);
        List.removeIf(p ->p.length()>=10);
        System.out.println(List);

        countries=List.toArray(List.toArray(new String[0]));

        System.out.println("********************");


    }
}
