package ex03;

public class MainEx03 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Alimento arroz = new Alimento("Arroz 5kg", 25.90, "12/2026");
        Alimento feijao = new Alimento("Feijão 1kg", 9.50, "08/2026");
        Eletronico celular = new Eletronico("Celular", 349.90, "Samsung");

        pedido.adicionarProduto(arroz);
        pedido.adicionarProduto(feijao);
        pedido.adicionarProduto(celular);

        pedido.mostrarProdutos();
    }
}
