import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Matematika : ");
        double nilaiMatematika = input.nextDouble();

        System.out.print("Masukkan nilai Fisika : ");
        double nilaiFisika = input.nextDouble();

        System.out.print("Masukkan nilai bahasa Inggris : ");
        double nilaiInggris = input.nextDouble();

        System.out.print("Masukkan nilai bahasa Indonesia : ");
        double nilaiIndonesia = input.nextDouble();

        double rataRata = (nilaiMatematika + nilaiFisika + nilaiInggris + nilaiIndonesia) / 4;
        System.out.println("Rata rata nilai calon mahasiswa yang mengikuti seleksi adalah : " + rataRata);
    }
    
}
