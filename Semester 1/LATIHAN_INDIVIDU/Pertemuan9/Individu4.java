import java.util.Scanner;
public class Individu4 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int sum = 0;

        double rata2;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Masukkan bilangan bulat");
            arr[i] = sc.nextInt();
        }
         for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
            rata2 = sum/arr.length;
        System.out.println("Rata-rata: " + rata2);
        sc.close();
    }
}