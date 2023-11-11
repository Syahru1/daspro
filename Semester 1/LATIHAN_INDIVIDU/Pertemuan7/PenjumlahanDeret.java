package Pertemuan7;

public class PenjumlahanDeret {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 25; i >= 1; i--) {
            sum += i;
        }
        System.out.println("Hasil penjumlahan deret bilangan 25 sampai 1 adalah: " + sum);
    }
}