package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

    int number = 9;
    String result="";

    if(number==1) {
        System.out.println("Monday");
    }


    switch(number) { // 1 2 3 4 5 6 7
        case 1:
            result="Monday";
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("wednesday");
            break;
        case 4:
            System.out.println("thursday");
            break;
        case 5:
            System.out.println("friday");
            break;// exits the switch after executing the case block
        case 6:
         System.out.println("saturday");
         break;// exits the switch after executing the case block
        case 7:
            System.out.println("sunday");
            break;// exits the switch after executing the case block


        default:
            System.out.println("Invalid");
            break;

    }

    }
}
