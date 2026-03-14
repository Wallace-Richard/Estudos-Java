package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil,' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        Date now = new Date();
        String formattedDate = sdf.format(now);

        System.out.println("Data formatada com padrão customizado:");
        System.out.println(formattedDate);
    }
}
