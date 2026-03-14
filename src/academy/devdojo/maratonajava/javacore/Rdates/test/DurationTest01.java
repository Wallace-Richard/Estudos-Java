package academy.devdojo.maratonajava.javacore.Rdates.test;


import java.time.Duration;

public class DurationTest01 {
    public static void main(String[] args) {

        Duration d = Duration.ofDays(System.nanoTime());
        System.out.println(d);
    }
}
