package DAY16_ForLoopStringPractise;

public class DigitsLetterSpecialChar {
    public static void main(String[] args) {
        String str = "ABCDE1234567890) (*&ABCDE1234567890^%$#@!";

        String digits = ""; //12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars = ""; //!@#$%

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i); // ch:each character that we have in str

            if (ch >= '0' && ch <= '9') { //if the character is between '0' to '9' then it's digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') { // if the character is between 'A' to 'Z' then it's letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {// if the character is between 'a' to 'z' then it's letter
                letters += ch;
            } else { // if the character is neither digit nor letter, then it's special character
                specialChars += ch;
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

        System.out.println("***************" );
        String word = "ABCDEF12345ÆßÎÏĞÓÔ";

        String digits1 = "";
        String letters1 = "";
        String specialCharacters1 = "";


        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits1 += ch;

            } else if (ch >= 'A' && ch <= 'Z') {
                letters1 += ch;
            } else if(ch >= 'A' && ch <= 'Z'){
                letters1 += ch;
            }else{
                specialCharacters1 +=ch;
            }


            }
        System.out.println("digits1 = " + digits1);
        System.out.println("letters1 = " + letters1);
        System.out.println("specialCharacters1 = " + specialCharacters1);


        }
    }
