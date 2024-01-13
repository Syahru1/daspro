import java.util.Scanner;

public class HargaBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah,harga,halaman;
        String merkbuku;
        double diskon, total, bayar, jmldis;

        System.out.println("Masukkan merek buku yang anda beli");
        merkbuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang anda beli");
        halaman = input.nextInt();
        System.out.println("Masukkan Jumlah buku (lusin) yang anda beli");
        jumlah = input.nextInt();
        System.out.println("Masukkan harga barang anda");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah diskon pembelian buku tersebut");
        diskon = input.nextDouble();

        total = harga*jumlah;
        jmldis = (harga*diskon)*jumlah;
        bayar = total-jmldis;

        System.out.println("Total harga buku anda :" + " " + total);
        System.out.println("Total diskon dari pembelian anda :" + " " + jmldis);
        System.out.println("Total pembayaran anda: " + " " + bayar);




    }
    
}
