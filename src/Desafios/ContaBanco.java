package Desafios;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();
       
        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double deposito = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double segundoSaque = scanner.nextDouble();


        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saqueTotal = saque + segundoSaque;
        double saldoFinal = (saldoInicial + deposito) + saqueTotal;
        
         // TODO: Implemente a classificação do cliente com base no saldo:
         String classificacao;
         if(saldoFinal >= 0 && saldoFinal <= 500){
           classificacao = "Baixo";
         } else if (saldoFinal < 0){
           classificacao = "Negativado";
         } else {
           classificacao = "Confortavel";
         }
         
 
         System.out.println(classificacao); 
         System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}