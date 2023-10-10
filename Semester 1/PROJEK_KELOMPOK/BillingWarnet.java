import java.util.Scanner;

public class BillingWarnet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_per_jam = 3000, total;
        byte jam;

        System.out.println("Selamat Datang di Warnet SDR!");
        System.out.print("Masukkan jumlah jam: ");
        jam = input.nextByte();

        total = harga_per_jam * jam;
        System.out.println("Jumlah yang harus dibayar sebesar Rp" + total);
    }
}