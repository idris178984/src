package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//3
        numbers.add(40);//5
        numbers.add(2,29);//2
        numbers.add(4,35);//4


        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex= numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        Integer numbers1= numbers.get(2);
        System.out.println("numbers1 = " + numbers1);
        //System.out.println(numbers.get(2));

        System.out.println("*****************");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

            System.out.println("*****************");

            ArrayList<String> str=new ArrayList<>();

            str.add("java");
            str.add("python");
            str.add("java");
            str.add("C#");
            str.add("Ruby");

            str.set(2,"idris");//set==replace
            System.out.println(str);

        }
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove( employees.size() -1 );

        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");//non primitive, choose the object

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");

        System.out.println(employees);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);




    }
}
