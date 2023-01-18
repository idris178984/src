package day09_IfStatement;

public class MedianNumber2 {
    public static void main(String[] args) {

            int a =10,
                b =15,
                c =20;
            if(a>b && a<c || a>c && a<b) {
                System.out.println("a is median number" );

            }else if(b>a && b<c || b>c && b<a) {
                System.out.println("b is median number");

            } else{
                System.out.println("c is median number");
            }
    }
}
