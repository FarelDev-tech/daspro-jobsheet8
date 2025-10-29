import java.util.Scanner;

public class Triangle08 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n, i = 1; // Modifikasi: variable i dari 0 diubah menjadi 1 karena tidak ada baris kosong pada output awal
        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();
        while(i <= n) {
            int j = 0;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Modifikasi: Menambahkan baris baru setelah setiap baris bintang selesai dicetak
            i++;
        }
    }
}
