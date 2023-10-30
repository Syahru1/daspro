import java.util.Scanner;

public class Kasus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Masukkan panjang balok : ");
        double B = sc.nextInt();
        System.out.print(" Masukkan lebar balok : ");
        double L = sc.nextInt();
        System.out.print(" Masukkan tinggi balok : ");
        double H = sc.nextInt();

        double V = B * L * H;
        System.out.print(" Hasil volume balok adalah : " + V);
    }
}