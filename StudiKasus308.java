import java.util.Scanner;

public class StudiKasus308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang = 0, jumlahPelanggan = 0,  totalPelanggan = 0, totalKeseluruhanItem = 0, totalItem; 
        
        // Input jumlah cabang
        System.out.print("Jumlah Cabang Kafe = ");
        jumlahCabang = sc.nextInt();

        // Perulangan untuk setiap cabang
        for(int i = 1; i <= jumlahCabang; i++) {
            System.out.println("== Input Penjualan Percabang ==");

            // Input jumlah pelanggan
            System.out.println("-- Cabang " + i + " --");
            System.out.print("Jumlah Pelanggan: ");
            jumlahPelanggan = sc.nextInt();
            totalItem = 0;

            // Perulangan untuk setiap pelanggan
            for(int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahItem;

                // Input jumlah item
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                jumlahItem = sc.nextInt();
                totalItem += jumlahItem;
            }

            // Menampilkan hasil penjualan per cabang
            System.out.println("Cabang " + i + ":");
            System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("Item terjual: " + totalItem + " item");

            // Menghitung total keseluruhan
            totalKeseluruhanItem += totalItem;
            totalPelanggan += jumlahPelanggan;
        }

        // Menampilkan total keseluruhan
        System.out.println("== Total Keseluruhan Cabang ==");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalKeseluruhanItem + " item");
    }
}