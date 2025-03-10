package Jobsheet3;
import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahDosen = 3; // Sesuai dengan gambar, ada 3 data dosen
        Dosen04[] daftarDosen = new Dosen04[jumlahDosen];

        // Input data dosen menggunakan loop for
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l'); // Pria jika 'L', Wanita jika 'P'
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); // Membuang newline
            System.out.println("----------------------------------");

            // Menambahkan objek ke dalam array
            daftarDosen[i] = new Dosen04(kode, nama, jenisKelamin, usia);
        }

        // Menampilkan data dosen menggunakan loop foreach
        for (Dosen04 dosen : daftarDosen) {
            dosen.tampilkanInfo();
        }
    
    }
}

