package PilaresPOO.PetShop;
import PilaresPOO.PetShop.Animal;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro (String nome, String raca, int idade){
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " diz AUAUA!");
    }
    
}
