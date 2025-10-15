import java.util.ArrayList;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome do produto é:" + nome + "" +
                ", Custa:" + preco +
                ", Temos no estoque:" + quantidade +
                '}';
    }
    

}
