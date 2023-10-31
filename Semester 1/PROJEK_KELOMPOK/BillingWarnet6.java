import java.util.Scanner;

public class BillingWarnet6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_per_jam = 3000;
        int total;
        byte jam;

        System.out.println("Selamat Datang di Warnet SDR!");
        System.out.print("Masukkan jumlah jam: ");
        jam = input.nextByte();

        total = harga_per_jam * jam;

        if (jam >= 5) {
            if (jam >= 10) {
                double discount = 0.2; 
                double discountAmount = total * discount;
                total -= discountAmount;
                System.out.println("Anda mendapatkan diskon 20%!");
            } else {
                double discount = 0.1; 
                double discountAmount = total * discount;
                total -= discountAmount;
                System.out.println("Anda mendapatkan diskon 10%!");
            }
        } else {
            System.out.println("Anda tidak mendapatkan diskon.");
        }

        System.out.println("Jumlah yang harus dibayar sebesar Rp" + total);
    }
}

