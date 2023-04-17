class Employee {
    String name;
    int id;
    String position;
    int age; 
    int salery;

    public Employee() {
        
    }

    public Employee(String name, int id, String position, int age, int salery) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.age = age;
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }    

    public void displayInfo() {
        System.out.println("\nNama = " + getName());
        System.out.println("Nomor id = " + getId());
        System.out.println("Jabatan = " + getPosition());
        System.out.println("Umur = " + getAge());
        System.out.println("Gaji = " + getSalery());
    }
}

class SelfUtils {
    public static void displaySelfData() {
        System.out.println("\nSurya Agus");
        System.out.println("H071221038");
    }
}


public class Assignment_5_4 {
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        employee.setName("Surya");
        employee.setId(321);
        employee.setPosition("Cyber security");
        employee.setAge(20);
        employee.setSalery(10000000);
        employee.displayInfo();
        
        Employee employee2 = new Employee("Surya", 123, "Web developer", 18, 6000000);
        employee2.displayInfo();
        
        SelfUtils.displaySelfData();
    }
}
