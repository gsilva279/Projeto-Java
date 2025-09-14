package EstruturasExepcionais;
import java.util.Scanner;
public class TesteExecao {
    public static void main(String[] args) {
       
       try { Scanner input = new Scanner(System.in);

        System.out.println("Infome seu nome: ");
        String nome = input.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();

        System.err.println("Nome: " + nome + " Idade: " + idade);
       } 
        catch (java.util.InputMismatchException e) {
            System.err.println("Erro: " + e);
        }
    } 
}
