package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 8, 30);
        LocalTime time = LocalTime.of(9, 51);

        LocalDateTime ld = date.atTime(time);
        System.out.println(ld);
    }
}
