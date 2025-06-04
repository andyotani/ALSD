class Dosen04 {
    String kode, nama;
    Boolean jenisKelamin;
    int usia;

    Dosen04(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }


    void tampil() {
            String gender;
            System.out.println("Kode : " + this.kode);
            System.out.println("Nama : " + this.nama);
            
            gender = (this.jenisKelamin == true) ? "Pria" : "Wanita";
            
            System.out.println("Jenis Kelamin : " + gender);
            System.out.println("Usia : " + this.usia);
        
    }
}