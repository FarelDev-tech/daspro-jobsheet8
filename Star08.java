import java.util.Scanner;

public class Star08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}