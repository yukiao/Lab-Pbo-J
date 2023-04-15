package H071221078.Pertemuan_2;

public class Assignment_2_2 {
    public static void main(String[] args) {
        // instance object Person
        Person person = new Person();

        // pengisian nilai dari setiap atribut pada object person
        person.name = "Adnan";
        person.age = 18;
        person.isMale = true;

        // panggil/cetak data yang sudah dimasukkan sebelumnya
        System.out.println("Nama: "+ person.getName());
        System.out.println("Umur: "+ person.getAge());
        System.out.println("isMale: "+ person.getGender());
    }
}

class Person {
    public String name;
    public int age;
    public boolean isMale;

    // method setter dan getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean getGender() {
        return isMale;
    }
}