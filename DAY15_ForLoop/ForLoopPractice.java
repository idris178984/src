package DAY15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i= 15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println("\nHello");

        System.out.println("****************");

        for(int i =100; i>=50; i--){
            System.out.print(i+" ");
        }

        System.out.println("\nhello world");

        System.out.println("***********");
        ////print all even number between 1~55

        for(int i =1; i<=55; i++){
            if (i%2==0) {

                System.out.print(i + " " );
            }


        }
        System.out.println("*******************");
        for(int i=2; i<=54;i+=2){
            System.out.print(i+" ");
        }

        for (int i = 1; i <= 99; i+=2) {
            System.out.print(i+" ");

        }




    }
}
