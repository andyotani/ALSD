public class Surat04 {
    String idSurat, namaMhs, kelas;
    char jenisIzin;
    int durasi;
    boolean isVerificated;

    Surat04() {

    }

    Surat04(String idSurat, String namaMhs, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMhs = namaMhs;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        this.isVerificated = false;
    }
}
