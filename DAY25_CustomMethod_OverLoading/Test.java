package DAY25_CustomMethod_OverLoading;

import Utilities.StringUtilities;

public class Test {
    public static void main(String[] args) {
        String str="java programing language";
         StringUtilities.printEachChar(str);

        System.out.println("*******************");

        String s1="Wooden Spoon";
        String reverse=StringUtilities.reverse(s1);
        System.out.println(reverse);

        System.out.println("*******************");

        String word="civic";
        boolean palindrome=StringUtilities.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("*******************");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;
        for (String each:names) {
            if(StringUtilities.isPalindrome(each)){
                count ++;

            }
        }
        System.out.println(count);

        System.out.println("*******************");

        String s2="aaaabbbbcccdddd";
        String nonDup=StringUtilities.removeDuplicates(s2);
        System.out.println(nonDup);


    }

}


