package day13_String;

import java.util.Scanner;

public class MiddleCharTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();
        scan.close();

        int l=word.length();

        if(l==3){
            char middle=word.charAt(1);
            if(middle=='a');
            System.out.println("cool word");
        }else if(l<3){
            System.out.println("word is too short");
        }else{
            System.out.println("word is too long");

        }






    }
}
