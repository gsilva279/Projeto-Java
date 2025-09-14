package PilaresPOO.SistemaPagamento.FormasPagamento;

public class PagamentoCatao implements Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$ " + valor + " realizado no cartão de crédito.");
    }
}
