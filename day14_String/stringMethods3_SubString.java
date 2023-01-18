package day14_String;

public class stringMethods3_SubString {
    public static void main(String[] args) {
    // beginning index, ending index

        String word= "Cydeo School";
                    //01234
        String brand= word.substring(0,4+1);
        System.out.println(brand);

        String str1=word.substring(6);
        System.out.println(str1);

        String word2="java programming language";
        String m1 = word2.substring(0, word2.indexOf(" "));
        String m2=word2.substring(word2.indexOf(" ") +1 , word2.lastIndexOf(" ")); // "programming"
        String m3=word2.substring(word2.lastIndexOf(" ")+1);// "language"

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        




    }
}
