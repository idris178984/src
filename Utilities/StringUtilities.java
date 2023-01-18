package Utilities;

import java.util.Arrays;

public class StringUtilities {
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    //returns the reverse the given string
    public static String reverse(String str) {

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // check if the given string is palindrome,return boolean
    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    //checks if the given is anagram, return boolean
    public static boolean anagram(String str1, String str2) {//"acb","bca"
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    //removes the duplicates given string,return string,"aaaabbbbccc"---"abc"
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;

    }


    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number) { // 10

        if (number % 2 == 0) {
            System.out.println(number + " is even number" );
        } else {
            System.out.println(number + " is odd number" );
        }

    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y) {

        for (int i = x; i < y; i++) {
            System.out.println(i + " " );


        }


    }

}


