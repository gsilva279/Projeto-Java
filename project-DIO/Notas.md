# NOTAS DO CÓDIGO

```java
public class MinhaClass {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis
        String primeiroNome = "José";
        String segundoNome = "Silva";

        // Chamada do método nomeCompleto e armazenamento do resultado
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Impressão do nome completo no console
        System.out.println(nomeCompleto);
    }

    // Método que concatena o primeiro e segundo nome
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
