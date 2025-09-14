package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Desafio06 {
    public static void main(String[] args) {
        // Desafio 6 - Verificar se a lista contém algum número maior que 10: Utilize a
        // Stream API para verificar se a lista contém algum número maior que 10 e exiba
        // o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numMaior = n -> n > 10;

        boolean maiorQueDez = numeros.stream()
                .anyMatch(numMaior);

        //exibe se há ou não números maiores que dez
        if (maiorQueDez) {
            System.out.println("Existe números maiores que dez");
        } else {
            System.out.println("Não existe números maiores que dez");
        }
    }
}
