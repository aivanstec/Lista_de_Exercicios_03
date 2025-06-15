import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = scanner.next().charAt(0);

        if (escala == 'F' || escala == 'f') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", celsius);
        } else if (escala == 'C' || escala == 'c') {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", fahrenheit);
        } else {
            System.out.println("Escala invalida. Digite 'C' ou 'F'.");
        }

        scanner.close();
    }
}
