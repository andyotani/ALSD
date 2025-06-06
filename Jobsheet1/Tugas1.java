import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] kota = {
            "BANTEN", 
            "JAKARTA", 
            "BANDUNG", 
            "CIREBON", 
            "BOGOR", 
            "PEKALONGAN", 
            "SEMARANG", 
            "SURABAYA", 
            "MALANG", 
            "TEGAL"
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        boolean found = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == input) {
                System.out.println("Kota: " + kota[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
