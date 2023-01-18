package DAY24_CustomMethodsReturn;

public class exercise1 {
    public static void main(String[] args) {
        String str= "java";
        String result=reverse(str);
        System.out.println(result);

        if(str.equalsIgnoreCase(result)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }

    }
public static String reverse(String str){
        String reverse= "";
    for (int i = str.length()-1; i >=0; i--) {
        reverse +=str.charAt(i);

    }

    return reverse;
}

}
