public class ProdutoPerecivel extends Produtos {
    public String dataVal;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataVal) {
        super(nome, preco, quantidade);
        this.dataVal = dataVal;
    }
}
