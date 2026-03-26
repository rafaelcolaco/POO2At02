package ex03;

public class Eletronico extends ProdutoX {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco, "Eletronico");
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Eletronico{nome='" + getNome() + "', preco=" + getPreco() +
               ", marca='" + marca + "'}";
    }
}
