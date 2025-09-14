package Sintaxe;

public class MinhaClass {
    public static void main (String [] args) {
       String primeiroNome =  "José";
       String segundoNome = "Silva";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

       System.out.println(nomeCompleto);
    }

    //Uso de métodos
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}




