package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Questão Cinco
        int[] media = new int[5];
        int soma = 0;
        double mediaValores = 0;

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o número " + (i + 1) + "° número");
            media[i] = input.nextInt();

            soma += media[i];
        }

        mediaValores = (double) soma / media.length;
        System.out.println("A média entres os valores do array " + Arrays.toString(media) + " é: " + mediaValores);

        input.close();
    }
}