package ControleFluxo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSetivo {
    public static void main(String [] args){
        String [] candidatos = {"João", "Maria", "José", "Antônio", "Ana"};
        for (String canditado : candidatos){
            entrandoEmContato(canditado);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato Realizado com sucesso");
            }
           
        } while(continuarTentando && tentativasRealizadas <3);

        if (atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de " + tentativasRealizadas + " tentativas");
        }
    }

    //método auxiliar para lista de candisatos
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Antônio", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Luiz", "Isaac"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de sálario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    //class para gerar salarioPretendido aleatoriamente
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCanditado(double salarioPrentendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPrentendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPrentendido){
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
