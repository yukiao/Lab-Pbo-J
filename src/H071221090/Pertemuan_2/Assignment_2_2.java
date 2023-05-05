package H071221090.Pertemuan_2;

class Assignment_2_2 {
    public String name; //pke public krena di soalnya pke +
    public int age;
    public boolean isMale;

    //construktor
    public Assignment_2_2(String nama, int umur, boolean gender) {
        name = nama;
        age = umur;
        isMale = gender;
    }

    public void setName(String nama) {
        name = nama;
    }

    public String getName() {
        return name;
    }

    public void setAge(int umur) {
        age = umur;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean lakilaki) {
        isMale = lakilaki;
    }

    public String getGender() {
        return isMale ? "Male" : "Female";
    }
    public static void main(String[] args) {
        Assignment_2_2 Data_diri = new Assignment_2_2 ("Nabilah", 18, false);
        Data_diri.setName("Nabilah");
        Data_diri.setAge(18);
        Data_diri.setGender(false);
        System.out.println("Nama: " + Data_diri.getName());
        System.out.println("Umur: " + Data_diri.getAge());
        System.out.println("Gender: " + Data_diri.getGender());

    }
}

