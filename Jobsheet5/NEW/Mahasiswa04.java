package NEW;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //konstruktor default
    Mahasiswa04(){

    }
    //konstruktor berparameter
    Mahasiswa04(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;

    }
     
    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim );
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
    public void tampil() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampil'");
    }
    public void updateIpk(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateIpk'");
    }
    public void tampilkanInformasi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilkanInformasi'");
    }
    public void ubahKelas(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ubahKelas'");
    }
    
}
