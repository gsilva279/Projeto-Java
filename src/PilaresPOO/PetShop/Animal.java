package PilaresPOO.PetShop;

public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom(); //será implementado nas subclasses

    public void comer(){
        System.out.println(nome + " está comendo.");
    }
}
