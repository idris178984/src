package DAY15_ForLoop;

import java.util.Scanner;

public class FactorielNumberTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int num= scan.nextInt();

        int result=1;

        for (int i = (int) num; i >=1; i--) {
            result *=i;
            
        }
        System.out.println("result = " + result);
        scan.close();




    }
}
