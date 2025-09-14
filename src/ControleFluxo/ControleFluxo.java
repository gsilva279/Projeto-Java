package ControleFluxo;

public class ControleFluxo {
    public static void main(String[] args) {
        //if else para verificar se a pessoa é adulta ou criança
        int idade = 19;
        if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 12) {
            System.out.println("Criança");
        } else {
            System.out.println("Bebê");
        }

        //Operador ternário para verificar se a velocidade é alta ou baixa 
        int velocidade = 100;
        String resultado = velocidade > 80 ? "velocidade alta" : "velocidade baixa";
        System.out.println(resultado);
        
      
         //switch case para dias da semana
        int dia = 5;
        String diaSemana;
        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6: 
                diaSemana = "Sexta";
                break; 
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia inválido";
                break;
        }
        System.out.println(diaSemana);
    }
}
