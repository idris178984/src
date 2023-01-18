package day08_IfStatements;

public class logicalOperators {
    public static void main(String[] args) {
     String name = "Salih";
     int age = 18;
     String citizen ="UK";
     boolean isEligible = age >=18 && citizen=="UK";
        System.out.println(name + " is eligible vote: " + isEligible );
        System.out.println("--------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        boolean isEligible2 = creditScore >= 700 && age2 >=21 ;
        System.out.println(name + " is eligible for loan: " + isEligible2);








    }
}
