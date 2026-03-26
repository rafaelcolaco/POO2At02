package ex01;

public class MainEx01 {
    public static void main(String[] args) {

        // Tipo String
        MinhaClasse<String> d1 = new MinhaClasse<>("Oi");
        String x = d1.getDado();
        System.out.println("String: " + x);

        // Tipo Integer
        MinhaClasse<Integer> d2 = new MinhaClasse<>(42);
        Integer y = d2.getDado();
        System.out.println("Integer: " + y);

        // Tipo Double
        MinhaClasse<Double> d3 = new MinhaClasse<>(3.14);
        Double z = d3.getDado();
        System.out.println("Double: " + z);

        // Tipo Pessoa
        MinhaClasse<Pessoa> d4 = new MinhaClasse<>(new Pessoa("Rafael", 24));
        Pessoa p = d4.getDado();
        System.out.println("Objeto Pessoa: " + p);
    }
}
