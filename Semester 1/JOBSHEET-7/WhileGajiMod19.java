import java.util.Scanner;
public class WhileGajiMod19{
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        int jumlahKaryawan, jumlahjamlembur;
        double gajilembur = 0;
        double totalgajilembur =0;
        String jabatan;
        System.out.println("masukkan jumlah karyawan");
        jumlahKaryawan = input19.nextInt();
        int i = 0;
        while(i < jumlahKaryawan){
            System.out.println("pilihan jabatan  - direktur, manajer, karyawan");
             jabatan = input19.nextLine();
            System.out.println("masukkan jabatan karyawan ke-" + (i+1) + ":");
            jabatan = input19.nextLine();
            System.out.println("masukkan jumlah jam lembur: ");
            jumlahjamlembur = input19.nextInt();
            i++;
            if (jabatan.equalsIgnoreCase("direktur")){
                continue; 
            }else if (jabatan.equalsIgnoreCase("manajer")){
                gajilembur = jumlahjamlembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")){
                gajilembur = jumlahjamlembur*75000;
            } 
            else{
                gajilembur = 0;
                System.out.println("jabatan invalid");
                i--;
                continue;
            }
            totalgajilembur += gajilembur;
    }
    System.out.println("total gaji lembur :" + totalgajilembur);
    input19.close();
}
}