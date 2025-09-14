package JavaCollection.List.OrdenacaoNumeros;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros(){
            this.numeroList = new ArrayList<>();
}

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    //método para orneação ascendente
    public List<Integer> ordenarAscendente(){
        List<Integer> ordernarAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()) {
            Collections.sort(ordernarAscendente);
            return ordernarAscendente;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordenarDescendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()) {
            ordenarDescendente.sort(Collections.reverseOrder());
            return ordenarDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println("Lista: " + this.numeroList);
        } else {
            System.out.println("A lista está vazia!!!");
        }
    }

    //Método main:
    public static void main(String[] args) {
        OrdenacaoNumeros numero = new OrdenacaoNumeros();

        numero.adicionarNumero(23);
        numero.adicionarNumero(11);
        numero.adicionarNumero(7);
        numero.adicionarNumero(17);
        numero.adicionarNumero(2);


        System.out.println();
        System.out.println("===== Ordenação Números =====");
        numero.exibirNumeros();

        System.out.println("Ascendente: " + numero.ordenarAscendente());
        System.out.println("Descendentes: " + numero.ordenarDescendente());


    }
    
}
