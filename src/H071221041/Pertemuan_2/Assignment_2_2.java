package H071221041.Pertemuan_2;
class Person {
    //atribut
    public String name;
    public int age;
    public boolean isMale;

    //konstruktor utk mnginisialisai atribut
    public Person(String nama, int umur, boolean gender) {
        name = nama;
        age = umur;
        isMale = gender;
    }

    //method utk menampung nilai nama
    public void setName(String nama) {
        name = nama;
    }

    //method utk mndapatkan nilai nama
    public String getName() {
        return name;
    }

    //method utk menampung nilai umur
    public void setAge(int umur) {
        age = umur;
    }

    //method utk mndpatkan nilai umur
    public int getAge() {
        return age;
    }

    //method utk menampung nilai gender
    public void setGender(boolean lakilaki) {
        isMale = lakilaki;
    }

    //method utk mndptkan nilai gender
    public String getGender() {
        return isMale ? "Male" : "Female";
    }
    public static void main(String[] args) {
        Person tambahNilai = new Person ("Muthia", 19, false);
        tambahNilai.setName("Muthia");
        tambahNilai.setAge(19);
        tambahNilai.setGender(false);
        System.out.println("Nama: " + tambahNilai.getName());
        System.out.println("Umur: " + tambahNilai.getAge());
        System.out.println("Gender: " + tambahNilai.getGender());

    }
}
