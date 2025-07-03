package br.com.alura.exercises.ex03;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal(double tarifa){
        if (tarifa < getSaldo()){
            setSaldo(getSaldo() - tarifa);
        }else {
            System.out.println("Valor indisponível para cobrança da tarifa.");
        }
    }
}
