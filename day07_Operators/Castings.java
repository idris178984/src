package day07_Operators;

public class Castings {
    public static void main(String[] args) {

        float averageScore = 20.5f;
        byte num1 = (byte)averageScore ;
        short num2= (short) averageScore;
        int num3= (int) averageScore;
        long num4= (long) averageScore;
        float num5= averageScore;
        double num6= averageScore;

        System.out.println("num1 = " + num1);// explicit casting
        System.out.println("num2 = " + num2);// explicit casting
        System.out.println("num3 = " + num3);// explicit casting
        System.out.println("num4 = " + num4);// explicit casting
        System.out.println("num5 = " + num5); // no casting
        System.out.println("num6 = " + num6);// implicit casting

        // Float and double are for "DECİMAL" so it is out put 20.5
        //The others are not contain decimal so it is out put 20


    }
}
 /*
 Create a class named Castings
 1.1    declare a variable of float named averageScored and
        initialize it to 20.5
 1.2    declare the following variables and assign averageScore to each them
        byte num1 ;
        short num2;
        int num3;
        long num4;
        float num5;
        double num6;

  */