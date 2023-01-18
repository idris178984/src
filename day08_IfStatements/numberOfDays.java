package day08_IfStatements;

public class numberOfDays {
    public static void main(String[] args) {
        int number = 5 ;
        boolean has28Days = number ==2;
        boolean has31Days = number ==1 || number==3 || number==5 || number==7 || number==8 || number ==10 || number == 12;
        boolean has30Days = number ==4 || number==6 || number==9 || number ==11;

        if(has28Days){
            System.out.println("28 Days");
            if (has30Days){
                System.out.println("30 Days");
            }
if(has31Days){
    System.out.println("31 Days");
}
        }






    }
}
/*
Name of month : 1~12
Name of day
1~7
Write a program that can print the number of days in a month
ex
number 1
out put :31 days
months that has 31 days :1 3 5 7 8 10 12
months thar has 30 days:2 4 6 9 11
month that has 28 : 2
 */