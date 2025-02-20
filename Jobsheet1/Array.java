import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] namaMK = new String[jumlahMK];
        int[] sksMK = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];
        double totalBobotNilai = 0;
        double totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah: ");
            namaMK[i] = scanner.nextLine();

            System.out.print("Masukkan bobot SKS: ");
            sksMK[i] = scanner.nextInt();

            System.out.print("Masukkan nilai angka: ");
            nilaiAngka[i] = scanner.nextDouble();
            scanner.nextLine(); 
            
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobotNilai += nilaiSetara[i] * sksMK[i];
            totalSKS += sksMK[i];
        }

        double ipSemester = totalBobotNilai / totalSKS;
        System.out.println("\nHasil Konversi Nilai:");
        System.out.printf("%-30s %-15s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot SKS");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %-15.2f %-10s %-10d\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], sksMK[i]);
        }
         System.out.printf("\nIP Semester: %.2f\n", ipSemester);
    }
}