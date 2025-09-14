package Sintaxe;

public class ResultadoMedia {
    public static void main(String[] args) {
        int media = 8;
        if (media < 6) 
            System.out.println("Reprovado");
        else if (media == 6) 
            System.out.println("Em recuperação");
        else
            System.out.println("Aprovado");
    }
}
