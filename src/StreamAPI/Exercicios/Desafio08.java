package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio08 {
    public static void main(String[] args) {
        // Desafio 8 - Somar os dígitos de todos os números da lista: Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 4);

        // BinaryOperator<T>: É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
        BinaryOperator<Integer> somaTotal = (num1, num2) -> num1 + num2;

        // Usamos o método reduce para somar todos os elementos da lista. O valor inicial da soma é 0, e a operação usada para combinar os elementos é somaTotal.
        int resultado = numeros.stream()
                .reduce(0, somaTotal);
        System.out.println("A soma dos números é: " + resultado);
    }
}
