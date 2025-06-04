public class MahasiswaBerprestasi {
    Mahasiswa04 listMhs[];
    int idx;

    MahasiswaBerprestasi (int jmlMhs) {
        listMhs = new Mahasiswa04[jmlMhs];
    }

    void tampil() {
        for(int i = 0; i < listMhs.length; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    void tambah(Mahasiswa04 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    int sequentialSearch (double cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch (double cari, int left, int right) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (cari > listMhs[mid].ipk) {
                return findBinarySearch(cari, mid+1, right);
            } else {
                return findBinarySearch(cari, left, mid-1);
            }
        } 
        return -1;
    }

    int findBinarySearchDescending (double cari, int left, int right) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (cari > listMhs[mid].ipk) {
                return findBinarySearchDescending(cari, left, mid-1);
            } else {
                return findBinarySearchDescending(cari, mid+1, right);
            }
        } 
        return -1;
    }   

    void tampilPosisi (double x, int pos) {
        if (pos != -1) {
            System.out.println("Data Mahasiswa dengan IPK : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data Mahasiswa dengan IPK : " + x + "tidak ditemukan");
        }
    }
}
