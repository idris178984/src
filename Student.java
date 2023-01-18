import java.util.Arrays;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}

class StudentObjects{

    public static void main(String[] args) {

        DAY33_Static.Student student1 = new DAY33_Static.Student("Ahmet");

        DAY33_Static.Student student2 = new DAY33_Static.Student("Aygun", 'F');

        DAY33_Static.Student student3 = new DAY33_Static.Student("Nigara", 11);

        DAY33_Static.Student student4 = new DAY33_Static.Student("Mert", 12, 'A');

        DAY33_Static.Student student5 = new DAY33_Static.Student("Cihad", 'M', 28);

        DAY33_Static.Student student6 = new DAY33_Static.Student("Suhaib", 'M', 27, 15);

        DAY33_Static.Student student7= new DAY33_Static.Student("Ali",'M',42,30,'A');


        System.out.println(student1 == student2);


        DAY33_Static.Student[] students = { student1, student2, student3, student4, student5, student6, student7};


        System.out.println(Arrays.toString(students) );



    }
}

