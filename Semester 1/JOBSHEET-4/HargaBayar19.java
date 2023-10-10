import java.util.Scanner;

public class HargaBayar19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga,jumlah,jumhalbuku;
        double dis, total, bayar, JmlDis;
        String merkbuku;

        System.out.println("Masukkan merk buku");
        merkbuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        jumhalbuku = input.nextInt();
        System.out.println("Masukkan harga barang");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang");
        jumlah = input.nextInt();
        System.out.println("Masukkan persentase diskon barang");
        dis = input.nextDouble();

        total = harga*jumlah;
        JmlDis = total*(dis/100);
        bayar = total-JmlDis;

        System.out.println("Diskon yang anda dapatkan adalah : Rp" + JmlDis);
        System.out.println("Jumlah yang harus dibayar untuk merk buku \""+ 
        merkbuku +"\" yang berjumlah "+ jumhalbuku+" halaman adalah : Rp" +bayar);
    } 
}