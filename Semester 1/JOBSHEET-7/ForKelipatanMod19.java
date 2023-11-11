import java.util.Scanner;
public class ForKelipatanMod19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah = 0;
        int kelipatan = 0, counter = 0;
        double rata_rata;
        System.out.println("Masukkan bilangan kelipatan (1-9) :");
        kelipatan = scan.nextInt();
        for (int i = 1; i <=50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            } 
        }
        rata_rata = (double) jumlah/counter;
        System.out.printf("Banyak bilangan %d dari 1 sampai 50 %d\n", kelipatan, counter);
         System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 %d\n", kelipatan, jumlah);
          System.out.printf("Total rata rata %d dari 1 sampai 50 %.2f\n", kelipatan, rata_rata);
         scan.close();
        
    }
}
