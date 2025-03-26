import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        //positivoOuNegativo();
        //doisNumerosInteiros();
        //calculoQuadradoOuArea();
        //tabuada();
        //parOuImpar();
        fatorial();
    }

    /*Crie um programa que solicite ao usuário digitar um número.
    Se o número for positivo, exiba "Número positivo",
    caso contrário, exiba "Número negativo".*/

    public static void positivoOuNegativo() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = leitor.nextInt();

        if (numero >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        leitor.close();
    }

    /*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
    se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

    public static void doisNumerosInteiros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número inteiro:");
        int num2 = scanner.nextInt();

        String mensagem;

        if (num1 == num2) {
            mensagem = "Os números são iguais";
        } else if (num1 < num2) {
            mensagem = "O número 2 é maior que o número 1";
        } else {
            mensagem = "O número 1 é maior que o número 2";
        }
        System.out.println(mensagem);
        scanner.close();
    }

    /*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
    Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

    public static void calculoQuadradoOuArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        System.out.println("Escolha uma opção entre 1 e 2: ");
        int escolha = scanner.nextInt();

        String mensagem;

        switch (escolha) {
            case 1:
                System.out.println("Ofereça o raio da circunferência: ");
                double raio = scanner.nextDouble();
                double areaCirculo = raio * raio * 3.14;
                mensagem = "A área da circunferência é " + areaCirculo;
                break;

            case 2:
                System.out.println("Ofereça o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                mensagem = "A área do quadrado é " + areaQuadrado;
                break;

            default:
                mensagem = "Insira um valor entre 1 e 2.";
        }

        System.out.println(mensagem);
        scanner.close();
    }

    /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/
    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor de 1 a 10: ");
        int valor = scanner.nextInt();

        if (valor > 0 && valor <= 10) {
            int contador = 0;
            System.out.println("Tabuada do " + valor + ":");
            while (contador <= 10){
                int operacao = contador * valor;
                System.out.println(operacao);
                contador++;
            }
        }else {
            System.out.println("Valor indisponível");
        }
        scanner.close();
    }
    /*Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número
    é par ou ímpar e exiba uma mensagem correspondente.*/

    public static void parOuImpar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
        scanner.close();
    }

    /*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/

    public static void fatorial(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int inteiro = scanner.nextInt();

        long fatorial = 1;
        int i = 1;

        while(i <= inteiro){
            fatorial *= i;
            i++;
        }
        System.out.println("O fatorial de " + inteiro + " é " + fatorial);
        scanner.close();
    }
}
