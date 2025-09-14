package InterfacesAndLambda;
import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        Consumer<String> imprimir = texto -> System.out.println("Texto: " + texto);
        imprimir.accept("Aprendendo Java com Interface Funcinal prontras!!");
    }
}
