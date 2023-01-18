package day09_IfStatement;

public class NumberToWordTask1 {
    public static void main(String[] args) {
        int num= 1;
        String result="";

        if(num==0){
            result="zero";
        }else if(num==1){
            result="one";
        }else if(num==2) {
            result = "two";
        }else if(num==3) {
            result = "tree";
        }else if(num==4) {
            result = "four";
        }else if(num==5) {
            result = "five";
        }else if(num==6) {
            result = "six";
        }else if(num==7) {
            result = "seven";
        }else if(num==8) {
            result = "eight";
        }else  {
            result = "nine";
        }
        System.out.println(result);




    }
}
/*
Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */