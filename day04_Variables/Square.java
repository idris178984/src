package day04_Variables;

import javax.lang.model.SourceVersion;

public class Square {

    public static void main(String[] args) {

        int sideA= 20;
        int sideB= 20;
        int sideC= 20;
        int sideD= 20;

        int areaABCD = sideA * sideB;
        int perimeterABCD =sideA + sideB + sideC + sideD;

        System.out.println("areaABCD = " + areaABCD);
        System.out.println("perimeterABCD = " + perimeterABCD);

    }
}
