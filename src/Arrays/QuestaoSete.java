package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class QuestaoSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // Questao sete
        String[] lista = { "Ana", "Bruno", "Carla", "Daniel", "Eduarda", "Felipe", "Gabriel", "Helena", "Igor",
                "Juliana" };
        String[] nomes = new String[6];
        String pesquisa = "";

        for (int i = 0; i < nomes.length; i++) {
            int indiceAleatorio = random.nextInt(lista.length);
            nomes[i] = lista[indiceAleatorio];
        }

        System.out.println();
        // Organiza o array criado
        Arrays.sort(nomes);
        System.out.println("Array sorteado: " + Arrays.toString(nomes));

        System.out.println("digite um nome para busca: ");
        pesquisa = input.nextLine();

        // Busca binária no array
        // se encontrar o nome retoma o índice dele
        // se não encontrar retoma um índice negativo
        int resultado = Arrays.binarySearch(nomes, pesquisa);

        if (resultado >= 0) {
            System.out.println("O nome " + pesquisa + " foi encontrado no array na posição " + (resultado + 1) + "°");
        } else {
            System.out.println("O nome " + pesquisa + " não foi encontrado no array.");
        }

    }
}
