package Pertemuan7;
import java.util.Scanner;

public class MahasiswaPerempuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa = 30;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + i + ": ");
            String nama = input.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P) mahasiswa ke-" + i + ": ");
            String jenisKelamin = input.nextLine();
            
            if (jenisKelamin.equalsIgnoreCase("P")) {
                System.out.println("Mahasiswa perempuan: " + nama);
            }
        }
    }
}