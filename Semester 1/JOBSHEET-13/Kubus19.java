import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    ArrayList<Integer> nilai;

    Mahasiswa(String nama) {
        this.nama = nama;
        this.nilai = new ArrayList<>();
    }

    void inputNilai(int minggu, int nilai) {
        this.nilai.add(nilai);
    }
}

public class Kubus19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        int jumlahMinggu = scanner.nextInt();

        ArrayList<Mahasiswa> mahasiswaList = inputNilaiMahasiswa(jumlahMahasiswa, jumlahMinggu);

        tampilkanNilaiMahasiswa(mahasiswaList);

        int hariTertinggi = hariDenganNilaiTertinggi(mahasiswaList);
        System.out.println("\nHari dengan nilai tertinggi adalah Minggu ke-" + hariTertinggi);

        Mahasiswa mahasiswaTertinggi = mahasiswaDenganNilaiTertinggi(mahasiswaList);
        System.out.println("\nMahasiswa dengan nilai tertinggi: " + mahasiswaTertinggi.nama);
        for (int i = 0; i < mahasiswaTertinggi.nilai.size(); i++) {
            System.out.println("Minggu ke-" + (i + 1) + ": " + mahasiswaTertinggi.nilai.get(i));
        }
    }

    static ArrayList<Mahasiswa> inputNilaiMahasiswa(int jumlahMahasiswa, int jumlahTugas) {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = scanner.next();
            Mahasiswa mahasiswa = new Mahasiswa(nama);

            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai " + nama + " untuk Minggu ke-" + (j + 1) + ": ");
                int nilai = scanner.nextInt();
                mahasiswa.inputNilai(j + 1, nilai);
            }

            mahasiswaList.add(mahasiswa);
        }

        return mahasiswaList;
    }

    static void tampilkanNilaiMahasiswa(ArrayList<Mahasiswa> mahasiswaList) {
        System.out.println("Nilai Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa.nama + ": " + mahasiswa.nilai);
        }
    }

    static int hariDenganNilaiTertinggi(ArrayList<Mahasiswa> mahasiswaList) {
        int jumlahTugas = mahasiswaList.get(0).nilai.size();
        int[] totalNilaiPerHari = new int[jumlahTugas];

        for (Mahasiswa mahasiswa : mahasiswaList) {
            for (int i = 0; i < jumlahTugas; i++) {
                totalNilaiPerHari[i] += mahasiswa.nilai.get(i);
            }
        }

        int hariTertinggi = 1;
        for (int i = 1; i < jumlahTugas; i++) {
            if (totalNilaiPerHari[i] > totalNilaiPerHari[hariTertinggi - 1]) {
                hariTertinggi = i + 1;
            }
        }

        return hariTertinggi;
    }

    static Mahasiswa mahasiswaDenganNilaiTertinggi(ArrayList<Mahasiswa> mahasiswaList) {
        Mahasiswa mahasiswaTertinggi = mahasiswaList.get(0);
        int nilaiTertinggi = hitungTotalNilai(mahasiswaTertinggi);

        for (Mahasiswa mahasiswa : mahasiswaList) {
            int totalNilai = hitungTotalNilai(mahasiswa);
            if (totalNilai > nilaiTertinggi) {
                mahasiswaTertinggi = mahasiswa;
                nilaiTertinggi = totalNilai;
            }
        }

        return mahasiswaTertinggi;
    }

    static int hitungTotalNilai(Mahasiswa mahasiswa) {
        int totalNilai = 0;
        for (int nilai : mahasiswa.nilai) {
            totalNilai += nilai;
        }
        return totalNilai;
    }
}