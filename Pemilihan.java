import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukan nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        double uas = sc.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100)
         { System.out.println("\nNilai tidak valid");
            
        }else{
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";     
            }else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            }else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            }else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            }else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            }else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
            }else {
                nilaiHuruf = "E";
            }
        String status = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) 
        ? "SELAMAT ANDA LULUS"
        : "ANDA TIDAK LULUS";

        System.out.println("\nNilai akhir: " + String.format("%.2f", nilaiAkhir));
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println(status);

      }  
    }
}