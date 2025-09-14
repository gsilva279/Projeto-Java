package Arrays;

import java.util.Scanner;
import java.util.Arrays;;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Questão 3:
        int[] numero = new int[8];

        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.println("Informe o " + (i + 1) + "° número: ");
            numero[i] = input.nextInt();

        }
        
        Arrays.sort(numero);
        int maior = numero[numero.length - 1];
        int menor = numero[0];

        System.out.println("Números: " + Arrays.toString(numero));
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
        input.close();

    }

}
