import java.util.Arrays;

public class Numbers319 {
    public static void main(String[] args) {
        int maxLength = 5;
        
        int [][] myNumbers = new int[3][maxLength];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}

