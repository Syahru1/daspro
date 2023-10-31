import java.util.Scanner;

public class individu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] bulan = {"januari","Februari","Maret","April","Mei","Juni","Juli","agustus",
        "September","Oktober","November","desember"};

        System.out.print("Masukkan angka dari 1-12 : ");
        int angka = sc.nextInt();
        if (angka >=1 && angka <=12) {
            System.out.println( "Bulan yang anda pilih adalah : " + bulan[angka-1] );
  
        } else {
            System.out.println("Angka yang dimasukkan tidak valid");
        } sc.close();
    }
}