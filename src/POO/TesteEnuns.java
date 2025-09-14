package POO;

public class TesteEnuns {
    public static void main(String[] args) {
        Estado estado = Estado.PARAIBA;

        System.out.println("Nome: " + estado.getNome());
        System.out.println("Sigla: " + estado.getSigla());
    }
}

enum Estado {
    PARAIBA("Paraíba", "PB"),
    PERNAMBUCO("Pernambuco", "PE"),
    MINAS_GERAIS("Minas Gerais", "MG");

    private final String nome;
    private final String sigla;

    // Construtor do enum
    Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
