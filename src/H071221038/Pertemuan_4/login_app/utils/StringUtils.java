package login_app.utils;

public class StringUtils {
    /* Todo:
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static  String getNickName(String fullName) {
        String[] names = fullName.split(" "); // untuk memecah string menjadi beberapa bagian dengan menggunakan karakter spasi 
        if (names.length == 1) {   // jika panjang array nya sama dengan 1 maka akan mengembalikan nilai fullname sebagai nickname
            return fullName;
        } else {
            return names[1]; // jika tidak memenuhi kondisi diatas maka akan mengembalikan nilai elemen ke-2 (indeks ke-1) sebagai nickname.
        }
    }
}