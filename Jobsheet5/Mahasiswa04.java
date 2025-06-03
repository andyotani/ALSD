package Jobsheet5.Praktikum05.Praktikum2;

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
    
}
