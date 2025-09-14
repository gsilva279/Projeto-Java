package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Questão 4:
        int[] numero = new int[6];

        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o número " + (i + 1) + "° número: ");
            numero[i] = input.nextInt();
        }

        int[] invertido = new int[6];
        for (int i = 0; i < numero.length - 1; i++) {
            invertido[i] = numero[numero.length - 1 - i];
        }

        System.out.println("Array: " + Arrays.toString(numero));
        System.out.println("Array invertida: " + Arrays.toString(invertido));

        input.close();

    }
}
