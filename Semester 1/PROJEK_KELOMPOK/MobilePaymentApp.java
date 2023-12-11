import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Kelas untuk merepresentasikan pengguna dengan saldo dan riwayat transaksi
class User {
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
