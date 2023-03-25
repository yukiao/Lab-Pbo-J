# Lab-Pbo-J
Repository tempat pengumpulan tugas untuk Praktikan Asistensi J Lab OOP Sistem Informasi 2022

## Aturan Pengumpulan
**Note:**  
_Untuk perintah yang dibungkus < > maka perintah tersebut diganti sesuai instruksi yang ada dalam tanda < > tersebut. Contohnya `mkdir <NIM>` menjadi `mkdir H071191002`_
- Silahkan fork repositori ini
- Lakukan clone terhadap hasil fork repository ini ke komputer kalian
  ```
  git clone <url-repositori-hasil-fork>
  ```
- Pindah ke repositori hasil clone dengan perintah berikut
  ```
  cd Lab-Pbo-J
  ```
- Pindah ke branch NIM kalian serta gunakan branch tersebut untuk menyimpan kode dari soal yang dikerjakan
  ```
  git checkout <NIM>
  ```
- Buat folder baru berdasarkan NIM kalian di dalam folder `src`
  ```
  cd src
  mkdir <NIM>
  ```
- Di dalam folder NIM kalian buat folder dengan nama "Pertemuan_<_no_pertemuan_>" tanpa tanda kutip. contoh: Pertemuan_1
- Di dalam folder pertemuan tersebut, kalian menambahkan file tugas praktikum yang telah kalian kerjakan dengan format nama file "Assignment_<_no pertemuan_>_<_no_soal_>.java" tanpa tanda kutip. Contoh: Assignment_1_1.java
- Perhatikan bahwa disetiap filenya kalian harus menambahkan packagenya di awal file tersebut. Dimana nama package nantinya harus sesuai dengan folder dimana file tersebut berada di dalma folder `src`.
Contoh:
```
package H071191002.Pertemuan_1

public class Main{
  ....
  ...
}
```
berarti file di atas berada di folder `src/H071191002/Pertemuan_1`. Untuk contoh detailnya bisa dilihat di file `src/H071191002/Pertemuan_1/Main.java` dan `src/H071191002/Pertemuan_1/my_package/Person.java`
- Setelah semua file tugas telah diselesaikan dan telah diasistensikan lakukan perintah berikut
  ```
  git add .
  git commit -m "<pesan commit>"
  git push origin <NIM>
  ```
  Note:
  Pesan commit yang dibuat diharapkan sesuai dengan hal yang dilakukan. Seperti "menambah tugas praktikum ..." atau "memperbaiki type di file ..."
- Setelah perintah tersebut berhasil, silahkan membuka repository hasil fork kalian di github dan lakukan pull request ke repository ini.
- Pastikan base branch sama dengan branch NIM kalian
![panduan pull request](https://i.ibb.co/XtWGrS6/Panduan-pull-request.png)
- Apabila terdapat kesulitan, silahkan menghubungi asistennya
