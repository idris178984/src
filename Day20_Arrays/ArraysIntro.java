package Day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that is capable enough five names
        String[] myGroups=new String[5];
        myGroups[0]="Gunay";
        myGroups[1]="Neira";
        myGroups[2]="Suat";
        myGroups[3]="Idris";
        myGroups[4]="Salih";

        System.out.println(Arrays.toString(myGroups));

        System.out.println("**************");
        String[] days={"Monday","Tuesday","wednesday","THURSDAY","FRİDAY","SATURDAY","SUNDAY"};
        System.out.println(Arrays.toString(days));

        int number=5;

        if(number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


    }
}
