package H071221038.Pertemuan_2;
// NO.2
// mendefinisikan class person 
class Person {
    //atribut
    public String name;
    public int age;
    public boolean isMale;
    
    // method setter dan getter untuk mengatur dan mengambil
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        if (isMale) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }
}

// class untuk memanggil class Person
public class Assignment_2_2 {
    // tempat untuk mengeksekusi program
    public static void main(String[] args) {
        // pemanggilan objek
        Person person = new Person();
        person.name = "Surya";
        person.age = 18;
        person.isMale = true;
        // memprint objek
        System.out.printf("Nama saya %s\n", person.getName());
        System.out.printf("Berumur %d tahun\n", person.getAge());
        System.out.printf("Jenis kelamin %s", person.getGender());
    }
}