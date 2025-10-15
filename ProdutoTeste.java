import java.util.ArrayList;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produtos p1 = new Produtos("Caneta", 2.35, 4);
        Produtos p2 = new Produtos("Borracha" , 2.50, 2);
        ProdutoPerecivel p3 = new ProdutoPerecivel("Biscoito" , 3.60, 5 , "26-12-25");

        ArrayList <Produtos> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        System.out.println(produtos.size());
        System.out.println(produtos.get(2));
    }
}
