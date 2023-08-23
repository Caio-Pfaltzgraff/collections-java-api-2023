package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!contatos.isEmpty()) {
            contatos.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!contatos.isEmpty()) {
            numeroPorNome = contatos.get(nome);
        }
        return numeroPorNome;
    }
}
