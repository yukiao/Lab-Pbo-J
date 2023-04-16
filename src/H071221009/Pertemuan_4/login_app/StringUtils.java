package H071221009.Pertemuan_4.login_app;

    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] name = fullName.split(" ");
        if (name.length == 1) {
            return fullName;
        } else {
            return name[1];
        }
    }

}