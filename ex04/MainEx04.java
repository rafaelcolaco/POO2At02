package ex04;
public class MainEx04 {
    public static void main(String[] args) {
        Dicionario<Integer> dicionario = new Dicionario<>();

        // Adicionando chaves novas
        boolean r1 = dicionario.add("idade", 24);
        System.out.println("Inseriu idade = " + r1);

        boolean r2 = dicionario.add("ano", 2026);
        System.out.println("Inseriu ano = " + r2);
        
        boolean r3 = dicionario.add("nota", 10);
        System.out.println("Inseriu nota = " + r3);

        // Tentando adicionar chave duplicada
        boolean r4 = dicionario.add("idade", 99);
        System.out.println("Inseriu idade novamente = " + r4);

        boolean r5 = dicionario.add("ano", 2000);
        System.out.println("Inseriu ano novamente = " + r5);

        System.out.println();

        // Busca por chave existente
        Par<Integer> encontrado = dicionario.buscar("idade");
        System.out.println("Busca por idade: " + encontrado);

        Par<Integer> encontrado2 = dicionario.buscar("nota");
        System.out.println("Busca por nota:  " + encontrado2);

        // Busca por chave inexistente
        Par<Integer> naoEncontrado = dicionario.buscar("gato");
        System.out.println("Busca por chave errada: " + naoEncontrado);
    }
}
