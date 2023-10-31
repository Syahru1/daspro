import java.util.Scanner;

public class BillingWarnet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_per_jam = 3000;
        int maxCustomers = 10; 
        byte[] jamArray = new byte[maxCustomers];
        int[] totalArray = new int[maxCustomers];
        int customerCount = 0;

        System.out.println("Selamat Datang di Warnet SDR!");

        while (customerCount < maxCustomers) {
            System.out.print("Masukkan jumlah jam (pelanggan ke-" + (customerCount + 1) + "): ");
            jamArray[customerCount] = input.nextByte();

            totalArray[customerCount] = harga_per_jam * jamArray[customerCount];

            if (jamArray[customerCount] >= 5) {
                if (jamArray[customerCount] >= 10) {
                    double discount = 0.2; 
                    double discountAmount = totalArray[customerCount] * discount;
                    totalArray[customerCount] -= discountAmount;
                    System.out.println("Anda mendapatkan diskon 20%!");
                } else {
                    double discount = 0.1; 
                    double discountAmount = totalArray[customerCount] * discount;
                    totalArray[customerCount] -= discountAmount;
                    System.out.println("Anda mendapatkan diskon 10%!");
                }
            } else {
                System.out.println("Anda tidak mendapatkan diskon.");
            }
            System.out.println("Jumlah yang harus dibayar sebesar Rp" + totalArray[customerCount]);
            System.out.print("Hitung lagi untuk pelanggan lain? (ya/tidak): ");
            String response = input.next();

            if (response.equalsIgnoreCase("tidak")) {
                break; 
            }
            customerCount++;
        }
        System.out.println("Ringkasan:");

        for (int i = 0; i <= customerCount; i++) {
            System.out.println("Pelanggan ke-" + (i + 1) + ": Jam = " + jamArray[i] + ", Total = Rp" + totalArray[i]);
        }
        System.out.println("Terima kasih!");
    }
}