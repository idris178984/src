package DAY10_NestedIf;

public class NestedIfStatement2 {
    public static void main(String[] args) {

        int score=170;
        String result="";

        if(score>=0 && score<=100){
            if(score>=65){
                result="passed";
            }else if(score<=65){
                result="failed";
            }
        }else{
            System.out.println("invalid");
        }
    }
}
