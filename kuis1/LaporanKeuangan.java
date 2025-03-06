public class LaporanKeuangan {
    String namaPerusahaan;
    double pendapatanBulanan, biayaOperasional;

    public LaporanKeuangan(){

    }

    public LaporanKeuangan(String namaPerusahaan, double pendapatanBulanan, double biayaOperasional ){
        this.namaPerusahaan = namaPerusahaan;
        this.pendapatanBulanan = pendapatanBulanan;
        this.biayaOperasional = biayaOperasional;
        
    }

   public void hitungKeuntungan(double pendapatanBulanan, double biayaOperasional){
        double hitungKeuntungan = pendapatanBulanan - biayaOperasional;
   }


    void printData(){
        System.out.println("nama perusahaaan : " + namaPerusahaan);
        System.out.println("pendapatan bulanan: " + pendapatanBulanan);
        System.out.println("biaya Operasional" + biayaOperasional);
        System.out.println("Hasil keuntungan ");



    }
}