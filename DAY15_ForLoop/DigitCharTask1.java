package DAY15_ForLoop;

public class DigitCharTask1 {
    public static void main(String[] args) {
        String str = "A1B2C3";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sum += ch - 48;
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("*******************");

        String str1="A1B2C3";
        int sum1=0;

        for (int i = 0; i <str1.length() ; i++) {
            char ch1 = str1.charAt(i);
            if (ch1 >= '0' && ch1 <= '9') {
                sum1 += ch1 - 48;
            }
        }
            System.out.println("sum1 = " + sum1);


        System.out.println("************");

        String number="ABC1234XYZ";
        int total=0;

        for (int j = 0; j < number.length(); j++) {
            char chars = number.charAt(j);//Each of characters==A,B,C,1,2,3,4,X,Y,Z
            if (chars >= '0' && chars <= '9') {//CHOOSE THE NUMBER==1,2,3,4
                total += chars - 48;
            }
        }
            System.out.println("total = " + total);



    }

}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3
                 output:    6
             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */


