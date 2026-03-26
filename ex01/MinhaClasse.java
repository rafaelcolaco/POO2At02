package ex01;
public class MinhaClasse<T> {
    private T dado;

    public MinhaClasse(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }
}
