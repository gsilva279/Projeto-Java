package Arrays; 

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Questão 2:
        int[] array = new int[3];
        int soma = 0;

        System.out.println();
        for(int i=0; i<3; i++){
            System.out.println("Informe o " + (i+1) + "° número: ");
            array[i] = input.nextInt();

            soma += array[i];
        }

        System.out.println("A soma do array foi: " + soma);
        input.close();

    }
}
