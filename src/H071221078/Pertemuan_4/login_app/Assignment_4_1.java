package H071221078.Pertemuan_4.login_app;

import java.util.Scanner;
import java.util.ArrayList; 
import H071221078.Pertemuan_4.login_app.models.Profile;
import H071221078.Pertemuan_4.login_app.models.User;
import H071221078.Pertemuan_4.login_app.utils.StringUtils;

public class Assignment_4_1 {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        try {
            int selectMenu = sc.nextInt();
            sc.nextLine();
            switch (selectMenu) {
                case 1:
                    // Membuka Halaman Login
                    showLoginMenu();
                    break;
                case 2:
                    // Membuka Halaman Register
                    showRegisterMenu();
                default:
                    // Mengulang Pemanggilan Menu Utama
                    runApp();
            }
        } catch (Exception e) {
            System.out.println("Hanya dapat memasukkan pilihan berupa angka");
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.nextLine();

        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) { 
            // Mengecek apakah user index ke i dari listUser memiliki username yang sama dengan username yang diinput.
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            while (true) {
                System.out.println("Password");
                System.out.print("> ");
                String password = sc.next();
                
                boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password); // mengecek kesamaan pasword yang diinput
                // Jika passwordnya sama maka berhasil login
                if (isPasswordMatch) {
                    System.out.println("Berhasil Login"); 
                    showDetailUser(listUserProfile.get(userIndex)); //panggil method showDetailUser dan kirimkan data Profile User yang login
                    System.exit(0);
                    break;
                } else {
                    // saat password salah akan menampikan password salah
                    System.out.println("Password Salah, coba ulang");
                }
            }
        } else {
            System.out.println("Username yang dimasukkan belum terdaftar, pastikan username yang anda masukkan benar atau register terlebih dahulu.");
            runApp();
        } 
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        User user = new User(username, password); // Instance objek User baru, dan tambahkan username dan password yang diinput sebelumnya secara langsung
  
        Profile profile = new Profile(); // instance objek User baru

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        // Memasukkan nilai fullName, age, dan hobby yg diinput ke objek profile yang telah di Instance sebelumnya.
        profile.setFullname(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        // Memasukkan nilai fullname yang diinput ke nickName pada objek profile,dengan menggunakan static method yang dibuat di class StringUtils

        profile.setNickname(StringUtils.nickname(fullName));

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        // Menampilkan semua data profile user yang login
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap    : " + profile.getFullname());
        System.out.println("Nama Panggilan  : " + profile.getNickname());
        System.out.println("Umur            : "+ profile.getAge());
        System.out.println("Hobby           : "+ profile.getHobby());
    }
}