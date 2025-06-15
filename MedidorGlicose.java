import java.util.Scanner;

public class MedidorGlicose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = scanner.nextDouble();
        System.out.print("Classificacao: ");

        if (glicose <= 100) {
            System.out.println("normal");
        } else if (glicose <= 140) {
            System.out.println("elevado");
        } else {
            System.out.println("diabetes");
        }

        scanner.close();
    }
}
