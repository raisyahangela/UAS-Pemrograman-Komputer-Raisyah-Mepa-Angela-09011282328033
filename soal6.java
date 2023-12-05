import java.util.Scanner;
public class soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Kata atau frase tersebut adalah palindrom.");
        } else {
            System.out.println("Kata atau frase tersebut bukan palindrom.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Menghapus karakter non-alfabet dan merubah ke huruf kecil
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        int length = str.length();
        if (length <= 1) {
            return true; // Kata dengan panjang 0 atau 1 pasti palindrom
        }

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // Jika ada perbedaan, bukan palindrom
            }
        }
        return true; // Jika tidak ada perbedaan, merupakan palindrom
    }
}
