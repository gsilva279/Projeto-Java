package InterfacesAndLambda;

public class ExemploMsg {
    public static void main(String[] args) {
        MensagemInterface msg = texto -> System.out.println("Mensagem: " + texto);
        msg.exibir("Olá mundo do Java com expressões Lambda!");
    }
}
