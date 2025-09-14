package POO;

public class Construtores { 
    private String usuario;
    private int conta;

    public String getUsuario(){
        return usuario;
    }

    public int getConta(){
        return conta;
    }

    //uso dos construtores 
    public Construtores(String usuario){
        this.usuario = usuario;
    }

    public Construtores(int conta){
        this.conta = conta;
    }

    public static void main(String[] args) {
        Construtores construtores = new Construtores("Silva Ramos");
        Construtores construtores2 = new Construtores(11237733);

        System.out.println("Usuário: " + construtores.getUsuario());
        System.out.println("Senha: " + construtores2.getConta());
    }
   
}
