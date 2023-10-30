import java.util.Scanner;

public class Kasus14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Masukkan lama jam kerja anda : ");
        double H = sc.nextInt();
        System.out.print(" Masukkan gaji anda perjam : ");
        double R = sc.nextInt();

        double W = H * R;
        System.out.print(" Total gaji anda adalah : " + W);
    }
}