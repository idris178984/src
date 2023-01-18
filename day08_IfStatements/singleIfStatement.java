package day08_IfStatements;

public class singleIfStatement {
    public static void main(String[] args) {
        int number= 300;
        boolean evenNumber= number%2==0;
        boolean oddNumber= number%2!=0;
        if(evenNumber){
            System.out.println(number + " is even number ");
        }
        if(oddNumber){
            System.out.println(number + " is odd number " );

        }

        int n = 200;
        boolean positive = n>0 ;
        boolean negative = 0>n;
        boolean zero = n==0;

        if(n>0){
            System.out.println(n + " is positive ");
        }

        if(0>n){
            System.out.println(n +" is negative " );
        }




        }







    }

