package DAY16_ForLoopStringPractise;

import java.util.Scanner;

public class PosAndNegativeNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);




        int countpos=0;
        int countneg=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter  number");
            int num=scan.nextInt();

            if(num>0){
                countpos++;
            }else{
                countneg++;
            }
        }
        System.out.println(countpos +" positive and " + countneg+" negative");
    }
}
