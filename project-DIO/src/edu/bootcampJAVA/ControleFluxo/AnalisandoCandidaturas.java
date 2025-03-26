package edu.bootcampJAVA.ControleFluxo;

public class AnalisandoCandidaturas {
    public static void main(String [] args){
        analisarCanditado(1900.0);
        analisarCanditado(2200.0);
        analisarCanditado(2000.0);
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
