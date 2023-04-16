package H071221062.Pertemuan_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_4_4 {
    private static ArrayList<Assignment_4_2> listUser = new ArrayList<>();
    private static ArrayList<Assignment_4_1> listUserProfile = new ArrayList<>();
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
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            /*
             * TODO 555555555555555555555555555555555555
             * Buatlah sebuah perkondisian (IF) yang akan
             * Mengecek apakah user index ke i dari listUser memiliki username yang sama
             * dengan username yang
             * diinput.
             * Jika ada ganti userIndex dengan Index dari Assignment_4_2 Tersebut, kemudian
             * hentikan
             * perulangan
             */
            if (listUser.get(i).getUserName().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            /*
             * TODO 6666666666666666666666666666666666666666
             * Mengecek apakah password dari Assignment_4_2 yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */

            boolean isPasswordMatch = listUser.get(userIndex).getPasswsord().equals(password);

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                /*
                 * TODO
                 * panggil method showDetailUser dan kirimkan data Assignment_4_1 Assignment_4_2
                 * yang
                 * login7777777777777777777777777
                 * 
                 */
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
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
        /*
         * 111111111111111111111111111111111111111111111111111111111111111
         * TODO
         * Buatlah atau Instance objek Assignment_4_2 baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance Assignment_4_2
         */

        Assignment_4_2 user = new Assignment_4_2(username, password);

        /*
         * TODO 22222222222222222222222222222222222222222222222222222222
         * Buatlah atau Instance objek Assignment_4_1 baru
         */
        Assignment_4_1 assignment_4_1 = new Assignment_4_1();

        // Menginput Data Assignment_4_1
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

        /*
         * TODO 3333333333333333333333333333333333333
         * Berikan nilai fullName, age, dan hobby ke objek assignment_4_1 yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data assignment_4_1 yang
         * diinput sebelumnya
         */
        assignment_4_1.setFullName(fullName);
        assignment_4_1.setAge(age);
        assignment_4_1.setHobby(hobby);

        /*
         * 44444444444444444444444444444444444444444
         * TODO
         * Berikan nilai nickName ke objek assignment_4_1,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * Assignment_4_4, dengan mengirimkan fullName yang diinput sebelumnya
         */

        assignment_4_1.setNickName(Assignment_4_3.generateNickName(fullName));

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan assignment_4_1 user yang dibuat ke list assignment_4_1
        listUserProfile.add(assignment_4_1);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Assignment_4_1 assignment_4_1) {
        /*
         * TODO *
         * Tampilkan semua data assignment_4_1 user yang login
         * 88888888888888888888888888888
         */
        System.out.println("-".repeat(20));
        System.out.println("Selamat Datang di Welcome");
        System.out.println("-".repeat(20));
        System.out.println("Nama Lengkap : " + assignment_4_1.getFullName());
        System.out.println("Umur : " + assignment_4_1.getAge());
        System.out.println("Hobby : " + assignment_4_1.getHobby());
        System.out.println("Nickname : " + assignment_4_1.getNickName());
    }
}
