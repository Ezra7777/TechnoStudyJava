package Day24_MultipleAttributes;

public class Person {

    String firstName="Techno";
    String lastName ="Study";
    int age =6;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name : " + person.firstName + " " + person.lastName);
//        System.out.println(person.firstName);
//        System.out.println(person.lastNam
        System.out.println(person.age);
    }

}
