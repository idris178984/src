package DAY17_While_DoWhile;

import java.util.Scanner;

public class TaskCalculate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number");
        int f=scan.nextInt();

        System.out.println("Enter second number");
        int s=scan.nextInt();

        System.out.println("Enter math operator ");
        char ch=scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.err.println("Invalid Operator, please re-enter:" );
            ch = scan.next().charAt(0);
        }

        double result=0;
        if(ch=='+'){
            result=f+s;
        }else if(ch=='-'){
            result=f-s;
        }else if(ch=='*'){
            result=f*s;
        }else{
            result=f/s;
        }
        System.out.println("result = " + result);






    }
}
