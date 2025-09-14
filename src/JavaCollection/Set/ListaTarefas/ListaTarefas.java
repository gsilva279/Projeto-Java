package JavaCollection.Set.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    // Métodos
    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }


    public void TarefaRemover(String descricao){
        Tarefa tarefaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if (tarefaRemover == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    
    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }


    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarPendente(String descricao){
      Tarefa marcarComoPendente = null;
      for (Tarefa t : tarefaSet) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
            marcarComoPendente = t;
            break;
        }
      }

      if (marcarComoPendente != null) {
        if (marcarComoPendente.isConcluida()) {
            marcarComoPendente.setConcluida(false);
        } else {
            System.out.println("Tarefa não encontrada na lsita!");
        }
      }
    }

    public void limparListaTarefas(){
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista está fazia!");
        } else {
            tarefaSet.clear();
        }
    }

    //Método main para testes
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        //Adicionando 
        lista.adicionarTarefa("Correr");
        lista.adicionarTarefa("Fazer compras");
        lista.adicionarTarefa("Judô");
        lista.adicionarTarefa("Comprar");
        System.out.println();
        lista.exibirTarefas();
        System.out.println("Total de tarefas na lista: " + lista.contarTarefas());

        //Removendo tarefas
        lista.TarefaRemover("Correr");
        lista.exibirTarefas();
        System.out.println("Total de tarefas na lista: " + lista.contarTarefas());
        
        //obtendo tarefas pendentes
        lista.marcarPendente("Fazer compras");
        System.out.println("Tarefas pendentes: " + lista.obterTarefasPendentes());

        //Tarefas concluidas
        lista.marcarTarefaConcluida("Comprar");
        lista.marcarTarefaConcluida("Judô");
        System.out.println("Tarefas concluidas: " + lista.obterTarefasConcluidas());

        //limpando lista de tarefas
        lista.limparListaTarefas();
        lista.exibirTarefas();
   
    }
}
