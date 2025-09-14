package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class QuestaoOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Questao oito
        int[] arrayUm = new int[5];
        int[] arrayDois = new int[5];
        int[] arrayMesclado = new int[10];

        System.out.println();
        System.out.println("Valores para o primeiro array");
        // Valores para o array um
        for (int i = 0; i < arrayUm.length; i++) {
            System.out.println("Informe o " + (i + 1) + "° número: ");
            arrayUm[i] = input.nextInt();
        }

        System.out.println("Valores para o segundo array");
        // Valores para o array dois
        for (int i = 0; i < arrayDois.length; i++) {
            System.out.println("Informe o " + (i + 1) + "° número: ");
            arrayDois[i] = input.nextInt();
        }

        // Array mesclado
        System.arraycopy(arrayUm, 0, arrayMesclado, 0, arrayUm.length);
        System.arraycopy(arrayDois, 0, arrayMesclado, arrayUm.length, arrayDois.length);

        System.out.println("Array um: " + Arrays.toString(arrayUm));
        System.out.println("Array dois: " + Arrays.toString(arrayDois));
        System.out.println("Array mesclado: " + Arrays.toString(arrayMesclado));

    }
}