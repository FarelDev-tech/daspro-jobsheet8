public class StudiKasus208 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        // BLOK 3X3
        for(int i = 1; i <= num1; i++) {
            for(int j = 1; j <= num1; j++) {
                // persegi 3
                if(i == 1 || i == num1 || j == 1 || j == num1) {
                    System.out.print(num1 + " "); // Memberi spasi agar sedikit lebih lebar
                } else {
                    System.out.print("  "); // Memberi spasi agar sedikit lebih lebar
                }
            }
            System.out.println();
        }

        // BLOK 5X5
        for(int i = 1; i <= num2; i++) {
            for(int j = 1; j <= num2; j++) {
                // persegi 5
                if (i == 1 || i == num2 || j == 1 || j == num2) {
                    System.out.print(num2 + " "); // Memberi spasi agar sedikit lebih lebar
                } else {
                    System.out.print("  "); // Memberi spasi agar sedikit lebih lebar
                }
            }
            System.out.println();
        }
    }
}
