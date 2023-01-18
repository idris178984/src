package day08_IfStatements;

public class SchoolTypeTask1 {
    public static void main(String[] args) {

        int level=12;
        String result="";

        if(level>=1 && level<=5){
            System.out.println("Elementary School");
        }
        if(level>=6 && level<=8){
            System.out.println("Middle School");
        }
        if(level>=9 && level<=12){
            System.out.println("High School");
        }
        if(level>=13 && level<=16){
            System.out.println("college");
        }






    }
}
/*
2.  Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
 */