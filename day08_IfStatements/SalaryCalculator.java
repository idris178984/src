package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

     int hourlyRate = 50;
     int weeklyRate = 45;
     double stateTaxRate =6.5,
             federalTaxRate = 26.2;

     int salaryBeforeTax= hourlyRate*weeklyRate*52;
     double stateTax= salaryBeforeTax*stateTaxRate/100;
     double federalTax= salaryBeforeTax*federalTaxRate/100;
     double totalTax = federalTax + stateTax;


        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax is : $" + stateTax);
        System.out.println("Federal tax is : $"+ federalTax);
        System.out.println("Total tax is : $" + totalTax);




     // int hourlyRate =50
     //     weeklyRate =45 this is option






    }
}
