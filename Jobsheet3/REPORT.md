|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020241|
| Nama |  Andy Otani Dipo Yudho |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/andyotani/ALSD/tree/main/Jobsheet3) |

# Labs #1 Programming Fundamentals Review
# JOBSHEET 3 - ARRAY OF OBJECTS

## Percobaan 1 - Membuat Array dari Object, Mengisi dan Menampilkan

...

![Screenshot](img/img1.png)
### 3.2.3 **Jawaban Pertanyaan**
1. Tidak harus. Suatu class yang digunakan dalam array of objects minimal harus memiliki atribut untuk menyimpan data. Namun, memiliki method bersifat opsional. Method diperlukan  jika kita ingin memberikan fungsi tambahan seperti menampilkan data, melakukan perhitungan, atau validasi.
2. Kode tersebut mendeklarasikan sebuah array bernama arrayOfMahasiswa yang dapat menampung 3 objek dari class Mahasiswa. Namun, array ini belum berisi objek secara langsung, hanya menyiapkan tempat untuk tiga objek Mahasiswa.
3. Class `Mahasiswa04` tidak memiliki konstruktor eksplisit yang didefinisikan oleh programmer. Namun, Java secara otomatis menyediakan konstruktor default jika tidak ada konstruktor yang didefinisikan. Konstruktor default ini hanya menginisialisasi objek tanpa melakukan apa pun.
4. - Membuat objek Mahasiswa baru pada indeks 0 dalam array.
- Mengisi atribut objek tersebut dengan data seperti NIM, Nama, Kelas, dan IPK.
- Setelah dieksekusi, objek Mahasiswa pertama dalam array akan berisi data mahasiswa dengan nama "AGNES TITANIA KINANTI".
5. Class `Mahasiswa04` hanya digunakan untuk mendefinisikan atribut dan struktur data mahasiswa.
Class `MahasiswaDemo04` bertindak sebagai driver class yang menjalankan program utama (main) untuk membuat array objek Mahasiswa04, mengisi data, dan menampilkannya.
Pemisahan ini memudahkan pemeliharaan kode serta mengikuti konsep pemrograman berorientasi objek (OOP) yang baik.


## Percobaan 2 - Menerima Input Isian Array Menggunakan Looping

### 3.2.2 Verifikasi Hasil Percobaan 
![Screenshot](img/img2.png)

### 3.3.3 **Jawaban Pertanyaan**
1. Method ini bertujuan untuk mencetak informasi mahasiswa tanpa perlu memanggil System.out.println berulang kali di main.
    ```java
    void cetakInfo() {
            System.out.println("NIM : " + this.nim);
            System.out.println("Nama : " + this.name);
            System.out.println("Kelas : " + this.kelas);
            System.out.println("IPK : " + this.ipk);
        }
    ```
    ```java
    for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke -" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    ```

2. Kode tersebut menyebabkan error karena meskipun array `myArrayOfMahasiswa` telah dideklarasikan dengan `new Mahasiswa[3]`, elemen-elemen dalam array tersebut belum diinisialisasi sebagai objek Mahasiswa. 
```java
Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3];

```
Kode ini hanya membuat array yang dapat menampung 3 objek Mahasiswa, tetapi belum membuat objek Mahasiswa itu sendiri. Jadi, semua elemen array masih null.

##  Percobaan 3 - Constructor Berparameter

...
### 3.4.2 Verifikasi Hasil Percobaan 

![Screenshot](img/img3.png)

