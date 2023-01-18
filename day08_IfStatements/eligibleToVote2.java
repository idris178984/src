package day08_IfStatements;

public class eligibleToVote2 {
    public static void main(String[] args) {

        String name= "Josh";
        int age=24;
        String citizen= "USA";
        boolean isEligible= age>=21 && citizen=="USA";
        String result;

        if(isEligible){
            System.out.println("eligible");

            if(!isEligible){
                System.out.println("not eligible");
            }
        }
    }
}
