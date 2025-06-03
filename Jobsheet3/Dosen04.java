package Jobsheet3;
import java.util.Scanner;

public class Dosen04 {
    Scanner sc = new Scanner(System.in);
    String kode;
    String nama;
    Boolean jenisKelamin = null;
    int usia;

    public Dosen04 () {

    }

    public Dosen04 (String kode, String nama, Boolean jenisKelamin, int usia) {   
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tambahData() {
        System.out.print("Kode : ");
        this.kode = sc.nextLine();
        System.out.print("Nama : ");
        this.nama = sc.nextLine();
        System.out.print("Jenis Kelamin : ");
        String gender = sc.next();

        while (!gender.equalsIgnoreCase("pria") && !gender.equalsIgnoreCase("wanita")) {
            System.out.println("Masukkan Pria / Wanita saja");
            System.out.print("Jenis Kelamin : ");
            gender = sc.next();
        }

        if (gender.equalsIgnoreCase("pria")) {
            this.jenisKelamin = true;
        } else {
            this.jenisKelamin = false;
        }
        System.out.print("Usia : ");
        this.usia = sc.nextInt();
        }

        void cetakInfo() {
            String gender;
            System.out.println("Kode : " + this.kode);
            System.out.println("Nama : " + this.nama);
            
            gender = (this.jenisKelamin == true) ? "Pria" : "Wanita";
            
            System.out.println("Jenis Kelamin : " + gender);
            System.out.println("Usia : " + this.usia);
        }
}
