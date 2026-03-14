package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        double valor = 123_456.789;

        // Definindo locales para diferentes regiões
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeUS = Locale.US;

        // Criando formatadores para cada locale
        NumberFormat[] formatters = new NumberFormat[4];
        formatters[0] = NumberFormat.getInstance(localeBR);
        formatters[1] = NumberFormat.getInstance(localeJP);
        formatters[2] = NumberFormat.getInstance(localeIT);
        formatters[3] = NumberFormat.getInstance(localeUS);

        System.out.println("--- Formatando Números ---");
        for (NumberFormat nf : formatters) {
            System.out.println(nf.format(valor));
        }
    }
}
