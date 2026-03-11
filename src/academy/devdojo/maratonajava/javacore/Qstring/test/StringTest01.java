package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Willian";
        String nome2 = "Willian";
        System.out.println(nome1);
        System.out.println(nome1 == nome2);
        String nome3 = new String("Willian");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
