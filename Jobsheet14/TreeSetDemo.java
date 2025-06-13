import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");
        
        // Mencetak dengan urutan terurut
        System.out.println("Buah-buahan terurut:");
        for (String temp : fruits) {
            System.out.println(temp);
        }
        
        // Menggunakan method first() dan last()
        System.out.println("\nFirst: " + fruits.first());
        System.out.println("Last: " + fruits.last());
        
        // Menghapus elemen
        fruits.remove("Jeruk");
        System.out.println("\nSetelah remove Jeruk: " + fruits);
        
        // Menggunakan pollFirst() dan pollLast()
        fruits.pollFirst();
        System.out.println("Setelah poll first: " + fruits);
        
        fruits.pollLast();
        System.out.println("Setelah poll last: " + fruits);
    }
}