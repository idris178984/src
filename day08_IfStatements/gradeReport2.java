package day08_IfStatements;

public class gradeReport2 {
    public static void main(String[] args) {
        int score=65;

        if(score>=90 && score<=100){
            System.out.println("excellent");

        }else if(score>=80 && score<=89){
            System.out.println("great");

        }else if(score>=70 && score<=79){
            System.out.println("passed");

        }else{
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
