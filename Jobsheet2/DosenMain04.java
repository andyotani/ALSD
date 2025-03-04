public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();
        
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Kecerdasan Buatan");
        
        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        
        Dosen04 dosen2 = new Dosen04("D002", "Dr. Budi", true, 2010, "Jaringan Komputer");
        
        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();
        
        int masaKerja = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja Dosen 2: " + masaKerja + " tahun");
    }
}
