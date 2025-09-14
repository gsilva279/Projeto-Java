package Arrays;

import java.util.*;

public class QuestaoDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] matriz = new int[3][3]; // matriz 3x3
        
        // Ler os valores da matriz do usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        // Mostrar a matriz preenchida
        System.out.println("Matriz 3x3 preenchida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
