import java.util.Scanner;

public class PemilihanPercobaan1219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.println("Nilai uas      : ");    
        float uas = input19.nextFloat();
        System.out.println("Nilai uts       : ");
        float uts = input19.nextFloat();
        System.out.println("Nilai kuis      : ");
        float kuis = input19.nextFloat();
        System.out.println("Nilai tugas     : ");
        float tugas = input19.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (80 < total && total <= 100){
            System.out.println("Nilai Huruf : A");
        }else if (73 < total && total <= 80){
            System.out.println("Nilai Huruf : B+");
        }else if (65 < total && total <= 73){
            System.out.println("Nilai Huruf : B");
        }else if (60 < total && total <= 65){
            System.out.println("Nilai Huruf : C+");
        }else if (50 < total && total <= 60){
            System.out.println("Nilai Huruf : C");
        }else if (39 < total && total <= 50){
            System.out.println("Nilai Huruf : D");
        }else if (total <= 39){
            System.out.println("Nilai Huruf : E");
        }
        input19.close();
    }
    
}