import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 123, password = 456;

        System.out.print("Masukkan Username: ");
        username = input.nextInt();
        System.out.print("Masukkan Password: ");
        password = input.nextInt();

        if (username == 123  && password == 456){
            System.out.println("Selamat anda berhasil login");
        }else {
            System.out.println("Maaf anda gagal login ");
        }
    }

}