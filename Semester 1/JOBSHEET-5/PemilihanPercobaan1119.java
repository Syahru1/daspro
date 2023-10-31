import java.util.Scanner;
public class PemilihanPercobaan1119 {
    public static void main(String[] args) {
    Scanner input19 = new Scanner(System.in);

    System.out.println("Masukkan Angka: ");
    int angka = input19.nextInt();
 
    String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
    System.out.println("Angka " + angka + " adalah bilangan " + jenisAngka);
    }
}
