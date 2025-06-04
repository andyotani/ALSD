import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;
        String lanjut;
        Boolean jenisKelamin;

        System.out.print("Masukkan jumlah dosen : ");
        int jmlDsn = sc.nextInt();

        while (jmlDsn < 0) {
            System.out.println("Input minimal 1");
            System.out.print("Masukkan jumlah mahasiswa : ");
            jmlDsn = sc.nextInt();
        }

        DataDosen04 listDosen = new DataDosen04(jmlDsn);

        do {
            System.out.println("==== DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Semua Dosen");
            System.out.println("3. Sorting Ascending Usia");
            System.out.println("4. Sorting Descending Usia");
            System.out.println("5. Cari Dosen berdasarkan nama");
            System.out.println("6. Cari Dosen berdasarkan usia");
            System.out.println("7. Keluar");
            
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            
        switch (menu) {
            case 1:
            for (int i = 0; i < jmlDsn; i++) {
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
                Dosen04 dsn = new Dosen04(kode, nama, jenisKelamin, usia);
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
            System.out.println("Cari Dosen Berdasarkan Nama");
            System.out.print("Masukkan target nama : ");
            sc.nextLine();
            String target = sc.nextLine();
            int result = listDosen.pencarianDataSequential(target);
            listDosen.tampilPosisi(result);
            listDosen.tampilDataSearch(result);
            break;
            case 6:
            System.out.println("Cari Dosen Berdasarkan Usia");
            System.out.print("Masukkan target usia : ");
            int usia = sc.nextInt();
            listDosen.insertionSortAsc();
            int data = listDosen.pencarianDataBinary(listDosen.dataDosen, usia);
            listDosen.tampilPosisi(data);
            listDosen.tampilDataSearch(data);
            break;
            case 7:
            System.out.println("Keluar");   
            return;
            default:
            System.out.println("Input dari 1 - 7!");
            break;
        }

        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n)");
        lanjut = sc.next();
    } while (lanjut.equalsIgnoreCase("y"));
    }

    }

