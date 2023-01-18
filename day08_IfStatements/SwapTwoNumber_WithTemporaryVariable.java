package day08_IfStatements;

public class SwapTwoNumber_WithTemporaryVariable {
    public static void main(String[] args) {
        int a= 10;
        int b = 15;
        //-----------------------
        int c =b;
        b=a;
        a=c;
        //
        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }
}
/*
 example
 if a:10 b:15
 output
 a:15
 b:10
 */