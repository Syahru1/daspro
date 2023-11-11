import java.util.Scanner;

public class BioskopWithScanner119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                penonton[baris-1][kolom-1] = nama;
            }
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }else if (menu == 2) {
                System.out.println("Daftar Penonton");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String penontonNama = penonton[i][j];
                        if (penontonNama != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penontonNama);
                        }
                    }
                }
            }else if (menu == 3) {
                System.out.println("Terima kasih! Keluar dari program.");
                break;
            }else {
                System.out.println("Menu tidak valid. Silahkan pilih 1, 2, atau 3.");
            }
            
        }

    }
    
}