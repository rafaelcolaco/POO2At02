package ex03;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ProdutoX> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public <T extends ProdutoX> void adicionarProduto(T produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    public void mostrarProdutos() {
        System.out.println("\nLista de Produtos do Pedido:");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto no pedido.");
        } else {
            for (ProdutoX p : produtos) {
                System.out.println(p);
            }
        }
        System.out.println("Total de itens: " + produtos.size());
    }
}
