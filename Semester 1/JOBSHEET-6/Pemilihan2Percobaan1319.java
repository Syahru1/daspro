import java.util.Scanner;
public class Pemilihan2Percobaan1319 {
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = sc19.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = sc19.nextInt();

        if (kategori.equals("pekerja ")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        }else if (kategori.equals("Pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        }else
            System.out.print("Masukkan Kategori Salah ");
    }
    
}