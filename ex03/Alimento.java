package ex03;

public class Alimento extends ProdutoX {
    private String dataVencimento;

    public Alimento(String nome, double preco, String dataVencimento) {
        super(nome, preco, "Alimento");
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Alimento{nome='" + getNome() + "', preco=" + getPreco() +
               ", dataVencimento='" + dataVencimento + "'}";
    }
}
