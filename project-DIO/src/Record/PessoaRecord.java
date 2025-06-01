package Record;

public record PessoaRecord (String name, int idade) {
    //compact constructor
    public PessoaRecord {
        if (idade < 0){
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }
}
