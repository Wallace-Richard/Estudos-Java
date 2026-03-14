package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate natal = LocalDate.of(2025, 12, 25);
        System.out.println("Natal 2025: " + natal);

        // Usando o enum Month para mais clareza
        LocalDate independencia = LocalDate.of(2025, Month.SEPTEMBER, 7);
        System.out.println("Independência: " + independencia);
    }
}
