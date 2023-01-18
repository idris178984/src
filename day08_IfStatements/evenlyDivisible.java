package day08_IfStatements;

public class evenlyDivisible {
    public static void main(String[] args) {
        int number = 65;
        boolean divisibleby2 = number%2 ==0;
        boolean divisibleby3 = number%3 ==0;
        boolean divisibleby4= number%4==0;

        System.out.println(number + " is divisible by 2 : " + divisibleby2);
        System.out.println(number + "is divisible by 3: " + divisibleby3 );
        System.out.println("divisibleby4 = " + divisibleby4);







        /*
        example:
        number 65
        output
        65 is divisible by 2 : false
        65 is divisible by 3 : false
        65 is divisible by 5 : true
         */
    }





}
