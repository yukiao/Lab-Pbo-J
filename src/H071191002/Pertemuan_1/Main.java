// Untuk penamaan packagenya, kita mengikuti nama folder dari file tersebut yang berada di dalam folder src.
// Jadi dibawah ini contohnya berarti didalam folder src, file kita berada dalam folder H071191002/Pertemuan_1.
// Perhatikan bahwa nama folder tidak boleh mengandung karakter whitespace(contohnya spasi) sehingga untuk karakter spasi diganti dengan "_"
// Sebaiknya nama folder menggunakan huruf kecil semua namun khusus untuk bagian folder NIM dan Pertemuan, supaya lebih mudah dibaca maka kita menggunakan huruf kapital di kata pertamanya
package H071191002.Pertemuan_1;

import H071191002.Pertemuan_1.my_package.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Soon", 21);
        person.introduce();
    }
}
