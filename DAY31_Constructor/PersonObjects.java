package DAY31_Constructor;

public class PersonObjects {
    public static void main(String[] args) {

       Person person1=new Person("Daniel",'F',19);

        Person person2 = new Person("Ksenita", 'F', 28);

        person2.age = 30;

        System.out.println(person1);
        System.out.println(person2);




    }

}
