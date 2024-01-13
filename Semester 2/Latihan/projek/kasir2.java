import java.util.Scanner;

public class kasir2 {
    static Scanner input = new Scanner(System.in);
    static String[][] tempat = new String[3][50];

    public static void main(String[] args) {
        while (true) {
            displayMainMenu();
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    inputPesanan();
                    break;
                case 2:
                    inputMeja();
                    break;
                case 3:
                    tampilkanDaftarPelanggan();
                    break;
                case 4:
                    System.out.println("Terima kasih! Anda keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1, 2, 3, atau 4.");
            }
        }
    }

    static void displayMainMenu() {
        System.out.println("|====================================|");
        System.out.println("|                                    |");
        System.out.println("|          RESTAURANT DEBIAN         |");
        System.out.println("|                                    |");
        System.out.println("|====================================|");
        System.out.println("|                MENU                |");
        System.out.println("|1. Input pesanan pelanggan          |");
        System.out.println("|2. Input meja pelanggan             |");
        System.out.println("|3. Tampilkan daftar pelanggan       |");
        System.out.println("|4. Exit                             |");
        System.out.println("|====================================|");
        System.out.print("Pilih menu (1/2/3/4) : ");
    }

    static void inputPesanan() {
        System.out.println("|====================================|");
        System.out.println("|                                    |");
        System.out.println("|                MENU 1              |");
        System.out.println("|                                    |");
        System.out.println("|====================================|");
        System.out.println("|1. Makanan & Minuman                |");
        System.out.println("|2. Exit                             |");
        System.out.println("|====================================|");
        System.out.print("Pilih menu (1/2/) : ");
        int produk = input.nextInt();
        input.nextLine();

        if (produk == 1) {
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|            PILIH MAKANAN           |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|   1. Nasi Goreng      Rp 10.000    |");
            System.out.println("|   2. Ayam Geprek      Rp 12.000    |");
            System.out.println("|   3. Lalapan Ayam     Rp 15.000    |");
            System.out.println("|   4. Lalapan Lele     Rp 12.000    |");
            System.out.println("|   5. Lalapan Bebek    Rp 20.000    |");
            System.out.println("|   6. Ayam Bakar       Rp 15.000    |");
            System.out.println("|   7. Mie Ayam         Rp 8.000     |");
            System.out.println("|   8. Ikan Bakar       Rp 25.000    |");
            System.out.println("|   9. Tumis Kangkung   Rp 7.000     |");
            System.out.println("|   10. Cumi Asam Manis Rp 20.000    |");
            System.out.println("| Masukkan angka 0 jika tidak memesan|");
            System.out.println("|                                    |");
            System.out.println("|====================================|");

            System.out.print("Pilih makanan 1/2/3/4/5/6/7/8/9/10 : ");
            int makanan = input.nextInt();

            int total_makan = 0;
            String nama_makanan = null;
            int jum_porsi = 0;

            switch (makanan) {
                case 1:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 10000;
                    nama_makanan = "Nasi Goreng";
                    System.out.println("Nasi Goreng " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 2:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 12000;
                    nama_makanan = "Ayam Geprek";
                    System.out.println("Ayam Geprek " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 3:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 15000;
                    nama_makanan = "Lalapan Ayam";
                    System.out.println("Lalapan Ayam " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 4:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 12000;
                    nama_makanan = "Lalapan Lele";
                    System.out.println("Lalapan Lele " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 5:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 20000;
                    nama_makanan = "Lalapan Bebek";
                    System.out.println("Lalapan Bebek " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 6:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 15000;
                    nama_makanan = "Ayam Bakar";
                    System.out.println("Ayam Bakar " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 7:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 8000;
                    nama_makanan = "Mie Ayam";
                    System.out.println("Mie Ayam " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 8:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 25000;
                    nama_makanan = "Ikan Bakar";
                    System.out.println("Ikan Bakar " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 9:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 7000;
                    nama_makanan = "Tumis Kangkung";
                    System.out.println("Tumis Kangkung " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 10:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 20000;
                    nama_makanan = "Cumi Asam Manis";
                    System.out.println("Cumi Asam Manis " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                default:
                    System.out.println("Maaf pilihan tidak tersedia");
                    break;

            }
    
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|            PILIH MINUMAN           |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|   1. Es Teh           Rp 3.000     |");
            System.out.println("|   2. Teh Hangat       Rp 3.000     |");
            System.out.println("|   3. Es Jeruk         Rp 4.000     |");
            System.out.println("|   4. Jeruk Hangat     Rp 4.000     |");
            System.out.println("|   5. Es Coklat        Rp 8.000     |");
            System.out.println("|   6. Es Cendol        Rp 5.000     |");
            System.out.println("|   7. Es Buah          Rp 8.000     |");
            System.out.println("|   8. Soda Gembira     Rp 10.000    |");
            System.out.println("|   9. Es Cincau        Rp 5.000     |");
            System.out.println("|   10. Aneka Jus       Rp 7.000     |");
            System.out.println("| Masukkan angka 0 jika tidak memesan|");
            System.out.println("|                                    |");
            System.out.println("|====================================|");

            System.out.print("Pilih minuman 1/2/3/4/5/6/7/8/9/10 : ");
            int minuman = input.nextInt();

            String nama_minum = null;
            int total_minum = 0;
            int jum_gelas = 0;

            switch (minuman) {
                case 1:      
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 3000;
                    nama_minum = "Es Teh";
                    System.out.println("Es Teh " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 2:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 3000;
                    nama_minum = "Teh Hangat";
                    System.out.println("Teh Hangat " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 3:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 4000;
                    nama_minum = "Es Jeruk";
                    System.out.println("Es Jeruk " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 4:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 4000;
                    nama_minum = "Jeruk Hangat";
                    System.out.println("Jeruk Hangat " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 5:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 8000;
                    nama_minum = "Es Coklat";
                    System.out.println("Es Coklat " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 6:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 5000;
                    nama_minum = "Es Cendol";
                    System.out.println("Es Cendol " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 7:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 8000;
                    nama_minum = "Es Buah";
                    System.out.println("Es Buah " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 8:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 10000;
                    nama_minum = "Soda Gembira";
                    System.out.println("Soda Gembira " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 9:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 5000;
                    nama_minum = "Es Cincau";
                    System.out.println("Es Cincau " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 10:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 7000;
                    nama_minum = "Aneka Jus";
                    System.out.println("Aneka Jus " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                default:
                    System.out.println("Maaf pilihan tidak tersedia");
                    break;
            }
            int total = total_makan + total_minum;
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|      KASIR RESTAURANT DEBIAN       |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|           DAFTAR PEMBELIAN         |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("                                     ");
            System.out.println("   Makanan      : " + nama_makanan);   
            System.out.println("   Jumlah Porsi : " + jum_porsi);
            System.out.println("   Minuman      : " + nama_minum);   
            System.out.println("   Jumlah Porsi : " + jum_gelas);
            System.out.println("|====================================|");
            System.out.println("   Total harga  : RP" + total);
            System.out.println("|====================================|");
                
        }else if (produk == 2) {
            System.out.println("Anda keluar dari menu input pesanan");
        }
    }

    static void inputMeja() {
        Scanner sc = new Scanner(System.in);
        String next;

        while (true) {
            System.out.println("|====================================|");
            System.out.println("|                MENU 2              |");
            System.out.println("|====================================|");
            System.out.println("|     1. Lantai dan Meja             |");
            System.out.println("|     2. Tampilkan daftar meja       |");
            System.out.println("|     3. Exit                        |");
            System.out.println("|====================================|");
            System.out.print("Pilih menu (1/2/3): ");
            int m = sc.nextInt();
            sc.nextLine();

            switch (m) {
                case 1:
                    inputMejaPelanggan();
                    break;
                case 2:
                    tampilkanDaftarMeja();
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silahkan pilih 1, 2, atau 3.");
            }

            System.out.print("Input pelanggan lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    static void inputMejaPelanggan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("Lantai        : ");
        int baris = sc.nextInt();
        System.out.print("Meja          : ");
        int kolom = sc.nextInt();
        sc.nextLine();

        if (baris >= 1 && baris <= tempat.length && kolom >= 1 && kolom <= tempat[0].length) {
            if (tempat[baris - 1][kolom - 1] == null) {
                tempat[baris - 1][kolom - 1] = nama;
                System.out.println("Data pelanggan berhasil dimasukkan.");
            } else {
                System.out.println("Maaf, meja sudah terisi. Silakan pilih meja lain.");
                System.out.print("Lantai : ");
                baris = sc.nextInt();
                System.out.print("Meja   : ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (tempat[baris - 1][kolom - 1] == null) {
                    tempat[baris - 1][kolom - 1] = nama;
                    System.out.println("Data pelanggan berhasil dimasukkan.");
                } else {
                    System.out.println("Maaf, meja sudah terisi. Pembatalan input.");
                }
            } 
        }else {
            System.out.println("Nomor lantai atau meja tidak valid. Silakan coba lagi.");
        }
    }

    static void tampilkanDaftarMeja() {
        System.out.println("Daftar pelanggan");
        for (int i = 0; i < tempat.length; i++) {
            for (int j = 0; j < tempat[i].length; j++) {
                String penontonNama = tempat[i][j];
                if (penontonNama != null) {
                    System.out.println("\nLantai " + (i + 1) + ", \nMeja " + (j + 1) + ": " + penontonNama);
                } else {
                    System.out.println("\nLantai " + (i + 1) + ", \nMeja " + (j + 1) + ": *** (Meja kosong)");
                }
            }
        }
    }
    
    static void tampilkanDaftarPelanggan() {
    }
}