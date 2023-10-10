import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        // Input pay amount
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pay amount: $");
        double pay = input.nextDouble();

        // Calculate bonus
        double bonus;
        
        if (pay > 3000) {
            bonus = 300;
        } else if (pay > 1600) {
            bonus = pay * 10 / 100;
            if (bonus > 240) {
                bonus = 240;
            }
        } else {
            bonus = pay * 15 / 100;
            if (bonus < 100) {
                bonus = 100;
            }
        }

        // Print bonus
        System.out.println("The calculated bonus is: $" + bonus);

        // Close the scanner
        input.close();
    }
}

