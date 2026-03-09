package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarArquivo();
    }
    private static void criarArquivo (){
        File file = new File("arquivo/test.txt");
        try
        {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso " + file);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
