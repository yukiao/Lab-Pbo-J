package H071221009.Pertemuan_2;

class Person {
    public String name; // 
    public int age; // attribute
    public boolean isMale;
    
    public void setName(String name) { // set utk menampung data pada variabel 
        this.name = name;
    }
    public String getName() { // getNamenya string
        return name; // get utk mengembalikan dan mengambil data pada variabel
    }
    public void setAge(int age) { 
        this.age = age;
    }
    public int getAge() { // getAge int
        return age;
    }
    public void setGender(boolean male) { //boolean male 
        this.isMale = male;
    }
    public String getGender() { // getGender string
        return isMale ? "Male" : "Female"; // jika true maka male/ jika false maka female
    }
    public static void main(String[] args) { // method main
        Person person = new Person(); // membuat objek
        person.setName("Lia");
        person.setAge(18); 
        person.setGender(false);

        System.out.println("Name   : " + person.getName());
        System.out.println("Age    : " + person.getAge());
        System.out.println("Gender : " + person.getGender());
    }
}