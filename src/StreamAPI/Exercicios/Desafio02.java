package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio02 {
    public static void main(String[] args) {
        // Desafio 2 - Imprima a soma dos números pares da lista: Utilizando a Stream
        // API, realize a soma dos números pares da lista e exiba o resultado no
        // console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0) // faz tipo o if para pegar apenas os de resto 0 que são pares
                .mapToInt(Integer::intValue) // converte o objeto para int
                .sum();

        // Resultado esperado: 34
        System.out.println("A soma dos números é: " + somaPares);
    }
}
