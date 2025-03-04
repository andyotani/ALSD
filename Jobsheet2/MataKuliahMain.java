public class MataKuliahMain<NoAbsen> {
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04();
        
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        
        MataKuliah04 mk2 = new MataKuliah04("MK002", "Pemrograman Java", 4, 6);
        
        System.out.println("\nInformasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
    }
}