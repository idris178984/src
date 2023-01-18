package DAY15_ForLoop;

public class EvenNumberTask1 {
    public static void main(String[] args) {

        int sum=0;

        for (int i = 0; i <=100; i+=2) {
                sum +=i;
        }

        System.out.print("sum = " + sum);

        System.out.print("\n****************");
        
        int sum1=0;

        for (int i = 1; i <=100 ; i+=2) {
            sum1 +=i;
            
        }
        System.out.println("\nsum1 = " + sum1);

        System.out.println("\n****************");

        int sum4=0;

        for (int i = 1; i <=50; i++) {
            sum4 +=i;

        }
        System.out.println("sum4 = " + sum4);



    }
}
/*
Write a program that can return the sum of even numbers between 1 to 100
 */