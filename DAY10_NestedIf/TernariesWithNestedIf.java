package DAY10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score = 170;

        if (score>=0 && 100>=score) { // if score is valid
            if (score >= 60) {
                System.out.println("passed" );
            } else {
                System.out.println("failed" );
            }


        }else{
            System.out.println("invalid");
        }

     String result=   (score>=0 && 100>=score)? (score >= 60)?"passed" :"failed":"invalid" ;
        System.out.println(result);
        //solution2 use  ternaries only
        System.out.println("---------------" );
        //solution3








    }
}
