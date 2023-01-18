package day13_String;

import day12_Scanner.ScannerPractice_NextLine;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");//SEMIH
        String word= scan.next();
        scan.close();

        String result="";//HIMES

        for (int i = word.length()-1; i >=0; i--) {
            char ch=word.charAt(i);// each character that we have in word.
            result +=ch;

        }
        System.out.println(result);

    }
}
