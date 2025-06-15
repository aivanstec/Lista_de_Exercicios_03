import java.util.Scanner;

public class AumentoSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salarioAtual = scanner.nextDouble();
        double novoSalario;
        double aumento;
        int porcentagem;

        if (salarioAtual <= 1000.00) {
            porcentagem = 20;
            aumento = salarioAtual * (porcentagem / 100.0);
            novoSalario = salarioAtual + aumento;
        } else if (salarioAtual <= 3000.00) {
            porcentagem = 15;
            aumento = salarioAtual * (porcentagem / 100.0);
            novoSalario = salarioAtual + aumento;
        } else if (salarioAtual <= 8000.00) {
            porcentagem = 10;
            aumento = salarioAtual * (porcentagem / 100.0);
            novoSalario = salarioAtual + aumento;
        } else {
            porcentagem = 5;
            aumento = salarioAtual * (porcentagem / 100.0);
            novoSalario = salarioAtual + aumento;
        }

        System.out.printf("Novo salario R$ %.2f%n", novoSalario);
        System.out.printf("Aumento R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %d%%%n", porcentagem); // %% para imprimir o '%'

        scanner.close();
    }
}
