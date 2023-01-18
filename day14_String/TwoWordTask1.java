package day14_String;

import java.util.Scanner;

public class TwoWordTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String str1= scan.next();

        System.out.println("Enter a second word");
        String str2= scan.next();
        scan.close();


        String result= str1.substring(1)+str2.substring(1);
        System.out.println(result);





    }
}
/*
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */