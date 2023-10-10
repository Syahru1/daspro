package Pertemuan6;

import java.util.Scanner;

public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
    
        System.out.print("Masukkan bil1: ");
        int bil1 = sc19.nextInt();
        System.out.print("Masukkan bil2: ");
        int bil2 = sc19.nextInt();
        System.out.print("Masukkan bil3: ");
        int bil3 = sc19.nextInt();
    
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah bilangan 1");
            } else {
                System.out.println("Bilangan terbesar adalah bilangan 3");
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah bilangan 2");
            } else {
                System.out.println("Bilangan terbesar adalah bilangan 3");
            }
        }
    }
}