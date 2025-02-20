import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        scanner.close();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }

            if (i % 2 == 0) {
                System.out.print(i + " "); 
            } else {
                System.out.print("* ");
            }
        }
    }
}