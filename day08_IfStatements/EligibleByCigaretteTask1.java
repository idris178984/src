package day08_IfStatements;

public class EligibleByCigaretteTask1 {
    public static void main(String[] args) {

      int age =19;
      String result="";

      if(age>=18){
         // System.out.println("is eligible");

          result="is eligible";
          System.out.println(result);
      }
      if(age<=18){
          System.out.println("is not eligible");
      }



    }
}
/*
1. Given a number (byte) age, write a program that can check if the
person is eligible to buy Cigarettes
 */