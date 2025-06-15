import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        scanner.close();
    }
}
