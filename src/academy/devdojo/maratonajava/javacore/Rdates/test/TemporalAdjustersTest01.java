package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.util.Scanner;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the day of the week (1-7): ");
        int numWeek = in.nextInt();

        nextDay(numWeek);
    }

    public static void nextDay(int num){
        DayOfWeek dayOfWeek = DayOfWeek.of(num);
        DayOfWeek weekDay;

        switch (dayOfWeek)
            {
                case FRIDAY, SATURDAY: weekDay = DayOfWeek.MONDAY; break;
                default: weekDay = dayOfWeek.plus(1); break;
            }
        System.out.println("\nNext business day is " + weekDay);
    }
}
