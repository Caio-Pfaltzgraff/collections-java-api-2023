package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        listaNumeros.add(numero);
    }

    public Integer calcularSoma() {
        Integer soma = 0;
        for(Integer numero : listaNumeros) {
            soma += numero;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        Integer maior = Integer.MIN_VALUE;
        if(!listaNumeros.isEmpty()) {
            for(Integer numero : listaNumeros) {
                if(numero > maior) {
                    maior = numero;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public Integer encontrarMenorNumero() {
        Integer menor = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()) {
            for(Integer numero : listaNumeros) {
                if(numero < menor) {
                    menor = numero;
                }
            }
            return menor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if(!listaNumeros.isEmpty()) {
            System.out.println(getListaNumeros());
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

}
