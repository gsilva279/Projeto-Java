package Record;

public class Main {
    public static void main(String[] args) {
        PessoaRecord maria = new PessoaRecord("Maria", -19);
        PessoaRecord jose = new PessoaRecord("José", 20);

        System.out.println("------------------");
        System.out.println("Nome: " + maria.name());
        System.out.println("Idade: " + maria.idade());

        System.out.println("-----------------");
        System.out.println("Nome: " + jose.name());
        System.out.println("Idade: " + jose.idade());

    }
}
