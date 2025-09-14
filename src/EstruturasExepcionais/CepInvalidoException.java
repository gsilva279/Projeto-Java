package EstruturasExepcionais;

public class CepInvalidoException extends Exception {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23448147");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (Exception e) {
           System.out.println("O cep não corresponde as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
