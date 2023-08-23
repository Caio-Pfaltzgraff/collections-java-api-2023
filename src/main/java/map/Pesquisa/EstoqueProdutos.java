package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Integer quantidade, Double preco) {
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if(!produtos.isEmpty()) {
            System.out.println(produtos);
        } else {
            System.out.println("Não possui produtos no estoque!");
        }
    }

    public Double calcularValorTotalEstoque() {
        Double valorTotalEstoque = 0d;
        if(!produtos.isEmpty()) {
            for(Produto p : produtos.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        for(Produto p : produtos.values()) {
            if(p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        Double menorPreco = Double.MAX_VALUE;
        for(Produto p : produtos.values()) {
            if(p.getPreco() < menorPreco) {
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuatidadeXPreco = null;
        Double maiorPreco = Double.MIN_VALUE;
        for(Produto p : produtos.values()) {
            if(p.getPreco() * p.getQuantidade() > maiorPreco) {
                maiorPreco = p.getPreco() * p.getQuantidade();
                produtoMaiorQuatidadeXPreco = p;
            }
        }
        return produtoMaiorQuatidadeXPreco;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 4.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor X quantidade: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
