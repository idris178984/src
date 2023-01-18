package day08_IfStatements;

public class gradeReport {
    public static void main(String[] args) {
        int score = 85;
        boolean a = score >=90 && 100>=score; //false
        boolean b =score>=80 && 89 >=score;

        if(a) {
            System.out.println("excellent" );
        }

        if(b) {
            System.out.println("great" );
        }
        int score2 =55;
        boolean c = 59>=score && score>=0 ;
        if(c){
            System.out.println("failed");
        }






    }
}
 /*
  score :
  90 ~ 100 excellent
  80~89 great
  70~79 good
  60~69 passed
  0~59 failed
  */
