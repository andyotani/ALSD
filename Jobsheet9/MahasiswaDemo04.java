import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

do {
    System.out.println("Menu:");
    System.out.println("1. Mengumpulkan Tugas");
    System.out.println("2. Menilai Tugas");
    System.out.println("3. Melihat Tugas Teratas");
    System.out.println("4. Melihat Tugas Terbawah (pertama)");
    System.out.println("5. Melihat Daftar Tugas");
    System.out.println("6. Jumlah tugas yang dikumpulkan");

    System.out.print("Pilih: ");
    pilih = sc.nextInt();
    sc.nextLine();
    switch (pilih) {
        case 1:
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            Mahasiswa04 mhs = new Mahasiswa04(nama, nim, kelas);
            stack.push(mhs);
            System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
            break;
        case 2:
            Mahasiswa04 dinilai = stack.pop();
            if (dinilai != null) {
                System.out.println("Menilai tugas dari " + dinilai.nama);
                System.out.print("Masukkan nilai (0-100): ");
                int nilai = sc.nextInt();
                dinilai.tugasDinilai(nilai);
                System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                String biner = stack.konversiDesimalKeBiner(nilai);
                System.out.println("nilai biner tugas : " + biner);
            }
            break;
        case 3:
            Mahasiswa04 lihat = stack.peek();
            if (lihat != null) {
                System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
            }
            break;
            case 4:
            Mahasiswa04 lihatTerbawah = stack.peekBottom();
            if (lihatTerbawah != null) {
                System.out.println("Tugas pertama dikumpulkan oleh " + lihatTerbawah.nama);
            }
            break;
        case 5:
            System.out.println("Daftar semua tugas");
            System.out.println("Nama\tNIM\tKelas");
            stack.print();
            break;
        case 6:
            int jumlahTugas = stack.jumlahTugas();
            System.out.println("jumlah tugas yang telah dikumpulkan : " + jumlahTugas);
            break;
        default:
            System.out.println("Pilihan tidak valid.");
    }
} while (pilih >= 1 && pilih <= 4);

    }
    
}