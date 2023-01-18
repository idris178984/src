package DAY16_ForLoopStringPractise;

public class PalindromeTask1 {
    public static void main(String[] args) {

        String str ="level";
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch=str.charAt(i);
            result +=ch;

        }
        boolean isPalindrome=str.equalsIgnoreCase(result);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
