package Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class QuestaoSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Para gerar um número aleatório
        Random aleatorio = new Random();
        // Questão seis
        int[] parInpar = new int[10];

        // para gerar um array aleatório
        System.out.println();
        for (int i = 0; i < parInpar.length; i++) {
            parInpar[i] = aleatorio.nextInt(100) + 1;
        }

        //Organiza e guarda os números dos arrays
        Arrays.sort(parInpar);
        String numeroPar = "";
        String numeroImpar = "";

        //foreach para verificar os números pares e impares
        for (int numero : parInpar) {
            if (numero % 2 == 0) {
                numeroPar += numero + " ";
            } 
        }

        for (int numero : parInpar) {
            if (numero % 2 != 0) {
                numeroImpar += numero + " ";
            } 
        }

        System.out.println("Array: " + Arrays.toString(parInpar));
        System.out.println("Pares: " + numeroPar);
        System.out.println("Inpares: " + numeroImpar);

    }
}
