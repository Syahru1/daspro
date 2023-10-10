
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai L : ");
        int L = sc.nextInt();
        System.out.print("Masukkan nilai B : ");
        int B = sc.nextInt();
        System.out.print("Masukkan nilai H : ");
        int H = sc.nextInt();

        int V = L * B * H;
        System.out.print("Nilai volum adalah : " + V);
    }
}