package H071221098.pertemuan_5;
public class MainAnggota {
    public static void main(String[] args) { //method yang dapat dipakai tanpa harus mendeklarasikan suatu class 
        PengurusInti pengurusInti = new PengurusInti("Ojan", 19, "Laki-Laki", "Ketua");
        System.out.println("Nama : " + pengurusInti.getName());
        System.out.println("Umur : " + pengurusInti.getAge());
        System.out.println("Gender : " + pengurusInti.getGender());
        System.out.println("Jabatan : " + pengurusInti.getJabatan());


        KordinatorBidangStaff koordinasiBidangStaff = new KordinatorBidangStaff("Sri", 19,"Wanita", "Humas");
        System.out.println("Nama : " + koordinasiBidangStaff.getName());
        System.out.println("Umur : " + koordinasiBidangStaff.getAge());
        System.out.println("Gender : " + koordinasiBidangStaff.getGender());
        System.out.println("Bidang : " + koordinasiBidangStaff.getBidang());
    }
}
