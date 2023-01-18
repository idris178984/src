package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str= "java is fun, ı love learning java";
        String str2=str.replace("java" ,"python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email="eylul178984@gmail.com";
        String email2= email.replace("gmail" , "hotmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence="java java python python C# C# C++ C++ python python python python ";
        String sentence2=sentence.replace("python" , "");
        System.out.println("sentence2 = " + sentence2);
        String sentence3=sentence2.replace("  " , "");
        System.out.println("sentence3 = " + sentence3);

        System.out.println("---------------");

        String result= "java java java";
         result= result.replaceFirst("java" ,"python");
        System.out.println("result = " + result);





    }
}
