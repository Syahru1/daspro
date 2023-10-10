import java.util.Scanner;
public class PemilihanPercobaan119 {
    public static void main(String[] args) {
    Scanner input19 = new Scanner(System.in);

    System.out.println("Masukkan Angka: ");
    int angka = input19.nextInt();
        //if (angka % 2 == 0) {
            //System.out.println("Angka "+angka+" bilangan genap");
        //}else {
            //System.out.println("Angka "+angka+" bilangan ganjil");
        //}
    //}
    String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
    System.out.println("Angka " + angka + " adalah bilangan " + jenisAngka);
    }
}
