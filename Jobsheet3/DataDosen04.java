package Jobsheet3;
public class DataDosen04 {
    Dosen04[] dosen;
    String[] gender;
    int dosenPria = 0;
    int dosenWanita = 0;
    DataDosen04 (Dosen25[] dosen) {
        this.dosen = dosen;
        this.gender = new String[dosen.length];
    }

    void dataSemuaDosen (Dosen04[] arrayOfDosen) {
        int i = 0;
        for (Dosen04 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke -" + (i+1));
            System.out.println("Kode : " + dsn.kode);
            System.out.println("Nama : " + dsn.nama);
            this.gender[i] = (arrayOfDosen[i].jenisKelamin == true) ? "Pria" : "Wanita";
            System.out.println("Jenis Kelamin : " + this.gender[i]);
            System.out.println("Usia : " + dsn.usia);
            System.out.println("--------------------------------------");
            i++;
        }
    }

    void jumlahDosenPerJenisKelamin (Dosen04[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                this.dosenPria++;
            } else {
                this.dosenWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + this.dosenPria);
        System.out.println("Jumlah Dosen Wanita : " + this.dosenWanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                totalUsiaPria += arrayOfDosen[i].usia;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
            }
        }
        
        double rerataUsiaPria = (this.dosenPria > 0) ? (double) totalUsiaPria / this.dosenPria : 0;
        double rerataUsiaWanita = (this.dosenWanita > 0) ? (double) totalUsiaWanita / this.dosenWanita : 0;
        

        System.out.println("Rata - Rata Usia Dosen Pria : " + rerataUsiaPria);
        System.out.println("Rata - Rata Usia Dosen Wanita : " + rerataUsiaWanita);
    }

    void infoDosenPalingTua(Dosen04[] arrayOfDosen) {
        int dosenTertua = 0;
        int indexDosen = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTertua) {
                dosenTertua = arrayOfDosen[i].usia;
                indexDosen = i;
            }
        }
        System.out.println("Dosen Tertua : " + arrayOfDosen[indexDosen].nama + " dengan umur " + dosenTertua + " tahun");
    }

    void infoDosenPalingMuda(Dosen04[] arrayOfDosen) {
        int dosenTermuda = 1000;
        int indexDosen = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenTermuda) {
                dosenTermuda = arrayOfDosen[i].usia;
                indexDosen = i;
            }
        }
        System.out.println("Dosen Termuda : " + arrayOfDosen[indexDosen].nama + " dengan umur " + dosenTermuda + " tahun");
    }
}
