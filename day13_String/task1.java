package day13_String;

public class task1 {
    public static void main(String[] args) {

        String sentence="Today is a great day for swimming";
        char f= sentence.charAt(0);
        char l= sentence.charAt(32);

        String initials= f+"."+l;
        System.out.println("initials = " + initials);

        System.out.println("-------------");
        String sentence1="Today is a great day for swimming";
        int totalCase=sentence1.length();
        System.out.println("totalCase = " + totalCase);
        
        char f1=sentence1.charAt(0);
        char l1=sentence.charAt(totalCase-1);
        String initials1= f1+"."+l1;
        System.out.println("initials1 = " + initials1);
        
        
        
       


    }
}
