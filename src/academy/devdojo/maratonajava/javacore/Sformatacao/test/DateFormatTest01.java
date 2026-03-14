package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();

        // Criando formatadores para cada estilo
        DateFormat[] formatters = new DateFormat[4];
        formatters[0] = DateFormat.getDateInstance(DateFormat.SHORT);
        formatters[1] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        formatters[2] = DateFormat.getDateInstance(DateFormat.LONG);
        formatters[3] = DateFormat.getDateInstance(DateFormat.FULL);

        System.out.println("--- Formatando a mesma data com estilos diferentes ---");
        for (DateFormat df : formatters) {
            System.out.println(df.format(date));
        }
    }
}
