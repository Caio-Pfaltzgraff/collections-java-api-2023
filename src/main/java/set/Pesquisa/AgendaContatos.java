package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if(!contatos.isEmpty()) {
            System.out.println(contatos);
        } else {
            System.out.println("Você não tem contatos adicionados!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosBuscados = new HashSet<>();
        for(Contato c : contatos) {
            if(c.getNome().startsWith(nome)) {
                contatosBuscados.add(c);
            }
        }
        return contatosBuscados;
    }

    public Contato atualizarNumeroContato(String nome, Integer novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatos) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
