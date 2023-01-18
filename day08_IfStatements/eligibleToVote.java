package day08_IfStatements;

public class eligibleToVote {
    public static void main(String[] args) {
        String name= "Josh" ;
        int age = 38 ;
        String citizen = "USA";
        boolean isEligible = age >=21 && citizen== "USA";

        // eligible
        if(isEligible= age>=21 && citizen == "USA"){
            System.out.println("Eligible");
        }

        // not eligible
        if(!isEligible){
            System.out.println("not eligible");
        }
        System.out.println("*************");











    }
}
