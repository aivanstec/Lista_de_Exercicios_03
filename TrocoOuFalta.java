import java.util.Scanner;

public class TrocoOuFalta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = scanner.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = scanner.nextDouble();

        double valorTotal = precoUnitario * quantidade;
        if (dinheiroRecebido >= valorTotal) {
            double troco = dinheiroRecebido - valorTotal;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double falta = valorTotal - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", falta);
        }

        scanner.close();
    }
}
