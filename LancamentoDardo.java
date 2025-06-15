import java.util.Scanner;

public class LancamentoDardo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();
        double maiorDistancia = d1;

        if (d2 > maiorDistancia) {
            maiorDistancia = d2;
        }
        if (d3 > maiorDistancia) {
            maiorDistancia = d3;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maiorDistancia);

        scanner.close();
    }
}
