import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean cekPrimaRekursif(int n, int divisor) {
        if (n <= 1) {
            return false;
        }else if (divisor == 1) {
            return true;
        }else {
            if (n % divisor == 0) {
                return false;
            }else {
                return cekPrimaRekursif(n, divisor - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        boolean hasil = cekPrimaRekursif(n, n - 1);

        if (hasil) {
            System.out.println(n + " adalah bilangan prima.");
        }else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}