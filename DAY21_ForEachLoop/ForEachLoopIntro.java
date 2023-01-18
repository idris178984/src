package DAY21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50,60};

        for( int each:numbers ){
            System.out.println(each);
        }
        System.out.println("***************");

        int[] num={10,30,40,50};

        for( int each: num ){
            System.out.println(each);
        }
        /*
        for (int i = 0; i < num.length; i++) {

        }
        System.out.println(Arrays.toString(num));
*/



    }
}
