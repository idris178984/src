package Day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // store ten elements:10,20,50,70

        int[] number={10,20,50,70};
        System.out.println(Arrays.toString(number));

        System.out.println("*****************");



        // create a variable that can contain 5 score

        int[] score=new int[5];
        score[0]=80;
        score[4]=50;
        score[3]=40;
        score[2]=30;
        score[1]=20;


        System.out.println(Arrays.toString(score));
        System.out.println("*************");

        String[] months={"january","february","march","April","may","june"};

        /*
        System.out.println(months[months.length-1]);
        System.out.println(months[0]);
        System.out.println(months[1]);

         */
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }
        System.out.println("*************");

        String[]months1={"january","february","march","April","may","june"};

        //System.out.println(months1[0]);
        for (int i = 0; i < months1.length; i++) {
            System.out.println(months1[i]);

        }








    }
}
