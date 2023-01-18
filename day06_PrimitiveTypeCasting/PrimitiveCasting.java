package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {

    byte a= 100;
    short b= a ;

    int c = 250;
    long d= c;
        System.out.println(a + ":"+ b); //implicit casting
        System.out.println(c + ":" + d);


        int x = 55 ;
        short y = (short)x;
        System.out.println(x + ":" + y);

        long j = 17000;
        short k = (short)j;
        System.out.println(j+ " : " +k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l+":"+m);

        double d1= 20.5;
        short s1= (short) d1;







    }
}
