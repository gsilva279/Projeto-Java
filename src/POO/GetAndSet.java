package POO;

public class GetAndSet {
    //GET pega
    //SET atribui
    private String email;
    private int senha;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getSenha(){
        return senha;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }


    public static void main(String[] args) {
        GetAndSet teste = new GetAndSet();

        teste.setEmail("javacloundnative@gmail.com");
        teste.setSenha(345523);
        
        System.out.println("E-mail: " + teste.getEmail());
        System.out.println("Senha: " + teste.getSenha());
    }
}
