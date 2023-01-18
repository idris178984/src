package DAY34_GarbageCollection_AccesModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method" );

    }

    static {//Runs first before anything,and runs only one time
        System.out.println("Static Block" );
    }

        static {
            System.out.println("Static Block 2" );
        }

        static {
            System.out.println("Static Block 3" );
        }


    }

