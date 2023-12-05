import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan nomor operasi yang dipilih (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan: " + penjumlahan(bilangan1, bilangan2));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + pengurangan(bilangan1, bilangan2));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + perkalian(bilangan1, bilangan2));
                break;
            case 4:
                if (bilangan2 == 0) {
                    System.out.println("Tidak dapat melakukan pembagian dengan nol.");
                } else {
                    System.out.println("Hasil pembagian: " + pembagian(bilangan1, bilangan2));
                }
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
                break;
        }

        scanner.close();
    }

    public static double penjumlahan(double bil1, double bil2) {
        return bil1 + bil2;
    }

    public static double pengurangan(double bil1, double bil2) {
        return bil1 - bil2;
    }

    public static double perkalian(double bil1, double bil2) {
        return bil1 * bil2;
    }

    public static double pembagian(double bil1, double bil2) {
        if (bil2 == 0) {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
            return Double.NaN; // Mengembalikan NaN (Not a Number) jika terjadi pembagian dengan nol
        } else {
            return bil1 / bil2;
        }
    }
}

        
