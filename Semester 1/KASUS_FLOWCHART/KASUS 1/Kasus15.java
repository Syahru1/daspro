import java.util.Scanner;

public class Kasus15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Masukkan panjang alas segitiga : ");
        double B = sc.nextInt();
        System.out.print(" Masukkan tinggi segitiga : ");
        double H = sc.nextInt();

        double Area = 1/2 * B * H;
        System.out.print(" Luas segitiga adalah : " + Area);
    }
}
