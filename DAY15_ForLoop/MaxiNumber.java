package DAY15_ForLoop;

import java.util.Scanner;

public class MaxiNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max= -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num= scan.nextInt();

            if(num>max){
                max=num;
            }

        }
        System.out.println("max = " + max);




    }
}

/*
Write a program that asks the user the enter a number
for 5 times. return the maximum number.
 */