package Sintaxe;
/**
 * <h1>Calculadora</h1>
 * <p> A Class calculadora reliza operações de soma, subtração, multiplicação e divisão.</p>
 * <br>Nota: A classe Calculadora foi criada para exemplificar o uso de métodos em Java.</br>
 * 
 * @author José Gilvanilson da Silva
 * @version 1.0
 * @since 08/03/2025
 */
public class Calculadora {
    /**
     * Método que realiza a soma de dois números inteiros.
     * @param numero1 primeiro parametro para a soma
     * @param numero2 segundo parametro para a soma
     * @return retorna a soma dos dois números do tipo inteiro
     */
   public int somar(int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;
   }

   /**
    * Método que realiza a subtração de dois números inteiros.
    * @param numero1 primeiro parametro para a subtração
    * @param numero2 segundo parametro para a subtração
    * @return retorna a subtração dos dois números do tipo inteiro
    */
   public int subrair(int numero1, int numero2){
        int subtracao = numero1 - numero2;
        return subtracao;
   }

    /**
     * Método que realiza a multiplicação de dois números inteiros.
     * @param numero1 primeiro parametro para a multiplicação
     * @param numero2 segundo parametro para a multiplicação
     * @return retorna a multiplicação dos dois números do tipo inteiro
     */
   public int multiplicar(int numero1, int numero2){
        int multiplicacao = numero1 * numero2;
        return multiplicacao;
   }

    /**
     * Método que realiza a divisão de dois números inteiros.
     * utiliza um if para verificar se o segundo número é igual a zero, caso seja retorna zero.
     * @param numero1 primeiro parametro para a divisão
     * @param numero2 segundo parametro para a divisão
     * @return retorna a divisão dos dois números do tipo inteiro
     */
   public int dividir(int numero1, int numero2){
        if (numero2 == 0){
            return 0;
        } else {
             int divisao = numero1 / numero2; 
             return divisao;
        }
   }
}
