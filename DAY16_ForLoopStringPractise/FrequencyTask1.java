package DAY16_ForLoopStringPractise;

public class FrequencyTask1 {
    public static void main(String[] args) {
        String str = "aabcccd";
        char ch='c';// given char
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar=str.charAt(i);//each character that we have in str

            if(ch==eachChar){// if given ch is matching with eachchar
                frequency++;
            }
        }

        System.out.println("frequency = " + frequency);

        System.out.println("******************");

        String word="Java programming language";
        char ch1='g';
        int frequency1=0;

        for (int i = 0; i < word.length(); i++) {
            char chars1=word.charAt(i);

            if(ch1==chars1){
            frequency1++;
            }

        }


        System.out.println("frequency1 = " + frequency1);
        System.out.println("***************");

        String sentence="AAABBBCCCDDD";
        char ch3='D';
        int frequency2=0;

        for (int i = 0; i < sentence.length(); i++) {
            char chars2=sentence.toLowerCase().charAt(i);
            if(ch3==chars2){
                frequency2++;
            }
        }
        System.out.println(frequency2);

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
