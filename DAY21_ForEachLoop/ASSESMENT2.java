package DAY21_ForEachLoop;

import java.util.Scanner;

public class ASSESMENT2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int iteration=input.nextInt();

        int total=0;
        for (int i = 0; i < iteration; i++) {
            if(i%3==0)continue;
            total +=num1+num2;

            
        }

    }
}
