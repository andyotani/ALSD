package Case Study;

public class Matakuliah {
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah(){}

    MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilDataMK(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
    }

}
