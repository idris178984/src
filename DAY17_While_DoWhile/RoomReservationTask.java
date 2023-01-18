package DAY17_While_DoWhile;

import java.util.Scanner;

public class RoomReservationTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int total=0;

        System.out.println("Which room would you like select.");
        System.out.println("\t\tking bed: 120$");
        System.out.println("\t\tqueen bed: 120$");
        System.out.println("\t\tsingle bed: 120$");

        System.out.println("Enter your room please");
        String word=scan.nextLine();

        while( !(word.equals("king bed")|| word.equals("queen bed")||word.equals("single bed"))){
            System.err.println("Invalid Entry, please re-enter");
             word=scan.nextLine().toLowerCase();
        }
        if(word.equals("king bed")){
            total=120;
        }else if(word.equals("queen bed")){
            total=100;
        }else{
            total=80;
        }
        System.out.println("Your total price is:$ " + total);

    }
}
