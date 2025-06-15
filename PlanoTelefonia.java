import java.util.Scanner;

public class PlanoTelefonia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        double valorPagar = 50.00;
        if (minutos > 100) {
            valorPagar += (minutos - 100) * 2.00;
        }
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        sc.close();
    }
}
