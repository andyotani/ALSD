public class Mahasiswa04 {
        String nama;
        String nim;
        String kelas;
        double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelasa: " + kelas);
    }

    void ubahKelas(String KelasBaru){
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
