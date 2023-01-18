package day14_String;

public class StringMethods {
    public static void main(String[] args) {

        String str="    batch 25    ";
        str.trim();// "batch 25"
        System.out.println(str);

        String str2= "Cydeo school";
        int n1= str2.indexOf("h");
        System.out.println("n1 = " + n1);
        
        int n2= str2.indexOf("ol");
        System.out.println("n2 = " + n2); 
        
        String str3= "Java programing language";
        int n3= str3.indexOf("am");
        System.out.println("n3 = " + n3);
        
        int n4 = str2.lastIndexOf("g");
        System.out.println("n4 = " + n4);

        System.out.println("-----------");
        String s= "Java Nova Cava Wawa orange";
        int firsA= s.indexOf("a");
        int lastA=s.lastIndexOf("a");

        System.out.println("firsA = " + firsA);
        System.out.println("lastA = " + lastA);

        




    }
}
