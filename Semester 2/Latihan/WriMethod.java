import java.util.Scanner;

public class WriMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int susu;
        System.out.println("Ussername: ");

        susu = input.nextInt();
        String x = "Sayang Kamu";
       
        if (susu % 2 == 0) {
            System.out.println("Betul Sih");
            }else {
                System.out.println("Gatau Ya");
            }
        String output = (susu % 2 == 0) ? x +" " + "Huhu" : x +" " + "Haha";
        System.out.print(output);
        input.close();
    }
    
}
