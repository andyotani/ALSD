public class DosenMain04 {
    public static void main(String[] args) {
        System.out.println("DOSEN 1");
        Dosen04 dsn1 = new Dosen04("D001", "Agus", "Daspro", true, 2018);
        dsn1.tampilkanInformasi();
        System.out.println("===================");

        Dosen04 dsn2 = new Dosen04();
        dsn2.idDosen = "D002";
        dsn2.nama = "Budi";
        dsn2.bidangKeahlian = "Desain Antarmuka";
        dsn2.statusAktif = false;
        dsn2.tahunBergabung = 2016;
        
        System.out.println("DOSEN 2");
        dsn2.tampilkanInformasi();
        System.out.println("Masa Kerja : " + dsn2.hitungMasaKerja(2025) + " tahun");
        System.out.println();

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Aljabar");
        System.out.println("===================");
        
        System.out.println("PERCOBAAN METHOD");
        dsn2.tampilkanInformasi();
        System.out.println("Masa Kerja : " + dsn2.hitungMasaKerja(2025) + " tahun");
        


    }
}
