import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Codigo do produto comprado: ");
        int codigo = scanner.nextInt();
        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoTotal;
        if (codigo == 1) {
            precoTotal = quantidade * 5.00;
        } else if (codigo == 2) {
            precoTotal = quantidade * 3.50;
        } else if (codigo == 3) {
            precoTotal = quantidade * 4.80;
        } else if (codigo == 4) {
            precoTotal = quantidade * 8.90;
        } else if (codigo == 5) {
            precoTotal = quantidade * 7.32;
        } else {
            System.out.println("Codigo de produto invalido!");
            precoTotal = 0.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", precoTotal);

        scanner.close();
    }

}
