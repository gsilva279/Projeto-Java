package InterfacesAndLambda;

public class VerificadorPar {
    public static void main(String[] args) {
        VerificadorInterface verificador = numero -> numero % 2 == 0;

        System.out.println("Verificando: " + verificador.verificar(10));
        System.out.println("Verificando: " + verificador.verificar(7));
    }
}
