import java.util.Scanner;

public class Percobaan21 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1 ");
            return 1;
        }else {
            int hasilRekursif = hitungPangkat(x, y - 1);
            System.out.print("x " + x + " ");
            return x * hasilRekursif;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println("\nHasil perhitungan pangkat : " + hasil);
    }
}