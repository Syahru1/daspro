import java.util.Scanner;

public class Kubus19 {
    static int hitungVolume(int s) {
        int volume = s*s*s;
        return volume;
    }
    static int hitungLuasPermukaan(int s) {
        int volume = hitungVolume(s);
        int Luas = volume*6;
        return Luas;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sisi, L, V;
    System.out.print("Masukkan Panjang sisi kubus : ");
    sisi = sc.nextInt();
    V = hitungVolume(sisi);
    System.out.println("Volume kubus : " + V);
    L = hitungLuasPermukaan(sisi);
    System.out.println("Luas Permukaan kubus : " + L);
    }
}