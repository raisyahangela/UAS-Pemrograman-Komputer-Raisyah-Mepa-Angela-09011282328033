import java.util.ArrayList;
import java.util.Scanner;

public class Akun {

    private String username;
    private String password;
    private boolean aktif;

    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public static void main(String[] args) {
        ArrayList<Akun> daftarAkun = new ArrayList<>();

        // Tambahkan akun-akun
        daftarAkun.add(new Akun("Rara", "p1"));
        daftarAkun.add(new Akun("Ayu", "p2"));
        daftarAkun.add(new Akun("Kia", "p3"));

        // Aktifkan akun
        System.out.println("Masukkan username akun yang ingin diaktifkan: ");
        Scanner input = new Scanner(System.in);
        String usernameAkun = input.nextLine();
        for (Akun akun : daftarAkun) {
            if (akun.getUsername().equals(usernameAkun)) {
                akun.setAktif(true);
                break;
            }
        }

        // Nonaktifkan akun
        System.out.println("Masukkan username akun yang ingin dinonaktifkan: ");
        usernameAkun = input.nextLine();
        for (Akun akun : daftarAkun) {
            if (akun.getUsername().equals(usernameAkun)) {
                akun.setAktif(false);
                break;
            }
        }

        // Tampilkan daftar akun
        for (Akun akun : daftarAkun) {
            System.out.println("Username: " + akun.getUsername());
            System.out.println("Password: " + akun.getPassword());
            System.out.println("Aktif: " + akun.isAktif());
            System.out.println();
        }
    }
}
