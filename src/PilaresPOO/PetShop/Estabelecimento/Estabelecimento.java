package PilaresPOO.PetShop.Estabelecimento;

import PilaresPOO.PetShop.Animal;
import PilaresPOO.PetShop.Cachorro;
import PilaresPOO.PetShop.Gato;

public class Estabelecimento {
    public static void main(String[] args) {
        Animal rex = new Cachorro("Rex", "Labrador", 5);
        Animal mim = new Gato("Mimi", 2);
        
        rex.comer();
        rex.emitirSom();

        mim.emitirSom();
        mim.comer();
    }
}
