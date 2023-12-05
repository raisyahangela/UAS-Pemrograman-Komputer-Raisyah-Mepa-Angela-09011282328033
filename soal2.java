import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        // Nilai username dan password yang telah ditentukan
        String usernameBenar = "Raisyah";
        String passwordBenar = "halonamasaya";

        boolean berhasilAutentikasi = false;
        Scanner scanner = new Scanner(System.in);

        // Loop autentikasi untuk memberikan kesempatan mencoba kembali
        while (!berhasilAutentikasi) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Memeriksa apakah username dan password yang dimasukkan sesuai
            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                System.out.println("Autentikasi Berhasil");
                berhasilAutentikasi = true; // Keluar dari loop setelah berhasil autentikasi
            } else {
                System.out.println("Autentikasi Gagal. Silakan coba lagi.");
            }
        }

        scanner.close(); // Menutup objek Scanner setelah penggunaan selesai
    }
}


