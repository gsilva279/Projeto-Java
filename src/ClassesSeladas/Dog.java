package ClassesSeladas;

non-sealed public class Dog extends Animal {
   
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setNome("Toto");
        dog.setIdade(6); 

        System.out.println("=====Sealed Class=====");
        System.out.println(dog.getNome());
        System.out.println(dog.getIdade());

    }
      
}
