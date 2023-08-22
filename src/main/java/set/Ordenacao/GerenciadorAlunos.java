package set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, Double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula) {
        Aluno alunoRemover = null;
        if(!alunos.isEmpty()) {
            for(Aluno aluno : alunos) {
                if(aluno.getMatricula().equals(matricula)){
                    alunoRemover = aluno;
                    break;
                }
            }
            alunos.remove(alunoRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        if(alunoRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if (!alunos.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunos.isEmpty()) {
            alunosPorNota.addAll(alunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        System.out.println(alunos);
    }
}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
