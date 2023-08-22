package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if(!tarefas.isEmpty()) {
            for(Tarefa tarefa : tarefas) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = tarefa;
                    break;
                }
            }
            tarefas.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }

        if(tarefaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if(!tarefas.isEmpty()) {
            System.out.println(tarefas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Integer contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : tarefas) {
            if(tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : tarefas) {
            if(!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        if(tarefas.isEmpty()) {
            System.out.println("O conjunto já está vazio!");
        } else {
            tarefas.clear();
        }
    }
}
