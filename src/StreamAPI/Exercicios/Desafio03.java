package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio03 {
    public static void main(String[] args) {
        //Desafio 3 - Verifique se todos os números da lista são positivos: Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

        //mude os números de negativos para positivos para teste
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, -4, 3);

        boolean positivos = numeros.stream()
        .allMatch(n -> {
            if (n <= 0) {
                return false;
            }
            return true;
        });

        //Imprime os números positivos ou negativos
        if (positivos) {
            System.out.println("Todos os números são positivos");
        } else {
            System.out.println("Existe algum número negativo");
        }

    }

}
