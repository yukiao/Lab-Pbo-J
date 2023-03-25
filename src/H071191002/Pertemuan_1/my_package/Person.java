// Nama package dibawah ini mengikuti nama folder dalam folder src
// Sehingga folder dari file ini adalah H071191002/Pertemuan_1/my_package
// Disini kita menggunakan huruf kecil untuk folder my_package untuk mengikuti best practice dari penamaan packagenya
// Lebih lanjut bisa dibaca komentar di file H071191002/Pertemuan_1/Main.java
package H071191002.Pertemuan_1.my_package;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name
        this.age = age
    }

    public void introduce() {
        System.out.printf("Hi\nMy name is %s\nI'm %d years old.", this.name, this.age);
    }

}
