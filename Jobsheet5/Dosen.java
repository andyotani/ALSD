class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
         String gender;
            System.out.println("Kode : " + this.kode);
            System.out.println("Nama : " + this.nama);
            
            gender = (this.jenisKelamin == true) ? "Pria" : "Wanita";
            
            System.out.println("Jenis Kelamin : " + gender);
            System.out.println("Usia : " + this.usia);
        
    }
}