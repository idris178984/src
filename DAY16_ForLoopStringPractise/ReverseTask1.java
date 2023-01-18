package DAY16_ForLoopStringPractise;

public class ReverseTask1 {
    public static void main(String[] args) {

        String word="Wooden Spoon";
        String result="";//noopS nedooW

        for (int i = word.length()-1; i >=0 ; i--) {
            char ch=word.charAt(i);

            result +=ch;


        }
        System.out.println("result = " + result);


    }

}
