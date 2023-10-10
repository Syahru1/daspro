import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input penggunaan energi dalam unit
        System.out.print("Masukkan penggunaan energi dalam unit: ");
        int penggunaanEnergi = input.nextInt();

        // Hitung biaya untuk 100 unit pertama
        double biaya100UnitPertama = Math.min(penggunaanEnergi, 100) * 0.85;

        // Hitung biaya untuk unit berikutnya (101-300)
        double biayaUnitBerikutnya = 0;
        if (penggunaanEnergi > 100) {
            biayaUnitBerikutnya = Math.min(penggunaanEnergi - 100, 200) * 1.45;
        }

        // Hitung biaya untuk unit di atas 300 (jika ada)
        double biayaUnitDiAtas300 = 0;
        if (penggunaanEnergi > 300) {
            biayaUnitDiAtas300 = (penggunaanEnergi - 300) * 1.85;
        }

        // Total biaya sebelum biaya minimal
        double totalBiayaSebelumMinimal = biaya100UnitPertama + biayaUnitBerikutnya + biayaUnitDiAtas300;

        // Biaya minimal
        double biayaMinimal = Math.max(totalBiayaSebelumMinimal, 500.00);

        // Total biaya setelah biaya minimal
        double totalBiaya = biayaMinimal;

        // Cek apakah total biaya melebihi $2,500
        if (totalBiaya > 2500.00) {
            // Tambahkan biaya tambahan 3%
            totalBiaya += (3.0 / 100) * totalBiaya;
        }

        // Print tagihan akhir
        System.out.println("Tagihan Akhir: $" + totalBiaya);

        input.close();
    }
}
