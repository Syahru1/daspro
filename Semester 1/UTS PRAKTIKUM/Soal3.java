import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa yang mengikuti seleksi: ");
        int jumlahSiswa = input.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {

            System.out.print("Masukkan nilai Matematika : ");
            double nilaiMatematika = input.nextDouble();

            System.out.print("Masukkan nilai Fisika : ");
            double nilaiFisika = input.nextDouble();

            System.out.print("Masukkan nilai bahasa Inggris : ");
            double nilaiInggris = input.nextDouble();

            System.out.print("Masukkan nilai bahasa Indonesia : ");
            double nilaiIndonesia = input.nextDouble();

            System.out.println("Masukkan jurusan (IPA/IPS/BAHASA)");
            String jurusan = input.next();

            double rataRata = (nilaiMatematika + nilaiFisika + nilaiInggris + nilaiIndonesia) / 4;
            System.out.println("Rata rata nilai calon mahasiswa yang mengikuti seleksi adalah : " + rataRata);

            if((jurusan.equalsIgnoreCase("IPA") || jurusan.equalsIgnoreCase("IPS")) && nilaiMatematika >= 80 && rataRata >= 80) {
                System.out.print("Selamat anda diterima di prodi D4 TI");
            }else if((jurusan.equalsIgnoreCase("IPA")) && nilaiMatematika >= 70 && nilaiFisika >=70) {
                System.out.print("Selamat anda diterima di prodi D3 MI");
            }else if(((jurusan.equalsIgnoreCase("Bahasa")) && rataRata > 80 && nilaiMatematika >= 70) && nilaiIndonesia >= 70 && nilaiInggris >=70) {
                System.out.print("Selamat anda diterima di prodi D3 MI");
            }else {
                System.out.print("Mohon maaf anda tidak lolos seleksi");
            }
        }   
    }
}