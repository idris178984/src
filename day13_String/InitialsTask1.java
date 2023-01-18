package day13_String;

import java.util.Scanner;

public class InitialsTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("first name");
        String word=scan.next();

        System.out.println("last name");
        String word2=scan.next();
        scan.close();

        char f=word.toUpperCase().charAt(0);
        char l=word2.toUpperCase().charAt(word2.length()-1);

      String initial=(f+"."+l);

        System.out.println(initial);




    }
}
