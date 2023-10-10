
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan A : ");
        int A = sc.nextInt();
        System.out.print("Masukkan bilangan B : ");
        int B = sc.nextInt();

        int S = A + B;
        System.out.print("Nilai penjumlahan adalah : " + S);
    }
}