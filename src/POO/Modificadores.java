package POO;
//Aqui vai a especificação do pacote

public class Modificadores {
    public String nome = "Carlos Alberto";
    String modificadorPadrao = "Azul";
    private int cpf = 25629736;
    protected boolean teste = true;

    public static void main(String[] args) {
        //instancia a class
        Modificadores modificadores = new Modificadores();

        System.out.println("Nome: " + modificadores.nome);
        // System.out.println("Modificador Padrão: " modificadores.modificadorPadrao); Não pode ser acessado pois é private
        System.out.println("Teste: " + modificadores.teste);
    }
}
