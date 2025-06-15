import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = scanner.nextInt();
        System.out.print("Hora final: ");
        int horaFinal = scanner.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
        } else {
            duracao = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        scanner.close();
    }
}
