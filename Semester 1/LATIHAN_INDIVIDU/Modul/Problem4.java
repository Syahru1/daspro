
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jam kerja : ");
        double H = sc.nextDouble();
        System.out.print("Masukkan tingkat upah : ");
        double R = sc.nextDouble();

        double W = H * R;
        System.out.print("Upah yang anda dapatkan adalah = " + W);
    }
}