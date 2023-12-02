public class ContohPercobaan519 {
    static void Tampil(String str, int... a, double... b) {
        System.out.println("String: " + str);

        System.out.println("Jumlah argumen int: " + a.length);
        for (int i : a) {
            System.out.println(i + " ");
        }

        System.out.println("\nJumlah argumen double: " + b.length);
        for (double d : b) {
            System.out.println(d + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Tampil("Contoh Varargs", 1, 2, 3, 4, 5, 1.1, 2.2, 3.3);
    }
}