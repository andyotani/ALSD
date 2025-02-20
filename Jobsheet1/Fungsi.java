public class Fungsi {
    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7}, 
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] penguranganStok = {-1, -2, 0, -5};

        System.out.println("=== Pendapatan Setiap Cabang Jika Semua Bunga Terjual ===");
        tampilkanPendapatan(stockBunga, hargaBunga);

        System.out.println("\n=== Total Stok Bunga di Semua Cabang ===");
        tampilkanTotalStok(stockBunga);

        System.out.println("\n=== Stok Setelah Pengurangan Karena Bunga Mati ===");
        kurangiStok(stockBunga, penguranganStok);
        tampilkanTotalStok(stockBunga);
    }

    public static void tampilkanPendapatan(int[][] stockBunga, int[] hargaBunga) {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    public static void tampilkanTotalStok(int[][] stockBunga) {
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;

        for (int[] cabang : stockBunga) {
            totalAglonema += cabang[0];
            totalKeladi += cabang[1];
            totalAlocasia += cabang[2];
            totalMawar += cabang[3];
        }

        System.out.println("Aglonema: " + totalAglonema);
        System.out.println("Keladi: " + totalKeladi);
        System.out.println("Alocasia: " + totalAlocasia);
        System.out.println("Mawar: " + totalMawar);
    }

    public static void kurangiStok(int[][] stockBunga, int[] penguranganStok) {
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += penguranganStok[j]; 
                if (stockBunga[i][j] < 0) {
                    stockBunga[i][j] = 0; 
                }
            }
        }
    }
}
