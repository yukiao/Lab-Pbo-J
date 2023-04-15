package H071221009.Pertemuan_4.login_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_4_1 {

    static ArrayList<User> listUser = new ArrayList<User>(); // untuk menampung objek-objek dari kelas user
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>(); // untuk menampung objek-objek dari kelas profile
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //memenaggil method run app
        runApp();
    }

    private static void runApp() {
        System.out.println("-".repeat(25));
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-".repeat(25));
        System.out.println("1. Login");
        System.out.println("2. Register"); // behavior runApp
        System.out.println("3. Exit");
        System.out.println("-".repeat(25));
        System.out.print("> ");
        

        // menginput pilihan
        String selectMenu = sc.nextLine();
        switch (selectMenu) {
            case "1":
            //membuka halaman login
                login();
                break;
            case "2":
            // membuka halaman register dan pembuatan user baru
                createNewUser();
                break;
            case "3":
            // untuk keluar dari halaman
                System.out.println("-".repeat(25));
                System.out.println("Sampai jumpa lagi!");
                System.out.println("-".repeat(25));
                System.exit(0);
                break;
            default:
            // jika inputan tidak valid maka akan memanggil halaman utama kembali
                System.out.println("Inputan tidak valid!");
                runApp();
                break;
        }
    }

    private static void login() { // untuk halaman login
        System.out.println("-".repeat(25));
        System.out.println("Login");
        // menginput username untuk disimpan di atribut username
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        // menginput password untuk disimpan di atribut password
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = findUserByUsername(username);
        // jika nilai user kosong, maka akan diminta inputan ulang
        if (user == null) {
            System.out.println("Username tidak ditemukan!");
            login();
        } else {

            /* TODO
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */

            boolean isPasswordMatch = user.getPassword().equals(password);
            // jika password cocok  maka user berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                
                /* TODO
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 * 
                 */

                showDetailUser(findProfileByUsername(username));
                runApp();
            } else {
                // kondisi jika password tdk memenuhi syarat akan diminta input ulang dengan method login
                System.out.println("-".repeat(25));
                System.out.println("Password salah!");
                System.out.println("-".repeat(25));
                login();
            }
        }
    }
        /* TODO
        * Buatlah sebuah perkondisian (IF) yang akan
        * Mengecek apakah user index ke i dari listUser memiliki username yang sama
        * dengan username yang
        * diinput.
        * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
        * perulangan
          */
    // method static untuk mengecek apakah nilai username dari objek user dari User sama dengan nilai username argumen method
    private static User findUserByUsername(String username) {
        // jika memenuhi syarat maka objek user akan direturn
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    // method static untuk mengecek apakah nilai username dari objek user (profile) sama dengan nilai username argumen method
    private static Profile findProfileByUsername(String username) {
        // jika memenuhi syarat maka objek profil akan dikembalikan
        for (Profile profile : listUserProfile) {
            if (profile.getUser().getUsername().equals(username)) {
                return profile;
            }
        }
        // jika tidak maka akan dikembalikan nilai null
        return null;
    }

    // method untuk membuat user baru
    private static void createNewUser() {
        System.out.println("REGISTER");
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = validateIntegerInput();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        String username = "";
        String password = "";
        // validasi input username dan password
        while (username.equals("") || password.equals("")) {//akan terus meminta penginputan sapai semuanya valid
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            // perkondisian jika input username kosong 
            if (username.equals("")) {
                System.out.println("Username tidak boleh kosong!");
                continue;//kembali keawal loop untuk melakukan validasi
            }
            // perkondisian jika username sudah digunakan
            if (isUsernameExist(username)) {
                System.out.println("Username sudah digunakan!");
                username = "";
                continue; // kembali keawal perulangan untuk melakukan validasi
            }
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            // perkondisian untuk menghandle jika panjang karakter password kurang dari 8 karakter
            if (password.length() < 8) {
                System.out.println("Password harus lebih dari 8 karakter!");
                password = ""; // mengosongkan kembali nilai variabel password
            }
        }

        /* TODO
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User(); // instance objek user baru
        user.setUsername(username);
        user.setPassword(password);

        /* TODO
         * Buatlah atau Instance objek Profile baru
         */

        /* TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        Profile profile = new Profile(fullName, age, hobby); // instance objek profile baru
        profile.setUser(user);
        // menambahkan profile yang dibuat ke listUserprofile
        listUserProfile.add(profile);
        // menambahkan user yang dibuat ke listUser
        listUser.add(user);
        System.out.println("-".repeat(25));
        System.out.println("Berhasil Membuat User Baru!");

        /* TODO
         * Tampilkan semua data profile user yang login
         */
        runApp();
    }

    // method untuk akun baru yang memiliki username yang sudah digunakan
    private static boolean isUsernameExist(String username) {
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // method untuk menampilkan detail user
    private static void showDetailUser(Profile profile) {
        System.out.println("-".repeat(25));
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-".repeat(25));
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Umur\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("-".repeat(25));
    }

    // method yang mengharuskan inputan harus berupa integer
    private static int validateIntegerInput() {
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                result = Integer.parseInt(sc.nextLine());
                isValid = true;
            } catch (Exception e) {
                System.out.println("Inputan harus berupa angka!");
                System.out.print("> ");
            }
        }
        return result;
    }
}