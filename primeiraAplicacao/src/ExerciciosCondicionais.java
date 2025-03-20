import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        positivoOuNegativo();
    }

    /*Crie um programa que solicite ao usuário digitar um número.
    Se o número for positivo, exiba "Número positivo",
    caso contrário, exiba "Número negativo".*/

    public static void positivoOuNegativo(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = leitor.nextInt();

        if (numero >= 0){
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
    }
}
