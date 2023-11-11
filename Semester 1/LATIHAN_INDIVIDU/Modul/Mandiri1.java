import java.util.Scanner;

public class Mandiri1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;

        while (i <= 30) {
            System.out.print("Masukkan nama mahasiswa ke-" + i + ": ");
            String nama = input.nextLine();

            System.out.print("Masukkan jenis kelamin (L/P) mahasiswa ke-" + i + ": ");
            char jenisKelamin = input.next().charAt(0);

            input.nextLine(); 

            if (jenisKelamin == 'P' || jenisKelamin == 'p') {
                System.out.println("Nama Mahasiswa: " + nama);
            }

            i++;
        }

        input.close();
    }
}
