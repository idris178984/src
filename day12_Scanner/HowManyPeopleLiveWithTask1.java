package day12_Scanner;

import java.util.Scanner;

public class HowManyPeopleLiveWithTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many people live with:");
        int num= scan.nextInt();
        scan.close();

        String result="";

        if(num<3){
            result="live with less than 3 people";
        }else if(num<6){
            result="lives with6~ 3 people";
        }else{
            result="lives with more than 6 people";
        }
        System.out.println("result = " + result);

    }
}
/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


 */