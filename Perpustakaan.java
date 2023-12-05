import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {

    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        for (Buku buku : daftarBuku) {
            if (buku.getStatus().equals("Tersedia")) {
                System.out.println("Judul: " + buku.getJudul());
            }
        }
    }

    public void tampilkanInformasiBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Penulis: " + buku.getPenulis());
                System.out.println("Tahun terbit: " + buku.getTahunTerbit());
                System.out.println("Status: " + buku.getStatus());
                break;
            }
        }
    }

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Tambahkan buku-buku
        perpustakaan.tambahBuku(new Buku("The Adventures of Tom Sawyer", "Mark Twain", 1876));
        perpustakaan.tambahBuku(new Buku("Pride and Prejudice", "Jane Austen", 1813));
        perpustakaan.tambahBuku(new Buku("To Kill a Mockingbird", "Harper Lee", 1960));

        // Tampilkan daftar buku yang tersedia
        perpustakaan.tampilkanDaftarBuku();

        // Tampilkan informasi buku berdasarkan input pengguna
        System.out.println("Masukkan judul buku yang ingin Anda lihat informasinya: ");
        Scanner input = new Scanner(System.in);
        String judulBuku = input.nextLine();
        perpustakaan.tampilkanInformasiBuku(judulBuku);
    }
}

class Buku {

    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String status;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status = "Tersedia";
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
