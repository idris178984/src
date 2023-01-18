package day13_String;

import java.util.Scanner;

public class FirstLastCharTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence= scan.nextLine();
        scan.close();
        
        char firstChar=sentence.charAt(0);
        char lastChar= sentence.charAt(sentence.length()-1);
        String adittion= (firstChar +"."+ lastChar);
        
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));
        System.out.println(adittion);







    }
}
