import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        while (jmlMhs < 0) {
            System.out.println("Input minimal 1");
            System.out.print("Masukkan jumlah mahasiswa : ");
            jmlMhs = sc.nextInt();
        }

        MahasiswaBerprestasi list = new MahasiswaBerprestasi(jmlMhs);

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke " + (i + 1));
            System.out.print("Masukkan NIM : ");
            String nim = sc.next();
            System.out.print("Masukkan Nama : ");
            String nama = sc.next();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc.next();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);
            System.out.println("-------------------------");
            list.tambah(mhs);
        }

        list.tampil();

        // sequential search
        // System.out.println("Pencarian Data");
        // System.out.println("--------------------------");
        // System.out.print("Masukkan IPK yang dicari : ");
        // double cari = sc.nextDouble();

        // System.out.println("Menggunakan sequential search");
        // double posisi = list.sequentialSearch(cari);
        // list.tampilPosisi(cari, (int) posisi);
        // list.tampilDataSearch(cari, (int)posisi);

        // binary search
        System.out.println("Pencarian Data");
        System.out.println("--------------------------");
        System.out.print("Masukkan IPK yang dicari : ");
        double search = sc.nextDouble();

        System.out.println("Menggunakan binary search");
        double posisi2 = list.findBinarySearch(search, 0, jmlMhs-1);
        list.tampilPosisi(search, (int) posisi2);
        list.tampilDataSearch(search, (int)posisi2);
        

    }
}
