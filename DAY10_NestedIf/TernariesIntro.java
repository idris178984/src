package DAY10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n =100;

        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        System.out.println("-----------------");

        String result1="";
        result1= (n%2==0)? "even number":"odd";
        System.out.println(result1);
    }
}
