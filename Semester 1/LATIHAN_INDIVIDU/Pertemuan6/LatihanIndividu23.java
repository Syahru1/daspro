package Pertemuan6;
import java.util.Scanner;

public class LatihanIndividu23 {
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

        double diskon = 0.0;
        double diskonTambahan = 0.0;

        if (jenis == 1) { // Kamus
            diskon = 0.10;
            diskonTambahan = 0.02;
        } else if (jenis == 2) { // Novel
            diskon = 0.08;
            diskonTambahan = 0.01;
        } else if (jenis == 3) { // Buku Lain
            diskonTambahan = 0.05;
        }

        double jumlahDiskon = (diskon + diskonTambahan);
        double totalDiskon = (hargabuku * jmlhBuku) * jumlahDiskon;
        double totalBayar = (hargabuku * jmlhBuku) - totalDiskon;

        if (jmlhBuku > 2) {
            System.out.println("Anda mendapatkan diskon tambahan dari total pembelian lebih dari 2   : " + jumlahDiskon);
        } else {
            System.out.println("Anda mendapatkan diskon dari pembelian : " + diskon);
        }

        System.out.println("Total diskon anda : " + totalDiskon);
        System.out.println("Total bayar anda dari pembelian hari ini : " + totalBayar);
    }
}