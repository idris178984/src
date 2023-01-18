package Day20_Practice;

public class Classmates {
    public static void main(String[] args) {
        String[]classmates={"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
        for(String each:classmates){
            String initials=each.charAt(0)+"-"+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
        }




    }
}
