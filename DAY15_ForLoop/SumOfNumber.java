package DAY15_ForLoop;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {

        int sum=0;
        //1+2+3+4......+100
        for (int i = 1; i <101; i++) {
            sum +=i;
            System.out.println(sum);

            System.out.println("**************");

            Scanner scan=new Scanner(System.in);
            int total=0;

            for (int j = 0; j < 5; j++) {

            System.out.println("Enter a number");
            total += scan.nextInt();}

            System.out.println("total = " + total);



            
        }




    }
}
