public class MahasiswaMain04 {
    public static void main(String[] args) {

        Mahasiswa04 mhs1 = new Mahasiswa04();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241729171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa04 mhs2 = new Mahasiswa04("Annisa Nabila", "2141720160", 3.25 ,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

    }
}   