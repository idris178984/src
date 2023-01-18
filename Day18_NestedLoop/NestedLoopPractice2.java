package Day18_NestedLoop;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) { //j = 0, 1, 2

            for (int i = 0; i < 10; i++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        System.out.println("************************* ");

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 15; j++) {
                System.out.print("# ");

            }

            System.out.println();
        }
        System.out.println("****************");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("æ ");
            }
            System.out.println();

        }
    }
}
