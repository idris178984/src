package day04_Variables;

public class circle {
    public static void main(String[] args) {
        //Pi,radius, diameter,area, perimeter

        double PI = 3.14;

        double Radius =5;


        double diameter = Radius * 2;
        double area =  Radius * Radius * PI ;
        double perimeter = diameter * PI;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);



    }
}
