package ClassesSeladas;

final public class Cat extends Animal {
    
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setNome("Mimi");
        cat.setIdade(3); 

        System.out.println("=====Sealed Class=====");
        System.out.println(cat.getNome());
        System.out.println(cat.getIdade());

    }
}
