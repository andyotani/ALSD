public class MainMahasiswa {
    public static void main(String[] args) {
        // Inisialisasi data mahasiswa
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        DataMahasiswa dataMahasiswa = new DataMahasiswa(mahasiswa);

        // Mencari nilai UTS tertinggi dan terendah dengan Divide and Conquer
        int utsTertinggi = dataMahasiswa.cariUTSTertinggi(0, mahasiswa.length - 1);
        int utsTerendah = dataMahasiswa.cariUTSTerendah(0, mahasiswa.length - 1);

        // Menghitung rata-rata nilai UAS dengan Brute Force
        double rataRataUAS = dataMahasiswa.hitungRataRataUAS();

        // Menampilkan hasil
        System.out.println("Nilai UTS Tertinggi (Divide and Conquer): " + utsTertinggi);
        System.out.println("Nilai UTS Terendah (Divide and Conquer): " + utsTerendah);
        System.out.println("Rata-rata Nilai UAS (Brute Force): " + rataRataUAS);
    }
}
