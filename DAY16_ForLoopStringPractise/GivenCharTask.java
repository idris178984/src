package DAY16_ForLoopStringPractise;

public class GivenCharTask {
    public static void main(String[] args) {
        String str = "aabcccd";
        char ch='c';
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            char eachChars=str.charAt(i);
            if(ch==eachChars){
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}
/*
 Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4


 */