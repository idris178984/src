package Day20_Practice;

public class ClassMatesReverse {
    public static void main(String[] args) {

        String[] names={"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each:names) {// Elminur ablimit,Ali kılıç... each of name
            String reversed="";

            for (int i = each.length()-1; i >=0 ; i--) {
                char ch=each.charAt(i);
                reversed +=ch;

            }
            System.out.println(reversed);

            System.out.println("********************");

            String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                    "API Testing", "Database Testing", "Manual Testing"};

            for (int i = 0; i < classmates.length; i++) {
                String name = classmates[i];
                String reverseName = "";

                for (int j = name.length()-1; j >= 0; j--) {
                    reverseName += name.charAt(j);
                }

                System.out.println(reverseName);

            }
        }

        }
    }

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */