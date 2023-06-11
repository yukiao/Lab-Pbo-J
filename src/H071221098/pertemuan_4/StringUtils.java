package H071221098.pertemuan_4;
public class StringUtils {
    public static String generateNickname(String fullName){ //generateNickname digunakan untuk mengambil nama panggilan dari sebuah nama lengkap
        String[] nameParts = fullName.split(" "); //memecah fullname menjadi beberapa bagian menggunakan split dan memasukkannya ke dalam array nameparts

        if (nameParts.length ==1) {  //memeriksa apakah hanya memiliki satu elemen
            return fullName; //jika iya maka fullName tersebut sudah merupakan sebuah nickname sehingga method akan mengembalikan fullName 
        }else{
            return nameParts[1]; //jika tidak, maka method akan mengambil elemen kedua dari nameParts (indeks 1) yang seharusnya merupakan nama belakang, lalu mengembalikannya sebagai nickname.
        }
    }

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
}

