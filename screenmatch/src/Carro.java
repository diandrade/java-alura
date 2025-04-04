import java.time.LocalDate;

public class Carro {
    String modelo = "Fiat Punto";
    int ano = 2015;
    String cor = "Verde";

    void fichaTecnica() {
        System.out.println("O modelo do veículo é: " + modelo);
        System.out.println("O ano do veículo é: " + ano);
        System.out.println("A cor do veículo é: " + cor);
    }

    int calcularIdadeCarro() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }
}
