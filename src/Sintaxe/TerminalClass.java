package Sintaxe;

public class TerminalClass {
    /**
     * h1>Argumentos via terminal</h1>
     * Código didático do bootcamp DIO.me Java Native Cloud Bradesco.
     * 
     * @autor Dio.me
     * @version 1.0
     * @since 08/03/2025
     */
    public static void main(String[] args) {
                /**
                 * Método que recebe argumentos via terminal e imprime.
                 * Todos os argumentos são passados via terminal e impressos na tela.
                 * @param args argumentos passados via terminal
                 * @return retorna a impressão dos argumentos
                 */
                String nome = args [0];
                String sobrenome = args [1];
                int idade = Integer.valueOf(args[2]); // Wrappers classes que convertem tipos primitivos em objetos
                double altura = Double.valueOf(args[3]);
        
                System.out.println("Ola, me chamo " + nome + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos ");
                System.out.println("Minha altura é " + altura + "cm ");
            }
        }
