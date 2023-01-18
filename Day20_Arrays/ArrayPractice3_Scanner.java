package Day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); //20

        if(length <= 0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length];  //array needs to have enough capacity to contain all the elements user going to enter

        for (int i = 0; i < length; i++) { // i:0, 1...
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // each input user provided during each execution of the loop, will be assigned to the indexes of the array
        }


        System.out.println(Arrays.toString(numbers));



        System.out.println("***************");

        System.out.println("How many numbers do you want to enter");
        int length1=scan.nextInt();

        if(length1<=0){
            System.out.println("Invalid number");
            System.exit(0);
        }

        int[] num=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter a number");
            num[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(num));






    }
}
