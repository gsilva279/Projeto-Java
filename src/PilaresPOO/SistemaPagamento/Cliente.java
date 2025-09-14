package PilaresPOO.SistemaPagamento;
import java.util.Scanner;

import PilaresPOO.SistemaPagamento.FormasPagamento.Pagamento;
import PilaresPOO.SistemaPagamento.FormasPagamento.PagamentoBoleto;
import PilaresPOO.SistemaPagamento.FormasPagamento.PagamentoCatao;
import PilaresPOO.SistemaPagamento.FormasPagamento.PagamentoPix;


class Cliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pagamento pagamento = null;

        System.out.println("Informe o valor do pagamento: ");
        double valor = input.nextDouble();

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Boleto");
        System.out.println("3 - Pix");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                pagamento = new PagamentoCatao();
                break;
            case 2:
                pagamento = new PagamentoBoleto();
                break;
            case 3:
                pagamento = new PagamentoPix();
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
                break;
        }

        pagamento.pagar(valor);
        input.close();
    }
}