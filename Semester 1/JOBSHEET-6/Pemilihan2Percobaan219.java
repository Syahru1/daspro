import java.util.Scanner;

public class Pemilihan2Percobaan219 {
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
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else {
                System.out.println("Segitiga tersebut adalah nukan segitiga siku-siku");
            }   
        }else {
            System.out.println("Bukan Segitiga");
        }
    } 
}
