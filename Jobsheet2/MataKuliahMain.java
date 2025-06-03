public class MataKuliahMain {
    public static void main(String[] args) {
        System.out.println("Mata Kuliah 1 : ");
        MataKuliah04 mk1 = new MataKuliah04();
        mk1.nama = "algoritma dan struktur data";
        mk1.kodeMk = "ALSD";
        mk1.sks = 4;
        mk1.jumlahJam = 8;
        mk1.tampilkanInformasi();
        System.out.println();

        System.out.println("Mata Kuliah 2 : ");
        MataKuliah04 mk2 = new MataKuliah04("BD", "basis data", 3, 5);
        mk2.tampilkanInformasi();   
        System.out.println();

        System.out.println("PERCOBAAN METHOD : ");
        mk2.ubahSks(5);
        mk2.tambahJam(4);
        mk2.kurangiJam(11);
        mk2.tampilkanInformasi();
    }
}
