package DAY15_ForLoop;

import java.util.Scanner;

public class ForLoopPracticeTask {
    public static void main(String[] args) {

        int sum=0;
        for (int i = 2; i <= 100; i+=2) {
            sum +=i;

        }
        System.out.println(sum);
        System.out.println("*************");

        int sum1=0;
        for (int i = 1; i <=100 ; i+=2) {
            sum1 +=i;

        }
        System.out.println(sum1);

        System.out.println("**************");

        int sum3=0;
        for (int i = 1; i <= 50; i++) {
            sum3 +=i;

        }
        System.out.println(sum3);
        System.out.println("**********");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();

        int result=1;

        for (int i = (int) number; i >=1 ; i--) {
            result *=i;

        }
        System.out.println(result);

        System.out.println("*************");

        String str="mn@#123Ab!";

        String letters="";//mnAb
        String digits="";//123
        String sChars="";//@#!

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z') {
                letters +=ch;
            }else if(ch>='0' && ch<='9'){
                digits +=ch;
            }else{
               sChars +=ch;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("sChars = " + sChars);
        System.out.println("************");

        String sentence="A1B2C3";
        int sum4=0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch=sentence.charAt(i);
            if(ch>='0' && ch<='9'){
                sum +=ch-48;

            }

        }








    }
}
/*
1. Write a program that can return the sum of even numbers between 1 to 100

	2. Write a program that can return the sum of odd numbers between 1 to 100

	3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275


	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


    5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!


    6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...


	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW


	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


 */
