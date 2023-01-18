package DAY15_ForLoop;

public class FullName {
    public static void main(String[] args) {

        String firstName="cyDEo",
                lastName="SCHOOL";
        String str= firstName.replace("c","C").replace("DE","de");
        String str1=lastName.replace("CHOOL","chool");
        String addittion= str +" " + str1;

        System.out.println(addittion);


    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School



 */