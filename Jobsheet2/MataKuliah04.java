class MataKuliah04 {
    String kodeMk, nama;
    int sks, jumlahJam;

    MataKuliah04() {

    }
    
    MataKuliah04(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;   
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK : " + this.kodeMk);
        System.out.println("Nama Mk : " + this.nama);
        System.out.println("Jumlah SKS : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
    }

    void ubahSks(int sksBaru) {
        this.sks = sksBaru;
    }

    void tambahJam (int jam) {
        this.jumlahJam += jam;
    }

    void kurangiJam (int jam) {
        if (jam > this.jumlahJam) {
            System.out.println("Jumlah jam tidak valid! Harus antara 0 - " + this.jumlahJam);
            return;
        }
        this.jumlahJam -= jam;
    }


    
}

