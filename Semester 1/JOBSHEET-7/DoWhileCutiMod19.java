import java.util.Scanner;
public class DoWhileCutiMod19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti :");
        jatahCuti = sc.nextInt();

        do{
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

           if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari :");
                jumlahHari = sc.nextInt();
                
                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.print("Sisa jatah cuti :"  + jatahCuti);
                }else{
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
           else if (konfirmasi.equalsIgnoreCase("t")){
                    break;
                }

        }while (jatahCuti > 0);
    }
}