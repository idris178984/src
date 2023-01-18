package DAY17_While_DoWhile;

public class FruquencyOfWord {
    public static void main(String[] args) {
        String  str = "JavaJava";


        int frequency = 0;
//                              8 - 4
        for (int i = 0; i <= str.length()-4; i++) {
            String eachSub =    str.substring(i, i+4 );
            //System.out.println(eachSub);

            if(eachSub.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);

        System.out.println("***************");

        String word= "java is fun programming language , java is my friend.";
        int count=0;

        for (int i = 0; i < word.length()-8; i++) {

            String esub=word.toLowerCase().substring(i,i+8);
            if(esub.equals("language")){
                count++;
            }

        }

        System.out.println("count = " + count);



    }
}
/*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */
