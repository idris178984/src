package Day20_Practice;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {

        String[] names={"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        String reversed="";

        for (String each : names) {


            for (int i = each.length()-1; i >=0 ; i--) {
                reversed +=each.charAt(i);

            }
            System.out.println(reversed);
        }
        System.out.println("-------------------");

        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};
        for (int i = 0; i < classmates.length; i++) {

            String name=classmates[i];
            String reversedName="";

            for (int j = name.length()-1; j >=0; j--) {
                reversedName+=name.charAt(j);

            }
            System.out.println(reversedName);
        }
        System.out.println("-------------------");

        int[]num={1,2,3,4,5};
         int[] reversed2=new int[num.length];

         int j=0;
         /*
                   j      i
         reversed2[0]=num[5];
         reversed2[1]=num[4];
          */
        for (int i = num.length-1; i >=0; j++,i--) {
            reversed2[j]=num[i];


        }
        System.out.println(Arrays.toString(reversed2));

        System.out.println("-------------------");

        char[] alphabet=new char[26];

        /*
                 i    ch
        alphabet[0]='Z';
        ALPHABET[1]='Y'
         */
        char ch='Z';
        for (int i = 0; i < alphabet.length; i++,ch--) {
            alphabet[i]=ch;

        }
        System.out.println(Arrays.toString(alphabet));
        System.out.println("-------------------");

        int[] numbers ={10,9, 0,1,2,20, 4,6,7,8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------");
        int[] numbers1 = {10,20,30,40,50,60};

        int sum=0;

        for (int i = 0; i < numbers1.length; i++) {
          sum +=numbers1[i];

        }

        double avaregeNumber=sum/ numbers1.length;
        System.out.println(avaregeNumber);

        System.out.println("-------------------");

        String str = "Java";
       String[] word=str.split("");
        System.out.println(Arrays.toString(word));

        System.out.println("-------------------");

        String sentence = "Today is nice day. Today is Monday. Today we learn Java";
        String[] word1=sentence.split("\\. ");
        System.out.println(Arrays.toString(word1));

        System.out.println("-------------------");

        int[][] arr2D =         { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

        for (int i = 0; i < arr2D.length; i++) {
            for (int k = 0; k < arr2D[i].length; k++) {
                System.out.println(arr2D[i][k]+" ");

            }
            System.out.println();
        }
        System.out.println("-------------------");

        int[][] x = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for (int i = x.length-1; i >=0; i--) {
            for (int y = 0; y < x[i].length; j++) {

                System.out.println(x[i][y]+" ");
            }
            System.out.println();

        }
    }

}
