import java.util.Scanner;

public class NilaiKelompok08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        String kelompokTertinggi = ""; // Tambahan String Kelompok Tertinggi
        double rataNilai, rataTertinggi = 0; // Tambahan rata Tertinggi

        while(i <= 5) {
            System.out.println("Kelompok " + i);

            int totalNilai = 0;
            for(int j = 1; j <= 5; j++) {
                int nilai;
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();

                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);

            // Tambahan
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai; // Menyimpan lagi rata-rata tertinggi
                kelompokTertinggi = "Kelompok " + i; ; // Menyimpan nomor kelompok berapa yang dengan rata-rata tertinggi
            } else if (rataNilai == rataTertinggi) {
                kelompokTertinggi += ", Kelompok " + i; // Jika rata-rata tertinggi kelompok ada yang sama maka menambahkan nomor kelompok.
            }

            i++;
        }

        // Tambahan
        System.out.println("Nilai kelompok tertinggi adalah: " + rataTertinggi);
        System.out.println("Kelompok yang mendapatkan nilai tertinggi adalah: " + kelompokTertinggi);
    }
}
