import java.util.Scanner;
public class Nilai19 {

    static int jumlahMahasiswa = 5;
    static int jumlahMinggu = 7;
    static int nilaiTertinggi = 0;
    static int mingguNilaiTertinggi = 0;

    private static int [][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

    public static void main(String[] args) {
        jumlahNilaiMahasiswa();
        tampilNilaiMahasiswa();
        NilaiTertinggi();
        tampilMahasiswaNilaiTertinggi();
    }

    private static void jumlahNilaiMahasiswa() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data nilai Mahasiswa ke-" + (i+1));
            for(int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggi ke- " + (j+1) + " : ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }
        }
    }

    private static void tampilNilaiMahasiswa() {
        System.out.println("Nilai tugas mahasiswa : ");
        for(int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + " : ");
            for(int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void NilaiTertinggi() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for(int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguNilaiTertinggi = j + 1;
                }
            }
        }
    }

    private static void tampilMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        int MahasiswaDenganNilaiTertinggi = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for(int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    MahasiswaDenganNilaiTertinggi = i;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke-" +  (MahasiswaDenganNilaiTertinggi + 1)
        +  " dengan nilai " + nilaiTertinggi + " pada minggi ke- " + mingguNilaiTertinggi);
    }
}