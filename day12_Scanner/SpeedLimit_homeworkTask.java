package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit_homeworkTask {
    public static void main(String[] args) {

        int speedLimit=55;
        Scanner scan=new Scanner(System.in);
        int currentSpeed=scan.nextInt();

        System.out.println("Enter your current speed limit");
        int currentSpeedLimit= scan.nextInt();
        scan.close();// we no need longer used scanner after this line.

        int overLimit= currentSpeed-speedLimit;
        if(overLimit>0){
            System.out.println("you are driving " + overLimit + "over the limit. Slow down.");
        }
    }
}
