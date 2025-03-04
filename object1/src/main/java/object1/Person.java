package object1;

public class Person {
    String name;
    int age = 0;
    int height = 0; //height in centimeters

    public Person (String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String [] args) {
        Person person1 = new Person("John", 30, 65);

    }

    Person[] people = new Person[10];

    Person person1 = new Person("Alice", 25, 130);
    Person person2 = new Person("Bob", 30, 140);

    people[0] = person1;
    people[1] = person2;

    Person person = people[0];

}
