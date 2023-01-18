package Day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
       char[] alphabets=new char[26];//'Z'˜A

        /*
                    i   ch
         alphabets[0]='Z';
         alphabets[1]='Y';

*/
        char ch='Z';


        //System.out.println(alphabets[0]);
        //System.out.println(alphabets[1]);

        for (int i = 0; i < alphabets.length; i++,ch--) {
            alphabets[i]=ch;

        }
        System.out.println(Arrays.toString(alphabets));

        System.out.println("*****************");

        char[]alphabets1= new char[26];//Z˜A
        /*
                    i   ch
        alphabets1[0]='Z';
        alphabets1[1]='Y';
        */


        char ch1='Z';
        for (int i = 0; i < alphabets1.length; i++,ch1--) {
            alphabets1[i]=ch1;

        }
        System.out.println(Arrays.toString(alphabets1));

        System.out.println("*****************");

        char[] alp=new char[26];

        char ch2='A';

        for (int i = 0; i < alp.length; i++,ch2++) {
            alp[i]=ch2;

        }
        System.out.println(Arrays.toString(alp));



    }
}
