package Day20_Practice;

import java.util.Arrays;

public class reversed {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5};

        int[]reversed=new int[num.length];

        /*
                 j      i
        reversed[0]=num[5]
        reversed[1]=num[4]
         */

        int j=0;

        for (int i = num.length-1; i >=0 ; i--,j++) {
            reversed[j]=num[i];

        }
        System.out.println(Arrays.toString(reversed));


    }
}
/*
 Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};


 */
