import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalan Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);
        
        // Menggunakan peek()
        Book temp = books.peek();
        if (temp != null) {
            System.out.println("Buku teratas (peek): " + temp.toString());
        }
        
        // Menggunakan pop()
        Book temp2 = books.pop();
        if (temp2 != null) {
            System.out.println("Buku yang di-pop: " + temp2.toString());
        }
        
        // Mencetak sisa buku di stack
        System.out.println("\nBuku yang tersisa di stack:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
        
        // Mencetak dengan toString()
        System.out.println("\nStack buku:");
        System.out.println(books);
        
        // Mencari elemen dalam stack
        int pos = books.search(book1);
        System.out.println("Posisi buku1 dalam stack: " + pos);
    }
}