**Jawaban Pertanyaan**
1. Ya, suatu class dapat memiliki lebih dari satu constructor. Ini disebut constructor overloading, di mana sebuah class memiliki beberapa constructor dengan parameter yang berbeda.
    ``
    public class Matakuliah04 {
    String kode, nama;
    int sks, jumlahJam;

    // Constructor 1 (tanpa parameter)
    public Matakuliah04() {
        this.kode = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Constructor 2 (dengan parameter)
    public Matakuliah04(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}

    ``
2. Method tambahData() telah ditambahkan di dalam class Matakuliah04 untuk menerima input dari user.
3. Method cetakInfo() telah ditambahkan untuk mencetak informasi mata kuliah
4. Modifikasi jumlah elemen sesuai input


# Tugas
## 1. 
...
![Screenshot](img/img4.png)

**Penjelasan Kode:**
1. **Mendeklarasikan variabel untuk menyimpan data dosen:**  
   Kelas `Dosen04` memiliki atribut `kode`, `nama`, `jenisKelamin` (Boolean), dan `usia` untuk menyimpan informasi dosen. Scanner `sc` juga dideklarasikan untuk menerima input dari pengguna.

2. **Membuat konstruktor untuk inisialisasi data:**  
   - Konstruktor default `Dosen04()` dibuat tanpa parameter.  
   - Konstruktor `Dosen04(String kode, String nama, Boolean jenisKelamin, int usia)` digunakan untuk langsung menginisialisasi data dosen saat objek dibuat.

3. **Menambahkan data dosen melalui metode `tambahData()`:**  
   - Pengguna diminta memasukkan `kode`, `nama`, `jenisKelamin`, dan `usia`.  
   - Input `jenisKelamin` divalidasi agar hanya menerima "pria" atau "wanita".  
   - Jika input "pria", maka `jenisKelamin = true`; jika "wanita", maka `jenisKelamin = false`.

4. **Mencetak informasi dosen dengan metode `cetakInfo()`:**  
   - Data yang telah disimpan akan ditampilkan.  
   - `jenisKelamin` yang berupa Boolean dikonversi menjadi string "Pria" atau "Wanita". 

## 2. 
...

![Screenshot](img/img5.png)

**Penjelasan Kode:**
1. **Dosen04 (Template Data Dosen)**
 Ini adalah kelas yang mendefinisikan struktur data untuk setiap dosen, termasuk kode, nama, jenis kelamin (boolean), dan usia. Ia juga memiliki metode untuk menambahkan data dosen melalui input pengguna `(tambahData())` dan mencetak informasi detail dosen `(cetakInfo())`. Terdapat dua jenis konstruktor: satu tanpa parameter dan satu lagi dengan parameter untuk inisialisasi langsung.

2. **DataDosen04 (Pengelola Data Dosen)**
 Kelas ini bertanggung jawab untuk mengelola kumpulan objek Dosen04 (dalam bentuk array). Ini memiliki metode untuk menampilkan data semua dosen `(dataSemuaDosen())`, menghitung jumlah dosen pria dan wanita `(jumlahDosenPerJenisKelamin())`, menghitung rata-rata usia berdasarkan jenis kelamin `(rerataUsiaDosenPerJenisKelamin())`, serta menemukan dan menampilkan informasi dosen tertua `(infoDosenPalingTua())` dan termuda `(infoDosenPalingMuda())`.

3. **DosenDemo04 (Program Utama / Eksekusi)**
 Kelas ini berisi metode main yang merupakan titik awal eksekusi program. Di sini, program meminta pengguna untuk memasukkan jumlah dosen yang akan diinput.

4. **Input Data Dosen Dinamis**
 Program menggunakan Scanner untuk memungkinkan pengguna menentukan jumlah dosen yang ingin diinput. Kemudian, dalam sebuah loop, program akan membuat objek Dosen04 sebanyak jumlah yang diminta dan meminta pengguna untuk mengisi data setiap dosen melalui metode `tambahData()`.

5. **Analisis dan Output Data**
 Setelah semua data dosen diinput, program membuat objek DataDosen04 yang berisi array dosen. Selanjutnya, program memanggil berbagai metode dari objek DataDosen04 tersebut untuk menampilkan semua data dosen, jumlah dosen per jenis kelamin, rata-rata usia, serta informasi dosen tertua dan termuda.