package DAY29_Arraylist;

import java.util.ArrayList;

public class FirstUniqueElement_ASK {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);

        for (Integer each : list) {

            int frequency = 0;
            for (Integer element : list) {
                if(element == each){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(each);
                break;
            }

        }



    }
}

     /*
        int frequency=0;
        for(Integer element: list){//BU SADECE (1 ELEMENTİ) İÇİN GECERLİ
            if(element==1){
                frequency++;

      */






