package DAY24_CustomMethodsReturn;

public class ReturnMethodsIntro {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str);

        String result =  reverse(str);

        System.out.println(reverse(str));

        if(str.equalsIgnoreCase(result)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

    }


    public static String reverse(String str){ //"Java"

        String reverse = "";

        for(int i=str.length()-1; i>= 0; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }
    }

