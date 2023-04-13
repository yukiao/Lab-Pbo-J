public class Assignment_2_2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Attar");
        person.setAge(19);
        person.setGender(true);

        System.out.println("Nama: "+ person.getName());
        System.out.println("Umur: "+ person.getAge());
        System.out.println("Gender: "+ person.getGender());
    }
}
