package DAY15_ForLoop;

import java.util.Scanner;

public class idris {
    public static void main(String[] args) {

        int sum=0;
        for (int i =11; i < 16; i++) {
            sum += i;
        }
        System.out.println(sum);

            System.out.println("****************");

            Scanner scan=new Scanner(System.in);
            int total=0;

            for (int j = 0; j < 5; j++) {
                System.out.println("Enter a number:" );
                 total+=scan.nextInt();
            }
        System.out.println( total);

        }



    }

