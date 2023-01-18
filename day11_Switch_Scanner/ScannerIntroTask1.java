package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntroTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter an integer number");
      int num1  =scan.nextInt();

        System.out.println("Enter an decimal number");
        double num2= scan.nextDouble();

        System.out.println( num1);
        System.out.println( num2);
        System.out.println("multiplication " + (num1*num2));

        scan.close();









    }
}
