package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        listaDeTarefas.forEach(lista -> {
            if(lista.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(lista);
            }
        });
        listaDeTarefas.removeAll(tarefasRemover);
    }

    public Integer obterNumeroTotalDeTarefas() {
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaDeTarefas);
    }

}
