package DAY36_Inheritance.Encapsulation;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 29, 'M', 'D', "MIT");
        student1.setAge(39);//because of set, we can change age... can change o lot of times
        System.out.println(student1);

    }

}
