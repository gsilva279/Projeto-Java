package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    public static void main(String[] args) {
        // Desafio 9 - Verificar se todos os números da lista são distintos (não se
        // repetem): Com a Stream API, verifique se todos os números da lista são
        // distintos (não se repetem) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 5, 2, 4);

        // // Verifica se a quantidade de elementos é igual à quantidade após distinct()
        boolean NaoRepetem = numeros.size() == numeros.stream().distinct().count();

        if (NaoRepetem) {
            System.out.println("Todos os números são distintos");
        } else {
            System.out.println("Algum número é repetido");
        }
        

    }
}