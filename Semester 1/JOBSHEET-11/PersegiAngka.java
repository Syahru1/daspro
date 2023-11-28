import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N || i == j || j == (N - i + 1)) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
