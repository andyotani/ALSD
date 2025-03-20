public class DataMahasiswa {
    Mahasiswa[] data;

    public DataMahasiswa(Mahasiswa[] data) {
        this.data = data;
    }

    // Metode Divide and Conquer untuk mencari nilai UTS tertinggi
    public int cariUTSTertinggi(int left, int right) {
        if (left == right) {
            return data[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int maxKiri = cariUTSTertinggi(left, mid);
        int maxKanan = cariUTSTertinggi(mid + 1, right);
        return Math.max(maxKiri, maxKanan);
    }

    // Metode Divide and Conquer untuk mencari nilai UTS terendah
    public int cariUTSTerendah(int left, int right) {
        if (left == right) {
            return data[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int minKiri = cariUTSTerendah(left, mid);
        int minKanan = cariUTSTerendah(mid + 1, right);
        return Math.min(minKiri, minKanan);
    }

    // Metode Brute Force untuk menghitung rata-rata nilai UAS
    public double hitungRataRataUAS() {
        int total = 0;
        for (Mahasiswa mhs : data) {
            total += mhs.nilaiUAS;
        }
        return (double) total / data.length;
    }
}
