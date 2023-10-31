import java.util.Scanner;

public class BillingWarnet5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_per_jam = 3000, total;
        byte jam;

        System.out.println("Selamat Datang di Warnet SDR!");
        System.out.print("Masukkan jumlah jam: ");
        jam = input.nextByte();

        total = harga_per_jam * jam;

        if (jam >= 5) {
            double discount = 0.1; 
            double discountAmount = total * discount;
            total -= discountAmount;
            System.out.println("Anda mendapatkan diskon 10%!");
        }
        System.out.println("Jumlah yang harus dibayar sebesar Rp" + total);
    }
}
