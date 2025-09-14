package Sintaxe;

import java.util.Scanner;
import java.util.Locale;
/**
 * <h1>SobreVocê</h1>
 * <p>Aplicação que recebe informações do usuário e imprime no terminal</p>
 * @author José Gilvanilson
 * @version 1.0
 * @since 2021-07-30
 * 
*/
public class AbautMe {
    /**
     * Método principal que recebe informações do usuário e imprime no terminal
     * @param args idade
     * @param args altura
     * @param args nome
     * @param args sobrenome
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}
