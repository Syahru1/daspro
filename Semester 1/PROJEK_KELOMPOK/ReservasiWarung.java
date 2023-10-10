import java.util.Scanner;

public class ReservasiWarung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda (maksimal 20 karakter): ");
        String name = input.nextLine();

        if (digitCheck(name)) {
            System.out.println("Error: Harap masukkan nama tanpa melibatkan angka!");
        } else if (name.length() > 20) {
            System.out.println("Error: Harap masukkan nama tanpa melebihi 20 karakter!");
        } else {
            System.out.println("Nama Anda adalah " + name);

            System.out.println("\nDaftar Hari Untuk Reservasi Tempat :");
            System.out.println("1. Senin");
            System.out.println("2. Selasa");
            System.out.println("3. Rabu");
            System.out.println("4. Kamis");
            System.out.println("5. Jumat");
            System.out.println("6. Sabtu");
            System.out.println("7. Minggu"); 

            System.out.print("Masukkan hari pemesanan Anda (dalam bentuk angka): ");
            byte masukkanHari = input.nextByte();

            if (masukkanHari > 7) {
                System.out.println("Error: Masukkan hari pemesanan dari 1 sampai 7!");
            } else {
                System.out.println("Hari pemesanan Anda adalah hari " + hari(masukkanHari));

                System.out.println("\nDaftar Harga dan Jam Untuk Reservasi Tempat :");
                System.out.println("1. 08.00 - 12.00 : Rp2.000.000,00/50 orang");
                System.out.println("2. 13.00 - 17.00 : Rp2.000.000,00/50 orang");
                System.out.println("3. 18.00 - 22.00 : Rp2.500.000,00/50 orang");
                System.out.println("4. 08.00 - 17.00 : Rp3.500.000,00/50 orang");
                System.out.println("5. 13.00 - 22.00 : Rp4.000.000,00/50 orang");
                System.out.println("6. 08.00 - 22.00 : Rp5.000.000,00/50 orang");

                System.out.print("Masukkan harga dan jam Anda (dalam bentuk angka): ");
                byte masukkanHargadanJam = input.nextByte();

                if (masukkanHargadanJam > 6) {
                    System.out.println("Error: Masukkan hari pemesanan dari 1 sampai 6!");
                } else {
                    System.out.println("Anda memilih jam dan harga yaitu pada pukul " + hargaDanJam(masukkanHargadanJam));

                    System.out.println("\nDaftar Ruangan Yang Tersedia :");
                    System.out.println("1. Outdoor lt 1: max 200 orang");
                    System.out.println("2. Indoor lt 1 : max 150 orang");
                    System.out.println("3. Indoor lt 2 : max 100 orang");
                    System.out.println("4. Outdoor lt 2 : max 100 orang");
                }
            }
        }
    }

    public static boolean digitCheck(String isDigitExist) {
        for (char checkNumber : isDigitExist.toCharArray()) {
            if (Character.isDigit(checkNumber)) {
                return true;
            }
        }
        return false;
    }

    public static String hargaDanJam(int angkaHargaDanJam) {
        switch (angkaHargaDanJam) {
            case 1:
                return "1. 08.00 - 12.00 : Rp2.000.000,00/50 orang";
            case 2:
                return "2. 13.00 - 17.00 : Rp2.000.000,00/50 orang";
            case 3:
                return "3. 18.00 - 22.00 : Rp2.500.000,00/50 orang";
            case 4:
                return "4. 08.00 - 17.00 : Rp3.500.000,00/50 orang";
            case 5:
                return "5. 13.00 - 22.00 : Rp4.000.000,00/50 orang";
            case 6:
                return "6. 08.00 - 22.00 : Rp5.000.000,00/50 orang";
            default:
                return "Tidak valid";
        }
    }

    public static String hari(int angkaHari) {
        switch (angkaHari) {
            case 1:
                return "Senin";
            case 2:
                return "Selasa";
            case 3:
                return "Rabu";
            case 4:
                return "Kamis";
            case 5:
                return "Jumat";
            case 6:
                return "Sabtu";
            case 7:
                return "Minggu";
            default:
                return "Tidak valid";
        }
    }
}
