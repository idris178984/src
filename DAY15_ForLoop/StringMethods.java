package DAY15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {


        String str ="";
        boolean r=str.isEmpty();
        System.out.println(r);

        System.out.println("------------");

        boolean r1= str.isBlank();
        System.out.println(r1);

        System.out.println("******************");

        String s1="CYDEO";
        String s2 ="cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String sentence="My favorite programming language is Java";
        boolean hasJava= sentence.contains("Java");
        boolean hasLowerCase= sentence.toLowerCase().contains("Java");

        System.out.println(hasJava);
        System.out.println(hasLowerCase);
        System.out.println("******************");

        String a="Wooden Spoon";
        boolean x= a.startsWith("Wo");
        boolean y= a.endsWith("on");
        boolean z= a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);




    }
}
