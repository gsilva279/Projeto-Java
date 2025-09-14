package JavaCollection.List.SomaNumeros;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> numeroInteiros;

    public SomaNumeros() {
        this.numeroInteiros = new ArrayList<>();
    }

    // Método para adicionar números:
    public void adicionarNumero(int numero) {
        this.numeroInteiros.add(numero);
    }

    // Método que calcula a soma dos números:
    public int calcularSoma() {
        int soma = 0;
        for (int num : numeroInteiros) {
            soma += num;
        }
        return soma;
    }

    // Encontrar maior número:
    public int encontrarMaiorNumero() {
        int maiorNum = Integer.MIN_VALUE;
        if (!numeroInteiros.isEmpty()) {
            for (int num : numeroInteiros) {
                if (num >= maiorNum) {
                    maiorNum = num;
                }
            }
            return maiorNum;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    // Encontrar o menor número:
    public int encontrarMenorNumero() {
        int menorNum = Integer.MAX_VALUE;
        if (!numeroInteiros.isEmpty()) {
            for (int num : numeroInteiros) {
                if (num <= menorNum) {
                    menorNum = num;
                }
            }
            return menorNum;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    // Método que exibe os números:
    public void exibirNumeros() {
        if (!numeroInteiros.isEmpty()) {
            System.out.println(this.numeroInteiros);
        } else {
            System.out.println("A lista de números inteiro está vazia!");
        }
    }

    // Método main para testes:
    public static void main(String[] args) {
        SomaNumeros numero = new SomaNumeros();

        // Adicionado números
        numero.adicionarNumero(3);
        numero.adicionarNumero(4);
        numero.adicionarNumero(9);

        System.out.println("Números adicionados");
        numero.exibirNumeros();

        // Soma:
        System.out.println("Soma: " + numero.calcularSoma());

        //Maior número:
        System.out.println("Maior número da lista: " + numero.encontrarMaiorNumero());

        //Menor número:
        System.out.println("Menor número: " + numero.encontrarMenorNumero());

    }
}
