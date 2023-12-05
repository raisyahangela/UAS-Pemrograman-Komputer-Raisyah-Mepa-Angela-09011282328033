import java.util.Stack;

public class CekKurungMatematika {
    
    // Method untuk memeriksa apakah urutan kurung sudah benar
    static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);
            
            if (karakter == '(') {
                stack.push(karakter);
            } else if (karakter == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false; // Kurung tutup tanpa pasangan kurung buka
                }
                stack.pop(); // Pasangan kurung ditemukan, kurung buka dihapus dari stack
            }
        }
        // Jika masih ada kurung buka yang belum memiliki pasangan
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String ekspresi1 = "((2 + 3) * 5)"; // Contoh ekspresi matematika dengan urutan kurung yang benar
        String ekspresi2 = "((2 + 3) * 5))"; // Contoh ekspresi matematika dengan urutan kurung yang salah
        
        // Memeriksa urutan kurung untuk ekspresi1
        if (cekUrutanKurung(ekspresi1)) {
            System.out.println("Urutan kurung pada ekspresi1 adalah benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi1 adalah salah.");
        }
        
        // Memeriksa urutan kurung untuk ekspresi2
        if (cekUrutanKurung(ekspresi2)) {
            System.out.println("Urutan kurung pada ekspresi2 adalah benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi2 adalah salah.");
        }
    }
}
