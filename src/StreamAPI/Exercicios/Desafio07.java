package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio07 {
    public static void main(String[] args) {
        // Desafio 7 - Encontrar o segundo número maior da lista: Com a ajuda da Stream
        // API, encontre o segundo número maior da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> num = numeros.stream()
                .distinct() //remove números duplicados 
                .sorted(Comparator.reverseOrder()) //ordena na ordem decrescente
                .skip(1) //pula um elemento 
                .findFirst(); //pega esse elemento

        System.out.println("O segundo menor número é: " + num.get());
    }
}
