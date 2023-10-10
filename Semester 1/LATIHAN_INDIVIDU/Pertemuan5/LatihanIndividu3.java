import java.util.Scanner;

public class LatihanIndividu3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan koefisien a");
        double a = input.nextDouble();
        System.out.println("Masukkan koefisien b");
        double b = input.nextDouble();
        System.out.println("Masukkan koefisien c");
        double c = input.nextDouble();

        input.close();

        double diskriminan = b * b - 4 * a * c;
        if (diskriminan > 0) {
            double akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Akar pertama: " + akar1);
            System.out.println("Akar kedua: " + akar2); // Fixed the output here
        } else if (diskriminan == 0) {
            double akar = -b / (2 * a);
            System.out.println("Akar tunggal: " + akar);
        } else {
            System.out.println("Persamaan tidak memiliki akar real.");
        }
    }
}