package ex04;
public class Par<V> {
    private String chave;
    private V valor;

    public Par(String chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public String getChave() { return chave; }
    public V getValor() { return valor; }

    @Override
    public String toString() {
        return "Par{chave='" + chave + "', valor=" + valor + "}";
    }
}
