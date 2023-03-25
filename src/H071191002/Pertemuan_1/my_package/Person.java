package H071191002.Pertemuan_1.my_package;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("Hi\nMy name is %s\nI'm %d years old.", this.name, this.age);
    }

}
