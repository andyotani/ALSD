package Jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo04 {
    private static final int jumlahMatkul = 0;
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[3];
            
    
            for (int i = 0; i < 3; i++) {
                System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
                System.out.print("Kode      : ");
                String kode = sc.nextLine();
                System.out.print("Nama      : ");
                String nama = sc.nextLine();
                System.out.print("Sks       : ");
                int sks = Integer.parseInt(sc.nextLine());
                System.out.print("Jumlah Jam: ");
                int jumlahJam = Integer.parseInt(sc.nextLine());
                System.out.println("----------------------------------");
    
                arrayOfMatakuliah[i] = new Matakuliah04(kode, nama, sks, jumlahJam);
            }
    
            // Menampilkan data
            for (int i = 0; i < 3; i++) {
                System.out.println("Data Matakuliah ke-" + (i + 1));
                System.out.println("Kode      : " + arrayOfMatakuliah[i].kode);
                System.out.println("Nama      : " + arrayOfMatakuliah[i].nama);
                System.out.println("Sks       : " + arrayOfMatakuliah[i].sks);
                System.out.println("Jumlah Jam: " + arrayOfMatakuliah[i].jumlahJam);
                System.out.println("----------------------------------");
            }
            for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah04(); // Inisialisasi objek
            arrayOfMatakuliah[i].tambahData(sc);       // Menggunakan method tambahData()
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo(); // Memanggil method cetakInfo()
        }
        
        

    }
}
