package H071221062.Pertemuan_2;

public class Assignment_2_4 { //MAIN CLASS PERSON
    public static void main(String[] args) {
        Assignment_2_3 person = new Assignment_2_3();
        person.setName(" Ahmad Fauzhan Ramadhan ");
        person.setAge(19);
        person.setIsMale(true);

        System.out.printf(" Name Saya     : %s\n ", person.getName());
        System.out.printf("Umur Saya     : %d\n ", person.getAge());
        System.out.printf("Jenis Kelamin : %s ", person.getIsMale() ? "Laki-Laki" : "Perempuan");

    }
}