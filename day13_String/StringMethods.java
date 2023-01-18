package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word="CYDEO SCHOOL";
        char onceChar= word.charAt(1);
        char secondChar=word.charAt(6);

        System.out.println("onceChar = " + onceChar);
        System.out.println("secondChar = " + secondChar);

        System.out.println("------------");

        String s1="Batch 25 is the best batch.";
        int totalChars=s1.length();
        System.out.println("totalChars = " + totalChars);

        System.out.println("lastChar = " );

        System.out.println("------------");

        String str="wooden spoon";
        str=str.toUpperCase();
        System.out.println(str);

        String sentence= "Today is great day for learning java programming";
        sentence= sentence.toUpperCase();
        System.out.println(sentence);
        
        String sentence1="TODAY İS GREAT DAY FOR LEARNİNG JAVA PROGRAMMİNG PRO.";
        sentence1=sentence1.toLowerCase();

        System.out.println("sentence1 = " + sentence1);
        



    }
}
