package JavaCollection.Set;

import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class ConjuntoPalavrasUnicas {

    //Atributo
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasSet = new HashSet<>();
    }

    //adicionando palavras
    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    //remover palavras
    public void removerPalavra(String palavra){
        String palavraRemover = palavra;
        if(!palavrasSet.isEmpty()){
                palavrasSet.remove(palavraRemover);
        } else{
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

    //verificar palavras no conjunto
    public void verificarPalavra(String palavra){
        if (!palavrasSet.isEmpty()) {
        for (String p : palavrasSet) {
                if (p.contains(palavra)) {
                    System.out.println("A palavra " + palavra + " está no conjunto.");
                    break;
                } else {
                    System.out.println("A palavra " + palavra + " não existe no conjunto.");
                }
            }
        } else {
                throw new RuntimeException("O conjunto está vazio!");
            }
    }

    //Exibir convidados 
    public void exibirPalavrasUnicas(){
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else{
            System.out.println("O conjunto está vazio!");
        }
    }

    //Método principal
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("Casa");
        conjuntoPalavras.adicionarPalavra("Carro");
        conjuntoPalavras.adicionarPalavra("Lua");
        conjuntoPalavras.adicionarPalavra("Céu");
        conjuntoPalavras.adicionarPalavra("Bola");



        System.out.println();
        System.out.println("===== CONJUNTOS (SET) =====");
        System.out.println("Palavras no conjunto");
        conjuntoPalavras.exibirPalavrasUnicas();

        //Removendo a palavra Céu
        System.out.println();
        conjuntoPalavras.removerPalavra("Céu");
        System.out.println("Palavras no conjunto após remover");
        conjuntoPalavras.exibirPalavrasUnicas();

        //Verificar palavra
        System.out.println();
        conjuntoPalavras.verificarPalavra("Lua");

    }
}
