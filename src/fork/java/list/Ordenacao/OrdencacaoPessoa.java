package fork.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencacaoPessoa {
    private List<Pessoa> pessoas;

    public OrdencacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPesoa(String nome, int idade, float altura) {
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdencacaoPessoa ordencacao = new OrdencacaoPessoa();
        ordencacao.adicionarPesoa("Alice", 30, 1.65f);
        ordencacao.adicionarPesoa("Bob", 25, 1.80f);
        ordencacao.adicionarPesoa("Charlie", 35, 1.75f);

        System.out.println("Ordenado por idade:");
        for (Pessoa p : ordencacao.ordenarPorIdade()) {
            System.out.println(p);
        }

        System.out.println("\nOrdenado por altura:");
        for (Pessoa p : ordencacao.ordenarPorAltura()) {
            System.out.println(p);
        }
    }
}
