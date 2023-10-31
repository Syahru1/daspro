import java.util.Scanner;

public class BillingWarnet7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_per_jam = 3000;
        byte jam;
        boolean anotherCustomer = true;

        System.out.println("Selamat Datang di Warnet SDR!");

        while (anotherCustomer) {
            System.out.print("Masukkan jumlah jam: ");
            jam = input.nextByte();

            int total = harga_per_jam * jam;

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

            System.out.print("Hitung lagi untuk pelanggan lain? (ya/tidak): ");
            String response = input.next();
            anotherCustomer = response.equalsIgnoreCase("ya");
        }

        System.out.println("Terima kasih!");
    }
}

