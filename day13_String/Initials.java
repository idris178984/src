package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName=scan.next();

        System.out.println("Enter your last name");
        String lastName=scan.next();


        char f=firstName.charAt(0);
        char l=lastName.charAt(0);
        String initial=  f+"."+l;

        System.out.println("initial = " + initial);

        System.out.println("___***************");
        
        String f1="SALİH";
        String l1="EREN";
        
        char firstName1=f1.charAt(0);
        char lastName1=l1.charAt(0);
        String initial1=firstName1 +"-"+lastName1;

        System.out.println("initial1 = " + initial1);
        System.out.println("___***************");

        System.out.println("Enter your fn name");
        String fn= scan.next();

        System.out.println("enter your sn");
        String sn=scan.next();

        char firstn=fn.charAt(0);
        char secondn=sn.charAt(0);
        String adition= firstn +"-"+ secondn;

        System.out.println(firstn);
        System.out.println(secondn);
        System.out.println(adition);
        scan.close();





    }
}
