import java.util.Scanner;

public class PenjumlahanRekursif {
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        }else {
            int hasilRekursif = penjumlahanRekursif(n - 1);
            System.out.print("+ " + n  + " ");
            return n + hasilRekursif;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        int hasil = penjumlahanRekursif(n);
        System.out.println("\nPenjumlahan dari 1 sampai " + n + " adalah : " + hasil);
    }
}