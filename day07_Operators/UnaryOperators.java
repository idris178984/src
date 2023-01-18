package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1= 25;
        int num2= -25;

        System.out.println(0>num1); // False
        System.out.println(0>num2); // True

    int a = 5;
    ++a; // pre increment : increases value by 1 right away
        System.out.println(a);

        --a; //pre decrement : decreases value by 1 right away
        System.out.println(a);
        System.out.println("----------------------");
        int c= 100;
        System.out.println(c++);// post increases: increases next step by 1
        System.out.println(c);
        System.out.println("---------------------");

        int d= 200;
        System.out.println(--d);// pre decreases: decrease value bye 1 right away
        System.out.println(d--); // post decreases: decreases next step by 1
        System.out.println(d--);




    }


}
