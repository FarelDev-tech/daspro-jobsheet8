public class StudiKasus108 {
    public static void main(String[] args) {
        int n = 5;
        int jumlahKuadrat = 0;

        for(int i = 1; i <= n; i++) {
            jumlahKuadrat += i * i; // Menambahkan kuadrat dari i
            System.out.println("n = " + i + " -> jumlah kuadrat = " + jumlahKuadrat);
        }
    }
}
