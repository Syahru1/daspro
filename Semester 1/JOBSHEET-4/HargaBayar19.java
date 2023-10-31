import java.util.Scanner;

public class HargaBayar19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double dis=0.1, total, bayar, JmlDis;

        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
        jumlah = input.nextInt();

        total = harga*jumlah;
        JmlDis=total*dis;
        bayar=total-JmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + JmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
    
}
