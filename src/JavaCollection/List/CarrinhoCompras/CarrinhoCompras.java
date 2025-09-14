package JavaCollection.List.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoCompras {
    // Atributo ou ArrayLIst
    private List<Item> CarrinhoCompras;

    // Instacia a objeto e cria a uma lista vazia
    public CarrinhoCompras() {
        this.CarrinhoCompras = new ArrayList<>();
    }

    // Métodos
    public void adicionarItem(String nome, double preco, int quantidade) {
        // Adicionando a carrinhoCompras nome, preço e quantidade
        CarrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> intemsRemover = new ArrayList<>();

        if (!CarrinhoCompras.isEmpty()) {
            for (Item I : CarrinhoCompras) {
                if (I.getNome().equalsIgnoreCase(nome)) {
                    intemsRemover.add(I);
                }
            }
            CarrinhoCompras.removeAll(intemsRemover);
        } else {
            System.out.println("O carrinho de compras está vázio!");
        }
    }

    // Calcula o valor total do carrinho
    public double calcularValorTotal() {
        // variavel para armazenar o valor total do carrinho
        double valorTotal = 0;

        for (Item item : CarrinhoCompras) {
            // adicionando itens no carrinho - use o operador += e chame a class
            // CarrinhoCompras instanciada pelo construtor
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    // Exibe os itens do carrinho:
    public void exibirItens() {
        // if-else que testa se o carrinho está vazio
        if (CarrinhoCompras.isEmpty()) {
            System.out.println("Carrinho está vazio!");
        } else {
            // for-each para percorrer os itens no carrinho e exibir os itens
            for (Item itemCarrinho : CarrinhoCompras) {
                System.out.println(itemCarrinho);
            }
        }
    }

    // Método main para testes:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarrinhoCompras compras = new CarrinhoCompras();

        System.out.println();
        System.out.println("=============== On Magazine Store ==================");
        System.out.println("Informe a quantidade de intens do carrinho: ");
        int escolha = input.nextInt();
        input.nextLine();

        // for para adicionar itens
        for (int i = 0; i < escolha; i++) {

            System.out.println("Informe o nome do item: ");
            String nome = input.nextLine();

            System.out.println("Informe o preço do item: ");
            double preco = input.nextDouble();

            System.out.println("Informe a quantidade do item: ");
            int quantidade = input.nextInt();
            input.nextLine(); 
            
            // Adicionando itens ao carrinho
            compras.adicionarItem(nome, preco, quantidade);
        }

        //exibindo o carrinho e preço final
        compras.exibirItens();
        System.out.println("Preço final: R$ " + compras.calcularValorTotal());

        //Removendo intens do carrinho
        System.out.println("Informe um item para remover do carrinho: ");
        String remover = input.nextLine();
        input.nextLine();

        compras.removerItem(remover);
        System.out.println("Item " + remover + " removido.");

        //itens exibidos após remoção de itens e seu valor total
        compras.exibirItens();
        System.out.println("Preço final: R$ " + compras.calcularValorTotal());


    }

}
