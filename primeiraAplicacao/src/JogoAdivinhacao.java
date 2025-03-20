import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Chute um número de 0 a 100. (Você possui 5 chances): ");
            int chuteDoUsuario = leitura.nextInt();

            if (numeroAleatorio == chuteDoUsuario) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (numeroAleatorio > chuteDoUsuario) {
                System.out.println("O número está para cima.");
            } else {
                System.out.println("O número está para baixo.");
            }
        }
        System.out.println("Infelizmente, você não conseguiu descobrir o número secreto que era " + numeroAleatorio + ".");
    }
}
