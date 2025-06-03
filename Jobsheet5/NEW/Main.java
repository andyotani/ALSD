package NEW;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine(); // Flush buffer
                    System.out.print("Masukkan kode dosen: ");
                    String kode = scanner.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jenis kelamin (true: Laki-laki, false: Perempuan): ");
                    boolean jk = scanner.nextBoolean();
                    System.out.print("Masukkan usia dosen: ");
                    int usia = scanner.nextInt();
                    data.tambah(new Dosen(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data telah diurutkan secara ASC.");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data telah diurutkan secara DSC (Selection Sort).");
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data telah diurutkan secara DSC (Insertion Sort).");
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
