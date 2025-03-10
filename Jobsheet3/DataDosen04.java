package Jobsheet3;

public class DataDosen04 {

    // a. Menampilkan semua data dosen
    public static void dataSemuaDosen(Dosen04[] arrayOfDosen) {
        for (Dosen04 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    // b. Menampilkan jumlah dosen berdasarkan jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen04 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    // c. Menampilkan rata-rata usia berdasarkan jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen04 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (countPria == 0 ? 0 : (totalUsiaPria / countPria)));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (countWanita == 0 ? 0 : (totalUsiaWanita / countWanita)));
    }

    // d. Menampilkan data dosen paling tua
    public static void infoDosenPalingTua(Dosen04[] arrayOfDosen) {
        Dosen04 tertua = arrayOfDosen[0];
        for (Dosen04 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanInfo();
    }

    // e. Menampilkan data dosen paling muda
    public static void infoDosenPalingMuda(Dosen04[] arrayOfDosen) {
        Dosen04 termuda = arrayOfDosen[0];
        for (Dosen04 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanInfo();
    }
}


