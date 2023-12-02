import java.util.Scanner;

public class Fibonacci {
    static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }else if (bulan < 1) {
            return 0;
        }else{
            return hitungPasanganMarmut( bulan - 2) + hitungPasanganMarmut(bulan - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan : ");
        int bulan = sc.nextInt();

        System.out.println("|Bulan|\t\t|pasangan produktif|\t|Pasangan Belum produktif|\t|Total Pasangan|");

        for ( int i = 1; i <= bulan; i++) {
            int totalPAS = hitungPasanganMarmut(i);
            int jumlahPasangan = hitungPasanganMarmut(i -1);
            int belumProduktif = hitungPasanganMarmut(i - 2);
            System.out.println(i + "\t\t\t" + belumProduktif + "\t\t\t" + jumlahPasangan + "\t\t\t" + totalPAS);
        }
        sc.close();
    }
}
