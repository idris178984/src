package DAY10_NestedIf;

public class GradeTask1 {

    public static void main(String[] args) {

        char grade = 'A';

        boolean validGrade = (grade >= 'A' && grade <= 'D') || grade == 'F';

        String result = "";

        if(validGrade){

            if(grade == 'A'){
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            }else if (grade == 'C') {
                result = "Good";
            }else if (grade == 'D') {
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid Grade";
        }

        System.out.println(grade);
        System.out.println(result);

    }
}
