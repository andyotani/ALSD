import java.util.Scanner;

public class MainFaktorial {
   public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Masukan nilai: ");
    int nilai = input.nextInt();

    Faktorial fk = new Faktorial();
    System.out.println("Nilai faktorial "+nilai+ " menggunakan BF: "+fk.factorialBF(nilai));
    System.out.println("Nilai faktorial "+nilai+ " menggunakan DC: " +fk.factorialDC(nilai));


   }
}
