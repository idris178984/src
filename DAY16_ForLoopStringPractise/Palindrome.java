package DAY16_ForLoopStringPractise;

public class Palindrome {
    public static void main(String[] args) {

        String word="racecar";
        String result="";//"racecar";

        for (int i = word.length()-1; i >=0; i--) {
            char ch=word.charAt(i);
            result +=ch;//write letters side by side

        }

        boolean isPalindrome=word.equalsIgnoreCase(result);
        System.out.println("isPalindrome = " + isPalindrome);
        System.out.println("************");

        String str="level";
        String result1="";

        for (int i = str.length()-1; i >=0; i--) {
            result1+=str.charAt(i);


        }
        boolean isPalindrome1=str.equalsIgnoreCase(result1);
        System.out.println("isPalindrome1 = " + isPalindrome1);


    }
}
