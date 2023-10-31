import java.util.Scanner;

public class Individu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Cetak elemen array secara terbalik
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        } sc.close();
    } 
}