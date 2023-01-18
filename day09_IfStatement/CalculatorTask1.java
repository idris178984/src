package day09_IfStatement;

public class CalculatorTask1 {
    public static void main(String[] args) {

        int n1=20,
            n2=10;
        char operator='+';
        int result=0;

        if(operator=='-'){
            result=n1-n2;
        }else if(operator=='*') {
            result = n1 * n2;
        }else if(operator=='+'){
            result=n1+n2;
        }else if(operator=='/'){
            result=n1/n2;
        }else{
            System.out.println("invalid number");
        }
        System.out.println(result);





    }
}
/*
char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

 */