package H071221098.pertemuan_2;
class Person {
    public String name; //atribut 
    public int age;
    public boolean isMale; 

    public void setName (String name){    //memthodd set name digunakan untuk mengatur nilai dari atribut name
        this.name = name; 
    }
    public String getName () { //untuk mendapatkan nilai dari atribut name
        return name;
    }
    public void setAge (int age) {  //method setage digunakan untuk mengatur nilai dari atribut age
        this.age = age; 
    }
    public int getAge () { //untuk mendapatkan nilai dari atribut age 
        return age;
    }
    public void setGender (String gender) {   //digunakan u/mengatur jenis kelamin dengan menerima parameter sebuah string gender 
        this.isMale = gender == "male";  //mengubah nilai ismale menjadi true jika gender sm dengan male san false jika tidak
    }
    public String getGender (){  //mendapatkan nilai jenis kelamin dalam bentung string dengan memeriksa nilai atribut isMale
        if (isMale) {
            return "male";
        }
        else {
            return "female";
        }

    }
}

public class Assignment_2_2{
    public static void main(String[] args) {
        Person orang = new Person ();
        orang.setName("Ojan");
        orang.setAge(19);
        orang.setGender("male");

        System.out.println("Nama: " + orang.getName());
        System.out.println("Umur: " + orang.getAge());
        System.out.println("Jenis kelamin: " + orang.getGender());
    }
}

