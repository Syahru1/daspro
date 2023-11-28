import java.util.Scanner;

public class ReservasiRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("********************************************************************");
        System.out.println("||                                                                ||");
        System.out.println("||              Selamat Datang di Restoran Syahrul                ||");
        System.out.println("||                                                                ||");
        System.out.println("********************************************************************");
        System.out.print("Masukkan Nama Pemesan Tempat:");
        String nama = input.nextLine();

        boolean inputNamaValid = false;
        while (!inputNamaValid) {
            if (digitCheck(nama)) {
                System.out.println("Error: Harap masukkan nama tanpa melibatkan angka!");
            } else if (nama.length() > 20) {
                System.out.println("Error: Harap masukkan nama tanpa melebihi 20 karakter!");
            } else{
                inputNamaValid = true; 
            }
        }

        System.out.println("Daftar Hari Untuk Reservasi Tempat :");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu"); 
        System.out.println("Masukkan Hari Pemesanan Anda: ");
        int masukkanHari = input.nextInt();

        System.out.print("Masukkan Jumlah Tamu Yang Hadir:");
        int tamu = input.nextInt();

        boolean inputHariValid = false;
        while (!inputHariValid) {
            if (masukkanHari < 1 || masukkanHari >7) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 7!");
                System.out.println("Masukkan Hari Pemesanan Anda: ");
                masukkanHari = input.nextInt();
            }else {
                System.out.println("Anda Memesan Hari : " + masukkanHari);
                inputHariValid = true;
            }
        }
        
        System.out.println("Daftar Harga + Jam Untuk Reservasi Tempat :");
        System.out.println("1. 08.00 - 12.00 : Rp2.000.000,00/50 orang");
        System.out.println("2. 13.00 - 17.00 : Rp2.000.000,00/50 orang");
        System.out.println("3. 18.00 - 22.00 : Rp2.500.000,00/50 orang");
        System.out.println("4. 08.00 - 17.00 : Rp3.500.000,00/50 orang");
        System.out.println("5. 13.00 - 22.00 : Rp4.000.000,00/50 orang");
        System.out.println("6. 08.00 - 22.00 : Rp5.000.000,00/50 orang");
        System.out.println("Masukkan Jam Pemesanan Anda (Dalam bentuk angka):");
        int jamdanharga = input.nextInt();

        boolean inputJamValid = false;
        while (!inputJamValid) {
            if (jamdanharga < 1 || jamdanharga >7) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 7!");
                System.out.println("Masukkan Jam Pemesanan Anda (Dalam bentuk angka):");
                jamdanharga = input.nextInt();
            }else {
                System.out.println("Anda Memesan Jam dengan Harga : " + jamdanharga);
                inputJamValid = true;
            }
        }

        System.out.println("Daftar Ruangan Yang Tersedia :");
        System.out.println("1. Outdoor lt 1 : max 200 orang");
        System.out.println("2. Indoor lt 1 : max 150 orang");
        System.out.println("3. Indoor lt 2 : max 100 orang");
        System.out.println("4. Outdoor lt 2 : max 100 orang");
        System.out.println("Masukkan Ruangan Pemesanan Anda (Dalam Bentuk Angka) :");
        int ruangan = input.nextInt();

            if ( ruangan < 1 || ruangan > 4) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 4!");
                System.out.println("Masukkan Ruangan Pemesanan Anda (Dalam bentuk angka):");
                ruangan = input.nextInt();
            }else {
                System.out.println("Anda Memesan Ruangan : " + ruangan);
                inputJamValid = true;
            }
            

        System.out.println("Daftar Paket Menu Yang Tersedia :");
        System.out.println("1. Paket A : Pecel, Ayam Geprek, Soto, Es Buah");
        System.out.println("2. Paket B : Lalapan, Soto, Nasi Goreng, Es Buah");
        System.out.println("3. Paket C : Rawon, Lalapan, Pecel, Jus Buah");
        System.out.println("Masukkan Pilihan Paket Menu Pemesanan Anda (Dalam Bentuk Angka) :");
        int menu = input.nextInt();

        boolean inputMenuValid = false;
        while (!inputMenuValid) {
            if (menu < 1 || menu > 3) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 3!");
                System.out.println("Masukkan Menu Pemesanan Anda (Dalam bentuk angka):");
                menu = input.nextByte();
            }else {
                System.out.println("Anda Memesan Menu : " + menu);
                inputMenuValid = true;
            }
        }
        System.out.println("************************************");
        System.out.println("|| Terimakaih Atas Pemesanan Anda ||");
        System.out.println("||     Rincian Pemesanan Anda     ||");
        System.out.println("************************************");
        System.out.println("Nama \t\t\t\t: "+ nama);
        System.out.println("Jumlah Tamu \t\t\t: "+ tamu);
        System.out.println("Hari \t\t\t\t: "+ masukkanHari);
        System.out.println("Jam dan Harga \t\t\t: "+ jamdanharga);
        System.out.println("Ruangan \t\t\t: "+ruangan);
        System.out.println("Menu \t\t\t\t: "+menu);
    }

    public static boolean digitCheck(String isDigitExist) {
        for (char checkNumber : isDigitExist.toCharArray()) {
            if (Character.isDigit(checkNumber)) {
                return true;
            }
        }
        return false;
    }
}

