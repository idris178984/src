package day13_String;

import java.util.Scanner;

public class WordSameTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String word=scan.next();
        scan.close();

        char f=word.charAt(0),
             l=word.charAt(word.length()-1);


        if(f==l){
            System.out.println("it is same char");

        }else{
            System.out.println("diferrent char");
        }

    }
}
