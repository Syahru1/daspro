import java.util.Scanner;

public class Pemilihan2Percobaan1219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.print("Masukkan Sudut 1 : ");
        float sudut1 = input19.nextFloat();
        System.out.print("Masukkan Sudut 2 : ");
        float sudut2 = input19.nextFloat();
        System.out.print("Masukkan Sudut 3 : ");
        float sudut3 = input19.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga Tersebut Adalah Segitiga Siku-Siku");
            }else if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
            }else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) { 
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Kaki");
            }else {
                System.out.println("Segitiga Tersebut Adalah Segitiga Sembarang");
            }   
        }else {
            System.out.println("Bukan Segitiga");
        }
    } 
}