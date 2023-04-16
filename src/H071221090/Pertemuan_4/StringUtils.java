package H071221090.Pertemuan_4;

public class StringUtils {
    /*
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static String getNickName(String fullName){
        String[] fullNameSplit = fullName.split(" ");
        if (fullNameSplit.length == 1){
            return fullName;                       
        }else {
            return fullNameSplit[1];
        }
    }
}