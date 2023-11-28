import java.util.Scanner;

public class Ucapan_119 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        System.out.println("Ucapan diterima dari : " + namaOrang);
        sc.close();
        return namaOrang;
    }
}