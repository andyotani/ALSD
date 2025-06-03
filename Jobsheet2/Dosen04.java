class Dosen04 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    Dosen04 () {

    }

    Dosen04 (String idDosen, String nama, String bidangKeahlian, boolean statusAktif, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }


    void tampilkanInformasi() {
        System.out.println("ID Dosen : " + this.idDosen);
        System.out.println("Nama Dosen : " + this.nama);
        System.out.println("Bidang Keahlian : " + this.bidangKeahlian);
        System.out.println("Status Aktif : " + this.statusAktif);
        System.out.println("Tahun Bergabung : " + this.tahunBergabung);
    }

    void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    int hitungMasaKerja (int tahunSkrg) {
        return tahunSkrg - this.tahunBergabung;
    }

    void ubahKeahlian (String bidangKeahlian) {
        this.bidangKeahlian = bidangKeahlian;
    }
    
}

