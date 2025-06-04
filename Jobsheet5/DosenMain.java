import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;
        String lanjut;
        Boolean jenisKelamin;

        DataDosen listDosen = new DataDosen();

        do {
            System.out.println("Data Dosen");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Semua Dosen");
            System.out.println("3. Sorting Ascending Usia");
            System.out.println("4. Sorting Descending Usia");
            System.out.println("5. Keluar");
            
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            
        switch (menu) {
            case 1:
            for (int i = 0; i < 5; i++) {
                System.out.println("DATA DOSEN " + (i+1));
                System.out.print("Masukkan Kode : ");
                String kode = sc.next();
                System.out.print("Masukkan Nama : ");
                String nama = sc.next();
                System.out.print("Masukkan Jenis Kelamin : ");
                String gender = sc.next();

                while (!gender.equalsIgnoreCase("pria") && !gender.equalsIgnoreCase("wanita")) {
                    System.out.println("Masukkan Pria / Wanita saja");
                    System.out.print("Jenis Kelamin : ");
                    gender = sc.next();
                }
        
                if (gender.equalsIgnoreCase("pria")) {
                    jenisKelamin = true;
                } else {
                    jenisKelamin = false;
                }
                System.out.print("Masukkan usia : ");
                int usia = sc.nextInt();
                Dosen dsn = new Dosen(kode, nama, jenisKelamin, usia);
                listDosen.tambah(dsn);
                System.out.println();
            }
            break;
            case 2:
            System.out.println("Tampilkan Semua Dosen");
            listDosen.tampil();
            break;   
            case 3:
            System.out.println("Sorting Ascending");
            listDosen.bubbleSortAsc();
            listDosen.tampil();
            break;    
            case 4:
            System.out.println("Sorting Descending");
            listDosen.selectionSortDesc();
            listDosen.tampil();
            break;    
            case 5:
            System.out.println("Keluar");   
            return;
            default:
            System.out.println("Input dari 1 - 5!");
            break;
        }

        System.out.print("Tampilkan menu? (y/n)");
        lanjut = sc.next();
    } while (lanjut.equalsIgnoreCase("y"));
    }

    }

