package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio05 {
    public static void main(String[] args) {
        // Desafio 5 - Calcule a média dos números maiores que 5: Com a Stream API,
        // calcule a média dos números maiores que 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> maiorCinco = n -> n > 5;

        double mediaTotal = numeros.stream()
                .filter(maiorCinco) //pega apenas os maiores que 5
                .mapToInt(Integer::intValue) //converte para int
                .average() //Calcula a média
                .orElse(0.0);

        // resultado esperado: (6+7+8+9+10)/5 = 40/5 = 8.O
        System.out.println("A média dos maiores que 5 é: " + mediaTotal);
    }
}
