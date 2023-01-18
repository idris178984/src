package DAY21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for(String  each : words ){
            String initial=each.charAt(0)+ "."+ each.charAt( each.length()-1);
            System.out.println(initial);
        }
        System.out.println("****************");
        String[] words1 = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};


        for(String each: words1){
            System.out.println(each.charAt(0)+" "+ each.charAt(each.length()-1));
        }





    }
}
