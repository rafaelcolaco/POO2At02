package ex04;
import java.util.ArrayList;
import java.util.List;

public class Dicionario<V> {
    private List<Par<V>> lista;

    public Dicionario() {
        this.lista = new ArrayList<>();
    }

    public boolean add(String chave, V valor) {
        for (Par<V> par : lista) {
            if (par.getChave().equals(chave)) {
                return false;
            }
        }
        lista.add(new Par<>(chave, valor));
        return true;
    }

    public Par<V> buscar(String chave) {
        for (Par<V> par : lista) {
            if (par.getChave().equals(chave)) {
                return par;
            }
        }
        return null;
    }
}
