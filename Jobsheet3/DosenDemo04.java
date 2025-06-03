package Jobsheet3;
import java.util.Scanner;


public class DosenDemo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = sc.nextInt();

        Dosen04[] arrayOfDosen04 = new Dosen04[jumlahDosen];

        for (int i = 0; i < arrayOfDosen04.length; i++) {
            System.out.println("Data Dosen ke -" + (i + 1));
            arrayOfDosen04[i] = new Dosen04();
            arrayOfDosen04[i].tambahData();
            System.out.println("--------------------------------------");
        }

        // for (Dosen25 dsn : arrayOfDosen04) {
        //     int i = 1;
        //     System.out.println("Data Dosen ke -" + (i));
        //     dsn.cetakInfo();
        //     i++;
        //     System.out.println("--------------------------------------");
        // }

        DataDosen04 dosen = new DataDosen04(arrayOfDosen04);
        dosen.dataSemuaDosen(arrayOfDosen04);
        System.out.println();
        dosen.jumlahDosenPerJenisKelamin(arrayOfDosen04);
        System.out.println();
        dosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen04);
        System.out.println();
        dosen.infoDosenPalingTua(arrayOfDosen04);
        dosen.infoDosenPalingMuda(arrayOfDosen04);
        
        
    }
}

