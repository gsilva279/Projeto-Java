package JavaCollection.List.CarrinhoCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    //Gets
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    //Set: construtor
    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco =  preco;
        this.quantidade = quantidade;
    }

    //Sobrescrita do método 
    @Override
    public String toString(){
        return "Produto : " + nome +" R$ " + preco + " X " + quantidade;
    }

}
