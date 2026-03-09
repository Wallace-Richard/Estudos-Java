package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(20, 0);
    }
    private static int divisao(int a, int b){
        if(a == 0 || b == 0)
        {
            throw new IllegalArgumentException("Numerpo digitado invalido, não pode ser 0");
        }
        return a/b;
    }
}
