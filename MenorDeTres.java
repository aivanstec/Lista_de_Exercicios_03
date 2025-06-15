import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = scanner.nextInt();
        System.out.print("Segundo valor: ");
        int b = scanner.nextInt();
        System.out.print("Terceiro valor: ");
        int c = scanner.nextInt();

        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        System.out.println("MENOR = " + menor);

        scanner.close();
    }
}
