import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Diego", 23);
        Pessoa pessoa2 = new Pessoa("Vitória", 19);
        Pessoa pessoa3 = new Pessoa("Maria", 83);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        for (Pessoa listaDePessoa : listaDePessoas) {
            System.out.println(listaDePessoa.toString());
        }
    }
}
