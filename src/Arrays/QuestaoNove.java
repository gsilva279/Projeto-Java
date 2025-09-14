package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class QuestaoNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Questao nove
        int[] numeroDesordenado = new int[10];

        for (int i = 0; i < numeroDesordenado.length; i++) {
            System.out.println("Informe o " + (i + 1) + "° número: ");
            numeroDesordenado[i] = input.nextInt();
        }

        // Imprime o array desordenado
        System.out.println();
        System.out.println("Array desordenado: " + Arrays.toString(numeroDesordenado));

        // Ordena o array
        Arrays.sort(numeroDesordenado);

        // Imprime o array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(numeroDesordenado));

    }
}
