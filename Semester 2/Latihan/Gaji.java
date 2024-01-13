import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlmasuk, jmltdkmasuk, totalgaji;
        int bayaran, potongan;
        //int gaji = 40_000, potgaji = 25_000;

        System.out.println("Masukkan jumlah masuk anda");
        jmlmasuk = input.nextInt();
        System.out.println("Masukkan jumlah anda tidak masuk");
        jmltdkmasuk = input.nextInt();
        System.out.println("Masukkan gaji perhari");
        bayaran = input.nextInt();
        System.out.println("Masukkan potongan gaji perhari");
        potongan = input.nextInt();
        System.out.println("Gaji perhari : Rp." + " " + bayaran);
        System.out.println("Potongan Gaji Tidak Masuk perhari : Rp." + " " + potongan);
        totalgaji = (jmlmasuk*bayaran)-(jmltdkmasuk*potongan);
        System.out.println("Total gaji anda :" + " Rp." + totalgaji);


    }
    
}
