import java.util.Scanner;

public class Kasus12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Masukkan angka pertama : ");
        double A = sc.nextInt();
        System.out.print(" Masukkan angka kedua : ");
        double B = sc.nextInt();

        double S = A + B;
        double AVG = S/2;
        System.out.print(" Hasil penjumlahan angka tersebut adalah : " + AVG);       
    }
}