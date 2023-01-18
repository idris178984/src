package day14_String;

public class emailDomain {
    public static void main(String[] args) {

        String email="Cydeo.School@gmail.com";
        int beginingIndex=email.indexOf("@") +1;
        int endiningIndex=email.lastIndexOf(".");

        String email1= email.substring(beginingIndex,endiningIndex);
        System.out.println(email1);

        System.out.println("-----------");

        String str1= "Java is fun, Java is cool";
        String s1=str1.substring(0,10+1);
        int beg= str1.lastIndexOf("J");
        String s2= str1.substring(beg);

        System.out.println(s1);
        System.out.println(s2);










    }
}
/*
Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo


 */