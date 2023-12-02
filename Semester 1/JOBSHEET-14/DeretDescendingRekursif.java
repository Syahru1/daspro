import java.util.Scanner;

public class DeretDescendingRekursif {
    static void deretDescendingInteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void deretDescendingRekursif(int n) {
        if ( n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        
        System.out.println("Menggunakan fungsi iteratif : ");
        deretDescendingInteratif(n);
        System.out.println("Menggunakan fungsi rekursif : ");
        deretDescendingRekursif(n);
    }
}
