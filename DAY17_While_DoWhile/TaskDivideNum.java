package DAY17_While_DoWhile;

public class TaskDivideNum {
    public static void main(String[] args) {
        int a=50,
                b=8,
                count=0;

        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+" with remainder of "+ a);






    }
}
