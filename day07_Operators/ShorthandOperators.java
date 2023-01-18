package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        // Assignment :=
        int number =100;
        System.out.println("number = " + number);

        number = 200; // just changed of value.. you know variables must be unique.
        System.out.println("number = " + number);

        String word = "Java programming";
        System.out.println("word = " + word);// Java programming
        word = "Wooden Spoon";
        System.out.println("word = " + word); // Wooden Spoon
        // The last word is the "word (Wooden Spoon)"
        word = "123" + 1; // 1231 this is not a number, if this a number we cant use it.
        // not:  used just "String"

        System.out.println("-------------");
        //Addition asignment

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200); // 300
        System.out.println("x = " + x); // 100

        x= x+ 200 ;// 300
        System.out.println("x = " + x);//300
        x-=200;
        System.out.println("x = " + x);//100
        x+=100;
        System.out.println("x = " + x);//200

        System.out.println("--------------");
        String str = "Spoon";

        System.out.println(" str = " + str);

        double num1= 2.5;
        System.out.println("num1 = " + num1);
        num1 +=5.5;

        System.out.println("----------"); 
        double salary = 50000.50; 
        salary *=2;
        System.out.println("salary = " + salary);

        double num10= 100; 
        num10 %=3;
        System.out.println("num10 = " + num10);

        int cents = 127; // how many quarter and
        cents %=25;
        System.out.println("cents = " + cents);





    }






}
