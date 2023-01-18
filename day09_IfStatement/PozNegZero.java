package day09_IfStatement;

public class PozNegZero {
    public static void main(String[] args) {

       int n= 100;

       if(n>0) {
           System.out.println(" positive ");
       }
       if(0>n){
           System.out.println("negative");
       }
       if(n==0){
           System.out.println("zero");
       }
        System.out.println("---------------");
       boolean zero= n==0;
if(n>0){
    System.out.println("positive");

}else if(0>n){
    System.out.println("negative");
}else{
    System.out.println("zero");
}


    }
}
