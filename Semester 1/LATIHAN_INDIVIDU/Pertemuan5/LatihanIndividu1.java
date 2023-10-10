import java.util.Scanner;

public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jarak : ");
        int Jarak = input.nextInt();

        
        if (Jarak <= 5) {      
            System.out.println("Mending pake Melee weapon");
        }else{
            System.out.println("Mending pake Ranged weapon");
        }
    }   
}
