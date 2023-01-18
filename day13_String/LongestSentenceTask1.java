package day13_String;

import java.util.Scanner;

public class LongestSentenceTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first sentence" );
        String sentence=scan.nextLine();

        System.out.println("Enter your second sentence" );
        String sentence1=scan.nextLine();
        scan.close();

        if(sentence.length()>sentence1.length()){
            System.out.println(sentence);
        }else if(sentence.length()<sentence1.length()){
            System.out.println(sentence1);
        }else{
            System.out.println("both of sentence is same");
        }





    }
}