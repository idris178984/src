package day07_Operators;

import javax.lang.model.SourceVersion;

public class RelationalOperators {
    public static void main(String[] args) {
     // >,<,=<, =>
        boolean result1 = 20>40; // False
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; //  TRUE
        System.out.println("result2 = " + result2);
        boolean result3= 120<135;
        System.out.println("result3 = " + result3);// true

        int x = 100;
        int y= 200;
        boolean equal = x==y;
        System.out.println("equal = " + equal); // false

        boolean result4= 'a'=='A';
        System.out.println("result4 = " + result4);// false
        boolean result7= "java"=="java";
        System.out.println("result7 = " + result7);// true
        System.out.println("--------------");
        boolean resul10= 100!=200;
        System.out.println("resul10 = " + resul10);// true
        boolean result11= "java"!="java";
        System.out.println("result11 = " + result11);// true

    }

}
