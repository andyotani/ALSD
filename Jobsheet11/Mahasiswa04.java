public class Mahasiswa04 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa04() {
    }
    
    public Mahasiswa04(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
    
}