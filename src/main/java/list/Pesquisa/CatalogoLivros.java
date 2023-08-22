package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Integer anoDePublicacao) {
        catalogo.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            catalogo.forEach(livro -> {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            });
            return livrosDoAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(Integer anoInicial, Integer anoFinal) {
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            catalogo.forEach(livro -> {
                if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
                    livrosNoIntervalo.add(livro);
                }
            });
            return livrosNoIntervalo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;
        if(!catalogo.isEmpty()) {
             for(Livro livro : catalogo){
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }
            return livroEncontrado;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

}
