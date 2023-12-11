import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KasirMobilePayment {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int baris, kolom;
            String nama, next;
    
            String[][] pelanggan = new String[4][2];
    
            while (true) {
                System.out.println("|====================================|");
                System.out.println("|                                    |");
                System.out.println("|          RESTAURANT SYAHRUL        |");
                System.out.println("|                                    |");
                System.out.println("|====================================|");
                System.out.println("|                 MENU               |");
                System.out.println("|1. Input pesanan pelanggan          |");
                System.out.println("|2. Tampilkan daftar pelanggan       |");
                System.out.println("|3. Exit                             |");
                System.out.println("|====================================|");
                System.out.print("Pilih menu (1/2/3) : ");
                int menu = input.nextInt();
                input.nextLine();
    
                if (menu == 1) {
                    System.out.print("Masukkan nama pelanggan : ");
                    nama = input.nextLine();
    
                    System.out.println("|====================================|");
                    System.out.println("|1. Makanan                          |");
                    System.out.println("|2. Minuman                          |");
                    System.out.println("|3. Total harga                      |");
                    System.out.println("|4. Exit                             |");
                    System.out.println("|====================================|");
                    System.out.print("Pilih menu (1/2/3/4) : ");
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
                        System.out.println("|                                    |");
                        System.out.println("|====================================|");
    
                        System.out.print("Pilih makanan 1/2/3/4/5/6/7/8/9/10 : ");
                        int makanan = input.nextInt();
    
                        System.out.print("Berapa porsi : ");
                        int jum_porsi = input.nextInt();
                        
                        int total_makan = 0;
                        String nama_makanan = null;
    
                        switch (makanan) {
                            case 1:
                                total_makan = jum_porsi * 10000;
                                nama_makanan = "Nasi Goreng";
                                System.out.println("Nasi Goreng " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 2:
                                total_makan = jum_porsi * 12000;
                                nama_makanan = "Ayam Geprek";
                                System.out.println("Ayam Geprek " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 3:
                                total_makan = jum_porsi * 15000;
                                nama_makanan = "Lalapan Ayam";
                                System.out.println("Lalapan Ayam " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 4:
                                total_makan = jum_porsi * 12000;
                                nama_makanan = "Lalapan Lele";
                                System.out.println("Lalapan Lele " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 5:
                                total_makan = jum_porsi * 20000;
                                nama_makanan = "Lalapan Bebek";
                                System.out.println("Lalapan Bebek " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 6:
                                total_makan = jum_porsi * 15000;
                                nama_makanan = "Ayam Bakar";
                                System.out.println("Ayam Bakar " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 7:
                                total_makan = jum_porsi * 8000;
                                nama_makanan = "Mie Ayam";
                                System.out.println("Mie Ayam " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 8:
                                total_makan = jum_porsi * 25000;
                                nama_makanan = "Ikan Bakar";
                                System.out.println("Ikan Bakar " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 9:
                                total_makan = jum_porsi * 7000;
                                nama_makanan = "Tumis Kangkung";
                                System.out.println("Tumis Kangkung " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            case 10:
                                total_makan = jum_porsi * 20000;
                                nama_makanan = "Cumi Asam Manis";
                                System.out.println("Cumi Asam Manis " + jum_porsi + " Porsi : Rp" + total_makan);
                                break;
                            default:
                                System.out.println("Maaf pilihan tidak tersedia");
                                break;
                        }
                    }else if (produk == 2) {
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
                        System.out.println("|                                    |");
                        System.out.println("|====================================|");
    
                        System.out.print("Pilih minuman 1/2/3/4/5/6/7/8/9/10 : ");
                        int minuman = input.nextInt();
    
                        System.out.print("Berapa porsi : ");
                        int jum_gelas = input.nextInt();
    
                        String nama_minum = null;
                        int total_minum = 0;
    
                        switch (minuman) {
                            case 1:
                                total_minum = jum_gelas * 3000;
                                nama_minum = "Es Teh";
                                System.out.println("Es Teh " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                        case 2:
                                total_minum = jum_gelas * 3000;
                                nama_minum = "Teh Hangat";
                                System.out.println("Teh Hangat " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                            case 3:
                                total_minum = jum_gelas * 4000;
                                nama_minum = "Es Jeruk";
                                System.out.println("Es Jeruk " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                        case 4:
                                total_minum = jum_gelas * 4000;
                                nama_minum = "Jeruk Hangat";
                                System.out.println("Jeruk Hangat " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                        case 5:
                                total_minum = jum_gelas * 8000;
                                nama_minum = "Es Coklat";
                                System.out.println("Es Coklat " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                        case 6:
                                total_minum = jum_gelas * 5000;
                                nama_minum = "Es Cendol";
                                System.out.println("Es Cendol " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                            case 7:
                                total_minum = jum_gelas * 8000;
                                nama_minum = "Es Buah";
                                System.out.println("Es Buah " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                            case 8:
                                total_minum = jum_gelas * 10000;
                                nama_minum = "Soda Gembira";
                                System.out.println("Soda Gembira " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                            case 9:
                                total_minum = jum_gelas * 5000;
                                nama_minum = "Es Cincau";
                                System.out.println("Es Cinacu " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                            case 10:
                                total_minum = jum_gelas * 7000;
                                nama_minum = "Aneka Jus";
                                System.out.println("Aneka Jus " + jum_gelas + " Porsi : Rp" + total_minum);
                                break;
                            default:
                                System.out.println("Maaf pilihan tidak tersedia");
                                break;
                        }
                    }else if (produk == 3) {
    
                        System.out.println("|====================================|");
                        System.out.println("|                                    |");
                        System.out.println("|      KASIR RESTAURANT SYAHRUL      |");
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
                    }
                }
            }
        }
        private String username;
        private double saldo;
        private Map<String, Double> transactionHistory;
    
        public User(String username, double saldo) {
            this.username = username;
            this.saldo = saldo;
            this.transactionHistory = new HashMap<>();
        }
    
        public String getUsername() {
            return username;
        }
    
        public double getSaldo() {
            return saldo;
        }
    
        public void topUp(double amount) {
            saldo += amount;
            System.out.println("Top-up berhasil. Saldo sekarang: " + saldo);
        }
    
        public void makePayment(String recipient, double amount) {
            if (saldo >= amount) {
                saldo -= amount;
                transactionHistory.put("Pembayaran kepada " + recipient, amount);
                System.out.println("Pembayaran berhasil. Saldo sekarang: " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi untuk pembayaran ini.");
            }
        }
    
        public void viewTransactionHistory() {
            System.out.println("Riwayat Transaksi:");
            for (Map.Entry<String, Double> entry : transactionHistory.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    
    // Kelas utama untuk menjalankan program mobile payment
    public class MobilePaymentApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Membuat dua pengguna
            User user1 = new User("user1", 100.0);
            User user2 = new User("user2", 50.0);
    
            // Menampilkan menu
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Top-up Saldo");
                System.out.println("2. Membuat Pembayaran");
                System.out.println("3. Lihat Riwayat Transaksi");
                System.out.println("4. Keluar");
                System.out.print("Pilihan Anda: ");
    
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Masukkan jumlah top-up: ");
                        double topUpAmount = scanner.nextDouble();
                        user1.topUp(topUpAmount);
                        break;
                    case 2:
                        System.out.print("Masukkan nama penerima: ");
                        String recipient = scanner.next();
                        System.out.print("Masukkan jumlah pembayaran: ");
                        double paymentAmount = scanner.nextDouble();
                        user1.makePayment(recipient, paymentAmount);
                        break;
                    case 3:
                        user1.viewTransactionHistory();
                        break;
                    case 4:
                        System.out.println("Keluar dari program. Terima kasih!");
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
            }
        }
    }