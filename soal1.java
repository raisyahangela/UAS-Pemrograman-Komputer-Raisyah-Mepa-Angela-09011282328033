import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = scanner.nextDouble();
        double totalHarga = hitungTotalHarga(jumlahBarang, hargaPerBarang);
        System.out.println("Total harga setelah diskon: " + totalHarga);
    }

    public static double hitungTotalHarga(int jumlahBarang, double hargaPerBarang) {
        double totalHarga;
        double diskon = 0;

        if (jumlahBarang < 5) {
            // Tidak ada diskon
            totalHarga = jumlahBarang * hargaPerBarang;
        } else if (jumlahBarang <= 10) {
            // Diskon 5%
            diskon = 0.05 * (jumlahBarang * hargaPerBarang);
            totalHarga = (jumlahBarang * hargaPerBarang) - diskon;
        } else if (jumlahBarang <= 20) {
            // Diskon 10%
            diskon = 0.1 * (jumlahBarang * hargaPerBarang);
            totalHarga = (jumlahBarang * hargaPerBarang) - diskon;
        } else {
            // Diskon 20%
            diskon = 0.2 * (jumlahBarang * hargaPerBarang);
            totalHarga = (jumlahBarang * hargaPerBarang) - diskon;
        }
        return totalHarga;
    }
}

    

