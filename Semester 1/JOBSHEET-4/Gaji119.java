import java.util.Scanner;

public class Gaji119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JmlMasuk,JmlTdkMasuk, gaji, potGaji, TotGaji;

        System.out.println("Masukkan jumlah masuk");
        JmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah tidak masuk");
        JmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan jumlah gaji : ");
        gaji = input.nextInt();
        System.out.println("Masukkan jumlah potongan gaji : ");
        potGaji = input.nextInt();

        TotGaji = (JmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah : Rp"+ TotGaji);
    }
}
