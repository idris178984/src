package day12_Scanner;

import java.util.Scanner;

public class NextName {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your name:");
        String name =input.next();

        System.out.println("name = : " + name);
        input.close();
    }




}
