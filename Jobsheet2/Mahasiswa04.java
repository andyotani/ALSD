public class Mahasiswa04 {
        String nama; //atribut
        String nim;
        String kelas;
        double ipk;

    public Mahasiswa04() { //konstruktor

    }
    
    public Mahasiswa04(String nm, String nim, double ipk, String kls){// konstruktor
        this.nama = nm;//this dipakai untuk mereverse ke objek
        nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

    void tampilkanInformasi(){// method
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelasa: " + kelas);
    }

    void ubahKelas(String KelasBaru){//method
        kelas = KelasBaru;
    }

    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}
