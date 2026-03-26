package ex02;
import java.time.LocalDate;

public class MainEx02 {
    public static void main(String[] args) {

        // Cliente antigo: id como Integer
        Produto<Integer> p1 = new Produto<>(
            1,
            15.90,
            LocalDate.of(2002, 2, 15),
            LocalDate.of(2026, 3, 27)
        );
        System.out.println("Produto com id Integer: " + p1);

        // Novo cliente: id como String
        Produto<String> p2 = new Produto<>(
            "PROD-001",
            29.90,
            LocalDate.of(2002, 2, 15),
            LocalDate.of(2026, 3, 27)
        );
        System.out.println("Produto com id String:   " + p2);
    }
}
