import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif yang ingin difaktorisasi: ");
        int bilangan = scanner.nextInt();

        if (bilangan <= 1) {
            System.out.println("Bilangan harus lebih besar dari 1.");
        } else {
            System.out.print("Faktorisasi " + bilangan + ": ");
            faktorisasi(bilangan);
        }

        scanner.close();
    }

    public static void faktorisasi(int bilangan) {
        int faktor = 2;
        while (bilangan > 1) {
            if (bilangan % faktor == 0) {
                System.out.print(faktor);
                bilangan /= faktor;
                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            } else {
                faktor++;
            }
        }
    }
}

