package Jobsheet3;
import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args, Object DataDosenMain04) {
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
                System.out.print("Jenis Kelamin (L/P): ");
                char jk = sc.next().charAt(0);
                boolean jenisKelamin = (jk == 'L' || jk == 'l'); // Pria jika 'L', Wanita jika 'P'
                System.out.print("Usia          : ");
                int usia = sc.nextInt();
                sc.nextLine(); // Membuang newline
                System.out.println("----------------------------------");
    
                // Menambahkan objek ke dalam array
                daftarDosen[i] = new Dosen04(kode, nama, jenisKelamin, usia);
            }
    
            // Memanggil method dari DataDosen
            System.out.println("\n=== Data Semua Dosen ===");
            DataDosenMain04.dataSemuaDosen(daftarDosen);

            System.out.println("\n=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
            DataDosenMain04.jumlahDosenPerJenisKelamin(daftarDosen);

            System.out.println("\n=== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin ===");
            DataDosenMain04.rerataUsiaDosenPerJenisKelamin(daftarDosen);

            System.out.println("\n=== Dosen Paling Tua ===");
            DataDosenMain04.infoDosenPalingTua(daftarDosen);

            System.out.println("\n=== Dosen Paling Muda ===");
            DataDosenMain04.infoDosenPalingMuda(daftarDosen);

    }
}
