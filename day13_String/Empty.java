package day13_String;

import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter a sentence");
        String sentence= scan.nextLine();
        scan.close();

        int total=sentence.length();

        if(total==0){
            System.out.println("string is empty");
        }else if(total>3){
            int length=sentence.length()-1;
            System.out.println(sentence.substring(sentence.length()-3));
        }else{
            System.out.println(sentence);
        }





    }
}
