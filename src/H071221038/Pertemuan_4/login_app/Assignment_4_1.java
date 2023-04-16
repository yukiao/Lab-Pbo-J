package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;

public class Assignment_4_1 {
    static ArrayList<User> listUser = new ArrayList<User>(); // menampung objek-objek dari kelas user
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>(); // menampung objek-objek dari kelas profile
    static Scanner sc = new Scanner(System.in); // membuat objek scanner untuk membuat inputan 
    // menggunakan keyword static agar dapat digunakan tanpa harus memanggil class nya, sehingga dapat membuat objek tanpa instance class 
    public static void main(String[] args) {
        // memanggil method run app
        runApp();
    }
    private static void runApp() {
        System.out.println("------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");
        
        //menginput pilihan menu
        String selectMenu = sc.nextLine(); // inputan proses berupa string 
        switch (selectMenu) {
            case "1": //membuka halam login
                ShowLoginMenu();
                break;
            case "2": // membuka halaman register dan pembuatan user baru
                Register();
                break;
            default: // jika inputantidak valid maka akan memanggil kembali method run app
                System.out.println("Input tidak valid!");
                runApp();
                break; 
        }
    }

    private static void ShowLoginMenu() {
        // Halaman Login
        System.out.println("------------------------");
        System.out.println("Login");
        // Menginput username untuk disimpan di atribut username
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.nextLine();

        if (username == "") {
            System.out.println("Username kosong");
            runApp();
        }

        // Menginput password untuk disimpan di atribut password
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        // Membuat perkondisian untuk mencari username, kondisi jika nilai user kosong, maka akan diminta input ulang
        User user = findUserByUsername(username); // untuk mencari user melalui username yang diinput
        if (user == null) { // jika user yang didapatkan kosong, artinya tidak mendapatkan user yang cocok 
            System.out.println("Akun belum terdaftar");
            runApp();
        } else {
            /* Todo:
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */
            boolean isPasswordMatch = user.getPassword().equals(password);  
            //equals untuk membandingkan password yang sudah tersimpan dengan password yang diinput , 
            //jika password cocok maka user berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");  
                /*
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 * 
                 */
                showDetailUser(findProfileByUsername(username));
                runApp();
            } else {
                //kondisi jika password tdk memenuhi syarat akan diminta input ulang dengan method login
                System.out.println("------------------------");
                System.out.println("Password salah");
                System.out.println("------------------------");
                ShowLoginMenu();
            }
        }
    }
        /* Todo:
        * Buatlah sebuah perkondisian (IF) yang akan
        * Mengecek apakah user index ke i dari listUser memiliki username yang sama
        * dengan username yang
        * diinput.
        * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
        * perulangan
          */

    //method untuk mengecek apakah username terdapat didalam listuser
    private static User findUserByUsername(String username) { 
        for (User user : listUser) { // perulangan yang akan meloop semua elemen objek User di dalam listUser menggunakan for-each loop
            //jika memenuhi syarat maka objek user akan dikembalikan
            if (user.getUserName().equals(username)) { // statement kondisional yang akan dievaluasi jika nama pengguna user sama dengan username yang diberikan sebagai argumen
                return user;
            }
        }
        return null; //jika tidak maka akan dikembalikan nilai null atau kosong
        // harus dikembalikan agar metodenya berjalan, jika tidak ada maka metode tidak akan berjalan
    }
    //method untuk mengecek apakah profile terdapat didalam listprofile
    private static Profile findProfileByUsername(String username) {
        //jika memenuhi syarat maka objek profil akan dikembalikan
        for (Profile profile : listUserProfile) { // perulangan yang akan meloop semua elemen objek Profile di dalam listUserProfile menggunakan for-each loop
            if (profile.getUser().getUserName().equals(username)) { //  statement kondisional yang akan dievaluasi jika username pengguna yang terkait dengan objek Profile sama dengan username yang diberikan sebagai argumen
                return profile;
            }
        }
        //jika tidak maka akan dikembalikan nilai null atau kosong
        return null;
    }

    //method untuk register 
    private static void Register() {
        System.out.println("------------------------");
        System.out.println("REGISTER");
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

        // mendeklarasikan nilai username dan password dengan string kosong utk pengisian inputan
        String username = "";
        String password = "";
        //validasi input username dan password
        System.out.println("Username");
        System.out.print("> ");
        username = sc.nextLine();
        while (username.equals("") || password.equals("")) { // perulangan while yang akan terus meminta penginputan sampai semuanya valid
            //kondisi jika input username kosong 
            if (username.equals("")) {
                System.out.println("Username tidak boleh kosong");

                System.out.println("Username"); // input username ulang
                System.out.print("> ");
                username = sc.nextLine();

                continue; //kembali keawal loop untuk melakukan validasi
            }
            //kondisi jika username sudah digunakan
            if (isUsernameExist(username)) {
                System.out.println("Username telah digunakan");

                System.out.println("Username");
                System.out.print("> ");
                username = sc.nextLine();

                continue; //kembali keawal loop untuk melakukan validasi
            }
            
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();

            if (isPasswordExist(password)){
                System.out.println("Password telah digunakan");
                password = ""; // agar diminta mengisi ulang password  
                continue; //kembali keawal loop untuk melakukan validasi
            }
            if (password.length() < 8) {
                System.out.println("Password harus lebih dari 8 karakter!");
                password = "";//mengosongkan kembali nilai variabel password
            }
        }
        /* Todo:
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User(); //instance objek user baru
        user.setUserName(username);
        user.setPassword(password);

        /* Todo:
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile(fullName, age, hobby); //instance objek profile baru
        
        /* Todo:
        * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
        * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
        * diinput sebelumnya
        */
        // untuk mengisi user yang ada di class profile
        profile.setUser(user);
        //menambahkan profile yang dibuat ke listUserprofile
        listUserProfile.add(profile);
        //menambahkan user yang dibuat ke listUser
        listUser.add(user);
        System.out.println();
        System.out.println("Berhasil Membuat User Baru!!");


        /* Todo:
         * Tampilkan semua data profile user yang login
         */
        // showDetailUser(profile);
        runApp();
    }
    //method untuk akun baru yang memiliki username yang sudah digunakan
    private static boolean isUsernameExist(String username) {
        for (User user : listUser) { // perulangan yang akan meloop semua elemen objek User di dalam listUser menggunakan for-each loop
            if (user.getUserName().equals(username)) { // statement kondisional yang akan dievaluasi jika username pengguna user sama dengan username yang diberikan sebagai argumen
                return true;
            }
        }
        return false;
    }
    private static boolean isPasswordExist(String password){
        for (User user : listUser){ // perulangan yang akan meloop semua elemen objek User di dalam listUser menggunakan for-each loop
            if(user.getPassword().equals(password)){ // statement kondisional yang akan dievaluasi jika password pengguna user sama dengan password yang diberikan sebagai argumen
                return true;
            }
        }
        return false;
    }
    //method untuk menampilkan detail user yang sudah diset
    private static void showDetailUser(Profile profile) {
        System.out.println("-----------------------------");
        System.out.println("SELAMAT DATANG !! ");
        System.out.println("-----------------------------");
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Usia\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("-----------------------------");
    }
}