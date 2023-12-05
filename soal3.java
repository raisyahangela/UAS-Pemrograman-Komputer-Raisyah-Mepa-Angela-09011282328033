import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah suku deret Fibonacci yang ingin ditampilkan: ");
        int n = scanner.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int prev = 0;
            int current = 1;
            int result = 0;
            
            for (int i = 2; i <= n; i++) {
                result = prev + current;
                prev = current;
                current = result;
            }
            
            return result;
        }
    }
}

