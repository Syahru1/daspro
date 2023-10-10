package Pertemuan6;
import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jenis Buku Yang Tersedia : ");
        System.out.println("1. Kamus");
        System.out.println("2. Novel");
        System.out.println("3. Buku Lain");
        System.out.println();
        System.out.print("Masukkan Jenis Buku Yang Ingin Dibeli : ");
        int jenis = input.nextInt();
        System.out.print("Masukkan Jumlah Buku Yang Dibeli      : ");
        int jmlhBuku = input.nextInt();
        System.out.print("Masukkan Harga Buku Yang Dibeli       : ");
        double hargabuku = input.nextDouble();
        System.out.println();

        // KAMUS
        double diskonkamus = 0.10, diskontambahankamus = 0.02;
        double jumlahdiskon = diskonkamus + diskontambahankamus;
        double totaldiskonkamus = (hargabuku * jmlhBuku) * jumlahdiskon;
        double totalbayarkamus =  (hargabuku * jmlhBuku) - totaldiskonkamus;

        if (jenis == 1 && jmlhBuku > 2) {
            System.out.println("Anda mendapatkan diskon tambahan dari total pembelian kamus lebih dari 2   : " + jumlahdiskon );
            System.out.println("Total diskon anda                                                          : " + totaldiskonkamus );
            System.out.println("Total bayar anda dari pembelian hari ini                                   : " + totalbayarkamus);
        }else if (jenis == 1 && jmlhBuku <= 2) {
            System.out.println("Anda mendapatkan diskon dari pembelian kamus  : " + diskonkamus );
            System.out.println("Total diskon anda                             : " + ((hargabuku * jmlhBuku) * diskonkamus));
            System.out.println("Total bayar anda dari pembelian hari ini      : " + ((hargabuku * jmlhBuku) - ((hargabuku * jmlhBuku) * diskonkamus)));
        }
        
        //NOVEL
        double diskonnovel = 0.08, diskontambahannovel = 0.01;
        double jumlahdiskonnovel = diskonnovel + diskontambahannovel;
        double totaldiskonnovel = (hargabuku * jmlhBuku) * jumlahdiskonnovel;
        double totalbayarnovel = (hargabuku * jmlhBuku) - totaldiskonnovel;

       if (jenis == 2 && jmlhBuku > 2) {
            System.out.println("Anda mendapatkan diskon tambahan dari total pembelian kamus lebih dari 2   : " + jumlahdiskonnovel );
            System.out.println("Total diskon anda                                                          : " + totaldiskonnovel );
            System.out.println("Total bayar anda dari pembelian hari ini                                   : " + totalbayarnovel);
        }else if (jenis == 1 && jmlhBuku <= 2) {
            System.out.println("Anda mendapatkan diskon dari pembelian kamus  : " + diskonnovel );
            System.out.println("Total diskon anda                             : " + ((hargabuku * jmlhBuku) * diskonnovel));
            System.out.println("Total bayar anda dari pembelian hari ini      : " + ((hargabuku * jmlhBuku) - ((hargabuku * jmlhBuku) * diskonnovel)));
        }
        
        //BUKULAIN
        double diskonbukulain = 0.0, diskontambahanbukulain = 0.05;
        double jumlahdiskonbukulain = diskonbukulain + diskontambahanbukulain;
        double totaldiskonbukulain = (hargabuku * jmlhBuku) * jumlahdiskonbukulain;
        double totalbayarbukulain = (hargabuku * jmlhBuku) - totaldiskonbukulain;

         if (jenis == 3 && jmlhBuku > 3) {
            System.out.println("Anda mendapatkan diskon tambahan dari total pembelian kamus lebih dari 2   : " + jumlahdiskonbukulain );
            System.out.println("Total diskon anda                                                          : " + totaldiskonbukulain );
            System.out.println("Total bayar anda dari pembelian hari ini                                   : " + totalbayarbukulain);
        }else if (jenis == 1 && jmlhBuku <= 2) {
            System.out.println("Anda mendapatkan diskon dari pembelian kamus  : " + diskonbukulain );
            System.out.println("Total diskon anda                             : " + ((hargabuku * jmlhBuku) * diskonbukulain));
            System.out.println("Total bayar anda dari pembelian hari ini      : " + ((hargabuku * jmlhBuku) - ((hargabuku * jmlhBuku) * diskonbukulain)));
        }
    }
    
    
}
