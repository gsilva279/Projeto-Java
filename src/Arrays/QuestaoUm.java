package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class QuestaoUm {
    public static void main(String[] args) {
        // Questão 1:
        Scanner input = new Scanner(System.in);
        int[] numero = new int[5];

        System.out.println();
        for(int i=0; i<5; i++){
            System.out.println("Informe o " + (i+1) + "° número: ");
            numero[i] = input.nextInt();
        }

        System.out.println("Números digitados: " + Arrays.toString(numero));
        input.close();
    }
}