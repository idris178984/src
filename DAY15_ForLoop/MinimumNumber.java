package DAY15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int min= +2147483647;

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number:");
            int num=scan.nextInt();

            if(num<min){
                min=num;
            }

        }
        System.out.println("min = " + min);

    }
}
/*
Write a program that asks the user the enter a number
for 5 times. return the minumum number number.
 */