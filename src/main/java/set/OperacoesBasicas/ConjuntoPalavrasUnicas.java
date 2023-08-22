package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavras(String palavra) {
        if(!palavrasUnicas.isEmpty()) {
            palavrasUnicas.remove(palavra);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}
