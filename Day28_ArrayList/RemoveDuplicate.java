package Day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);


        ArrayList<Integer> result = new ArrayList<>(); //{10, 20,30}

        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }

            result.add(each);
        }


        System.out.println(result);

        int []numbers1={1,2,3,4,5,6};
        ArrayList<Integer> numbers2=new ArrayList<>();
        for (int each : numbers1) {
            numbers2.add(each);

        }
        numbers2.add(7);
        numbers2.remove(2);

        System.out.println(numbers2);




    }
}
