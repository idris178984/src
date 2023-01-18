package DAY15_ForLoop;

public class ReplaceX {
    public static void main(String[] args) {

        String word="xcodeX";
        String w1=word.replace("x" , "a")
                .replace("X","a");
        System.out.println(w1);


    }
}
/*
 Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */