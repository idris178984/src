package DAY10_NestedIf;

public class NestedIfStatement {
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

        System.out.println("-------------------");
        int age =25;
        boolean hasId= true;
        if(hasId){// is person has ID
          if(age>=21){
              System.out.println("eligible buy to alcohol");
          } else{
              System.out.println("eligible not buy alcohol");
          }
        }else{// if person doesnt has ıd
            System.out.println("You must have an ID to buy alcohol");
        }


    }
}
