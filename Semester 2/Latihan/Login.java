import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String username= input.nextLine();
        System.out.print("Masukkan Password: ");
        String password= input.nextLine();
        System.out.println("Usernamemu: " + username);
        System.out.println("Passwordmu: " + password);
        if (username.equals("Syahrul")){
            if (password.equals("Saya123")){
                System.out.println("Selamat Anda Berhasil");
            }
            else{
            System.out.println("anda gagal : (");
            }
        System.out.println("Selamat Anda Berhasil");
        }
        else{
            System.out.println("Selamat Anda Gagal");
        }
    }

}

    

    

