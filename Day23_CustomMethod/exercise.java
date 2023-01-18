package Day23_CustomMethod;

public class exercise {
    public static void main(String[] args) {

oddOrEven(9);
ageOfPerson(1984);
printNumber(10,30);
helloWorld5Times();
evenNumber(1,10);
reverse("semih");

    }

    public static void oddOrEven(int number) {
        if(number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }

    }

    public static void ageOfPerson(int birthYear){

        int age=2022-birthYear;
        System.out.println("Your age is " + age);


    }

    public static void printNumber(int y, int x){
        for (int i = y; i < x; i++) {
            System.out.println(i+ " ");

        }
    }

    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" hello world");

        }
    }

    public static void evenNumber(int number1, int number2){
        for (int i = number1; i < number2; i++) {
            if(i%2==0)
            System.out.println(i);


        }
    }

    public static void reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);

        }
        System.out.println(reverse);
    }
}

